package com.zamayi.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="ms")
public class Mission {

	public Mission() {}
	
	@Id
	private String id;
	
	private String fullName;
	
	private String email;
	
	private String managerEmail;
	
}
