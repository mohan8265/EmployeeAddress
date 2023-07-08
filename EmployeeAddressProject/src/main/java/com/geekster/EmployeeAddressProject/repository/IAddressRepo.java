package com.geekster.EmployeeAddressProject.repository;

import com.geekster.EmployeeAddressProject.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Long> {
}
