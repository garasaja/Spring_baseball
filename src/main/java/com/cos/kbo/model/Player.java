package com.cos.kbo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private int id;
	
	@OneToOne
	@JoinColumn(name = "stardium")
	private Stardium stardium;
	
	@ManyToOne
	@JoinColumn(name = "team")
	private Team team;
	
	private String name;
	private String number;
	private String position;
}
