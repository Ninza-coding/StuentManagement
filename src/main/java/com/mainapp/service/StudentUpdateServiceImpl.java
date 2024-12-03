package com.mainapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.dao.StudentUpdateRepository;
import com.mainapp.dto.StudentDto;
import com.mainapp.model.StudentData;

@Service
public class StudentUpdateServiceImpl implements StudentUpdateService {

    @Autowired
    private StudentUpdateRepository studentUpdateRepository;

    @SuppressWarnings("unused")
    @Override
    public String updatestudent(int id, StudentDto studentDto) {

        Optional<StudentData> std = studentUpdateRepository.findById(id);
        if (!std.isPresent()) {
            return "Student Not Found";
        } else {
            StudentData studentData = std.get();
            if (studentDto.getRoll() != 0) {
                studentData.setRoll(studentDto.getRoll());
            }
            if (studentDto.getName() != null && !studentDto.getName().isEmpty()) {
                studentData.setName(studentDto.getName());
            }

            if (studentDto.getDob() != null) {
                studentData.setDob(studentDto.getDob());
            }

            if (studentDto.getFatherName() != null && !studentDto.getFatherName().isEmpty()) {
                studentData.setFatherName(studentDto.getFatherName());
            }

            if (studentDto.getContact() != null && !studentDto.getContact().isEmpty()) {
                studentData.setContact(studentDto.getContact());
            }

            if (studentDto.getWhatsapp() != null && !studentDto.getWhatsapp().isEmpty()) {
                studentData.setWhatsapp(studentDto.getWhatsapp());
            }

            if (studentDto.getGmailId() != null && !studentDto.getGmailId().isEmpty()) {
                studentData.setGmailId(studentDto.getGmailId());
            }

            if (studentDto.getHighestQualification() != null && !studentDto.getHighestQualification().isEmpty()) {
                studentData.setHighestQualification(studentDto.getHighestQualification());
            }

            if (studentDto.getDateOfAdmission() != null) {
                studentData.setDateOfAdmission(studentDto.getDateOfAdmission());
            }

            if (studentDto.getBatchStartDate() != null) {
                studentData.setBatchStartDate(studentDto.getBatchStartDate());
            }

            if (studentDto.getBatchEndDate() != null) {
                studentData.setBatchEndDate(studentDto.getBatchEndDate());
            }

            if (studentDto.getCompletedModule() != null && !studentDto.getCompletedModule().isEmpty()) {
                studentData.setCompletedModule(studentDto.getCompletedModule());
            }

            if (studentDto.getCollegeName() != null && !studentDto.getCollegeName().isEmpty()) {
                studentData.setCollegeName(studentDto.getCollegeName());
            }

            if (studentDto.getCourseName() != null && !studentDto.getCourseName().isEmpty()) {
                studentData.setCourseName(studentDto.getCourseName());
            }

            if (studentDto.getCourseDuration() != null && !studentDto.getCourseDuration().isEmpty()) {
                studentData.setCourseDuration(studentDto.getCourseDuration());
            }

            if (studentDto.getBasePrice() != 0) {
                studentData.setBasePrice(studentDto.getBasePrice());
            }

            if (studentDto.getPaid() != 0) {
                studentData.setPaid(studentDto.getPaid());
            }

            if (studentDto.getPending() != 0) {
                studentData.setPending(studentDto.getPending());
            }

            if (studentDto.getRef() != null && !studentDto.getRef().isEmpty()) {
                studentData.setRef(studentDto.getRef());
            }

            if (studentDto.getNote() != null && !studentDto.getNote().isEmpty()) {
                studentData.setNote(studentDto.getNote());
            }

            // Save the updated studentData back to the repository
            StudentData save = studentUpdateRepository.save(studentData);
            if (save != null) {
                return "Student Data Updated";
            } else {
                return "Failed To Update";
            }
        }
    }
}