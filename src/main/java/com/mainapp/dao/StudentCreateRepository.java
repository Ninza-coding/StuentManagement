package com.mainapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.model.StudentData;

@Repository
public interface StudentCreateRepository extends JpaRepository<StudentData, Integer>{
 
}
