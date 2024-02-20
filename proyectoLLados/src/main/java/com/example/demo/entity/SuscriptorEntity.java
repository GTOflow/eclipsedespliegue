package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="suscriptors")
public class SuscriptorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable= false)
	private String name;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="price", nullable=true)
	private double price;
	
	@Column(name="date", nullable=false)
	private LocalDate date;
	
	@Column(name="process",nullable=false)
	private boolean process;
}
