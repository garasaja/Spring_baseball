package com.cos.kbo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Stardium {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private int id;
	
	String place;
 
}
