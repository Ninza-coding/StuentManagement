package com.mainapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.model.StudentData;

import jakarta.transaction.Transactional;

@Repository
public interface StudentDeleteRepository extends JpaRepository<StudentData, Integer>{

    @Transactional
    int deleteByRoll(int roll);

}
