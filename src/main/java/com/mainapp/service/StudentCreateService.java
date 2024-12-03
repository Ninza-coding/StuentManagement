package com.mainapp.service;

import com.mainapp.dto.StudentDto;
import com.mainapp.model.StudentData;


public interface StudentCreateService {
 
    public StudentData addStudent(StudentDto studentDto);
}
