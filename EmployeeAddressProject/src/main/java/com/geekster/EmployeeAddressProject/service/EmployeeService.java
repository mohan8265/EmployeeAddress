package com.geekster.EmployeeAddressProject.service;

import com.geekster.EmployeeAddressProject.model.Employee;
import com.geekster.EmployeeAddressProject.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo employeeRepo;

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee Added";
    }

    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepo.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepo.findById(id).get();
    }

    public String updateEmployee(Long id, Employee employee) {
        employee.setEmpId(id);
        employeeRepo.save(employee);
        return "Employee updated";
    }

    public String deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
        return "Employee deleted";
    }
}
