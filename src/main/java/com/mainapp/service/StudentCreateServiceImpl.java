package com.mainapp.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.dao.StudentCreateRepository;
import com.mainapp.dto.StudentDto;
import com.mainapp.model.StudentData;

@Service
public class StudentCreateServiceImpl implements StudentCreateService{
 
    @Autowired
    private StudentCreateRepository studentCreateRepository;

    @Override
    public StudentData addStudent(StudentDto studentDto){
        
        ModelMapper modelMapper=new ModelMapper();

        PropertyMap<StudentDto, StudentData> propertyMap= new PropertyMap<StudentDto,StudentData>() {
            @Override
            protected void configure() {
                skip(destination.getId());
            }
        };
        modelMapper.addMappings(propertyMap);
        StudentData studentData= modelMapper.map(studentDto, StudentData.class);
        
        return studentCreateRepository.save(studentData);
    }
}
