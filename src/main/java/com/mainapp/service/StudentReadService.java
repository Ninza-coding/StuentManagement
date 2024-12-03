package com.mainapp.service;

import java.util.List;

import com.mainapp.model.StudentData;

public interface StudentReadService {

    List<StudentData> findAll();

    StudentData findById(int id);

    StudentData findByRoll(int roll);

    StudentData findByContact(String contact);

    List<StudentData> findByName(String name);

    List<StudentData> pendingFee();

    List<StudentData> completedFee();
}
