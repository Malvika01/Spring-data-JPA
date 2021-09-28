package com.malvika.springboot.generators.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
public class Employee {
	
	@TableGenerator(name="employee_gen", table ="id_gen", pkColumnName="id_name", valueColumnName="id_value",allocationSize=50)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="employee_gen")
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
