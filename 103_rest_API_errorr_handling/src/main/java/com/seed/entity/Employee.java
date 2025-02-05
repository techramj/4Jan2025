package com.seed.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(max = 10, min = 3, message = "name should be min 2 char and max 10 char")
	private String name;
	
	@PositiveOrZero
	private double salary;

}
