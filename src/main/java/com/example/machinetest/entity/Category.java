package com.example.machinetest.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity // for creating table in database
@Data // lombok annotation for const getter setter
public class Category {
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for id auto_increment
	private Long id;

	private String name;

}
