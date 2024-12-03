package com.mainapp.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mainapp.dto.StudentDto;
import com.mainapp.model.StudentData;
import com.mainapp.service.StudentCreateService;
import com.mainapp.service.StudentDeleteService;
import com.mainapp.service.StudentReadService;
import com.mainapp.service.StudentUpdateService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentCreateService studentCreateService;

    @Autowired
    private StudentReadService studentReadService;

    @Autowired
    private StudentDeleteService studentDeleteService;

    @Autowired
    public StudentUpdateService studentUpdateService;

    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@Valid @RequestBody StudentDto studentDto,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            for (FieldError error : bindingResult.getFieldErrors()) {

                hashMap.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity<>(hashMap, HttpStatus.BAD_REQUEST);
        }

        else {
            StudentData studentData = studentCreateService.addStudent(studentDto);

            return new ResponseEntity<>(studentData, HttpStatus.CREATED);
        }
    }

    // Get all students
    @GetMapping("/read/all")
    public List<StudentData> getAllStudents() {
        return studentReadService.findAll();
    }

    // Get student by ID
    @GetMapping("/read/{id}")
    public StudentData getStudentById(@PathVariable int id) {
        return studentReadService.findById(id);
    }

    // Get student by Roll Number
    @GetMapping("/read/roll/{roll}")
    public StudentData getStudentByRoll(@PathVariable int roll) {
        return studentReadService.findByRoll(roll);
    }

    // Get student by Contact
    @GetMapping("/read/contact/{contact}")
    public StudentData getStudentByContact(@PathVariable String contact) {
        return studentReadService.findByContact(contact);
    }

    // Get students by Name
    @GetMapping("/read/name/{name}")
    public List<StudentData> getStudentsByName(@PathVariable String name) {
        return studentReadService.findByName(name);
    }

    // Get students with pending fee
    @GetMapping("/read/pending-fee")
    public List<StudentData> getPendingFeeStudents() {
        return studentReadService.pendingFee();
    }

    // Get students with completed fee
    @GetMapping("/read/completed-fee")
    public List<StudentData> getCompletedFeeStudents() {
        return studentReadService.completedFee();
    }

    @DeleteMapping("/delete/roll/{roll}")
    public ResponseEntity<String> deleteStudentByRoll(@PathVariable int roll) {
        int deleteStudentByRololl = studentDeleteService.deleteStudentByRoll(roll);

        if (deleteStudentByRololl == 1) {
            return new ResponseEntity<>("Student Deleted Successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Failed to Delete", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/updateStudent/id/{id}")
    public ResponseEntity<String> updateStudent(@RequestBody StudentDto studentDto, @PathVariable int id) {
        String result = studentUpdateService.updatestudent(id, studentDto);
        if (result.equals("Student Data Updated")) {
            return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
        } else if (result.equals("Failed To Update")) {
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
    }
}