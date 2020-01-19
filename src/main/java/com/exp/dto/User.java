package com.exp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@Getter
@Setter
public class User {

	private String name;
	private String postalCode;
	private int age;
	
	
	
	
	
}
