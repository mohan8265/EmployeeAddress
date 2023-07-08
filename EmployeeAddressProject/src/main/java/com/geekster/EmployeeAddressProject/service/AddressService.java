package com.geekster.EmployeeAddressProject.service;

import com.geekster.EmployeeAddressProject.model.Address;
import com.geekster.EmployeeAddressProject.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address saved";
    }
    public List<Address> getAllAddresses() {
        return (List<Address>) addressRepo.findAll();
    }

    public Address getAddress(Long id) {
        return addressRepo.findById(id).get();
    }

    public String updateAddress(Long id, Address address) {
        address.setAddId(id);
        addressRepo.save(address);
        return "Address updated";
    }

    public String deleteAddress(Long id) {
        addressRepo.deleteById(id);
        return "Address deleted";
    }
}
