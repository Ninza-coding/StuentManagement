package com.mainapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.dao.StudentDeleteRepository;

@Service
public class StudentDeleteServiceImpl implements StudentDeleteService {

    @Autowired
    private StudentDeleteRepository studentDeleteRepository;
    @Override
    public int deleteStudentByRoll(int roll) {
        return studentDeleteRepository.deleteByRoll(roll);
    }

}
