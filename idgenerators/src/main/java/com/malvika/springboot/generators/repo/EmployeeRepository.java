package com.malvika.springboot.generators.repo;

import org.springframework.data.repository.CrudRepository;

import com.malvika.springboot.generators.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
