package com.geekster.EmployeeAddressProject.repository;

import com.geekster.EmployeeAddressProject.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
}
