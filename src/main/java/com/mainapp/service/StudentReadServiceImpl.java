package com.mainapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.dao.StudentReadRepository;
import com.mainapp.model.StudentData;

@Service
public class StudentReadServiceImpl implements StudentReadService {

    @Autowired
    private StudentReadRepository studentReadRepository;

    @Override
    public List<StudentData> findAll() {
        return studentReadRepository.findAll();
    }

    @Override
    public StudentData findById(int id) {
        return studentReadRepository.findById(id);
    }

    @Override
    public StudentData findByRoll(int roll) {
        return studentReadRepository.findByRoll(roll);
    }

    @Override
    public StudentData findByContact(String contact) {
        return studentReadRepository.findByContact(contact);
    }

    @Override
    public List<StudentData> findByName(String name) {
        return studentReadRepository.findByName(name);
    }

    @Override
    public List<StudentData> pendingFee() {
        return studentReadRepository.pendingFee();
    }

    @Override
    public List<StudentData> completedFee() {
        return studentReadRepository.completedFee();
    }
    // chatgpt promt : write a controller for above service my data is coming from
    // postman
}
