package com.te.thymleafproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
 
	private String userName;
	private String userEmail;
	private String userPhoneNumber;
}
