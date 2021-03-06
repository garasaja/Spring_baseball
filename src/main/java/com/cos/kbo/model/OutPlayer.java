package com.cos.kbo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cos.kbo.model.Player.PlayerBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class OutPlayer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private int id;
	private String name;
	private String number;
	private String position;
	private String reason;
	private Timestamp outDate;
}
