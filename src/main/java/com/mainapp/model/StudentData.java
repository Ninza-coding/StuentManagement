package com.mainapp.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studentdata")
public class StudentData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private int roll;

	@Column(length = 50)
	private String name;
 
	private LocalDate dob; // Changed to LocalDate

	@Column(length = 50)
	private String fatherName;

	@Column(length = 15, unique = true)
	private String contact;

	@Column(length = 15, unique= true)
	private String whatsapp;

	@Column(length = 60, unique = true)
	private String gmailId;

	@Column(length = 100)
	private String highestQualification;

	private LocalDate dateOfAdmission;
	
	private LocalDate batchStartDate; // Changed to LocalDate
	
	private LocalDate batchEndDate; // Changed to LocalDate
	
	@Column(length = 50)
	private String completedModule;
	
	@Column(length = 100)
	private String collegeName;
	
	@Column(length = 50)
	private String courseName;

	@Column(length = 50)
	private String courseDuration;
	
	private int basePrice;
	
	private int paid;

	private int pending;

	@Column(length = 100)
	private String ref;

	@Column(length = 5000)
	private String note;
}
