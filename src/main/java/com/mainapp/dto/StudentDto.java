package com.mainapp.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class StudentDto {

    	
	@Min(value = 1, message = "Roll cannot be Less than 1")
	@Max(value=100000, message="Roll cannot be more than 100000")
	private int roll;

	@NotEmpty(message = "Name can't be empty")
	@NotBlank(message = "Name can't be Blank")
	@Size(min=2, max=50, message= "invalid name length")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name must contain only alphabet")
	private String name;
 
	@NotNull(message="Can't be Empty")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past(message="Date of birth must be a past date")
	private LocalDate dob; // Changed to LocalDate
	
	@NotEmpty(message = "Name can't be empty")
	@NotBlank(message = "Name can't be Blank")
	@Size(min=2, max=50, message= "invalid name length")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name must contain only alphabet")
	private String fatherName;

	@NotEmpty(message = "contact can't be empty")
	@NotBlank(message = "contact can't be Blank")
	@Size(min=2, max=15, message= "contact name length")
	private String contact;

	@NotEmpty(message = "contact can't be empty")
	@NotBlank(message = "contact can't be Blank")
	@Size(min=2, max=15, message= "contact name length")
	private String whatsapp;

	@NotEmpty(message = "gmailId can't be empty")
	@NotBlank(message = "gmailId can't be Blank")
	@Size(min=2, max=60, message= "gmailId name length")
	private String gmailId;

	@NotEmpty(message = "highestQualification can't be empty")
	@NotBlank(message = "highestQualification can't be Blank")
	@Size(min=2, max=100, message= "highestQualification name length")
	private String highestQualification;

	@NotNull(message="DateOfAdmission Can't be Empty")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfAdmission;
	
	@NotNull(message="DatchStartDate Can't be Empty")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate batchStartDate; // Changed to LocalDate
	
	@NotNull(message="DatchEndDate Can't be Empty")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate batchEndDate; // Changed to LocalDate
	
	@NotEmpty(message = "completedModule can't be empty")
	@NotBlank(message = "completedModule can't be Blank")
	@Size(min=2, max=50, message= "completedModule name length")
	private String completedModule;
	
	@NotEmpty(message = "collegeName can't be empty")
	@NotBlank(message = "collegeName can't be Blank")
	@Size(min=2, max=100, message= "collegeName name length")
	private String collegeName;
	
	@NotEmpty(message = "courseName can't be empty")
	@NotBlank(message = "courseName can't be Blank")
	@Size(min=2, max=100, message= "courseName name length")
	private String courseName;
	
	@NotEmpty(message = "courseDuration can't be empty")
	@NotBlank(message = "courseDuration can't be Blank")
	@Size(min=2, max=100, message= "courseDuration name length")
	private String courseDuration;
	
	@Min(value = 1, message = "basePrice cannot be Less than 1")
	@Max(value=100000, message="basePrice cannot be more than 100000")
	private int basePrice;

	@Min(value = 1, message = "paid cannot be Less than 1")
	@Max(value=100000, message="paid cannot be more than 100000")
	private int paid;

	@Min(value = 0, message = "pending cannot be Less than 1")
	@Max(value=100000, message="pending cannot be more than 100000")
	private int pending;

	@NotEmpty(message = "ref can't be empty")
	@NotBlank(message = "ref can't be Blank") 
	@Size(min=2, max=100, message= "ref name length")
	private String ref;
	
	@NotEmpty(message = "note can't be empty")
	@NotBlank(message = "note can't be Blank")
	@Size(min=4, max=5000, message= "note name length")
	private String note;
}
