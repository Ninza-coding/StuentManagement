package com.mainapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mainapp.model.StudentData;

@Repository
public interface StudentReadRepository extends JpaRepository<StudentData, Integer> {

    @SuppressWarnings("null")
    @Override
    List<StudentData> findAll();

    StudentData findById(int id);

    StudentData findByRoll(int roll);

    StudentData findByContact(String contact);

    List<StudentData> findByName(String name);

    @Query(value = "Select * from studentdata where pending>0 ", nativeQuery = true)
    List<StudentData> pendingFee();

    @Query(value = "Select * from studentdata where pending=0 ", nativeQuery = true)
    List<StudentData> completedFee();
}