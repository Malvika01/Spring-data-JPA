package com.malvika.springboot.generators;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.malvika.springboot.generators.entities.Employee;
import com.malvika.springboot.generators.repo.EmployeeRepository;

@SpringBootTest
class IdgeneratorsApplicationTests {
	
	@Autowired
	EmployeeRepository er;

	@Test
	void testGenerator() {
		Employee employee = new Employee();
		employee.setName("Malvika");
		
		er.save(employee);
	}

}
