package com.zamayi.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="employees")
public class Employee {

	public Employee() {}
	
	@Id
	private String id;
	
	private String fullName;
	
	private String email;
	
	private String managerEmail;
	
}
