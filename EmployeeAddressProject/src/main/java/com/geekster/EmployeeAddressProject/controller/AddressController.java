package com.geekster.EmployeeAddressProject.controller;

import com.geekster.EmployeeAddressProject.model.Address;
import com.geekster.EmployeeAddressProject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;
    @PostMapping("/addresses")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @GetMapping("/addresses")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }
    @GetMapping("/addresses/{id}")
    public Address getAddress(@PathVariable Long id){
        return addressService.getAddress(id);
    }
    @PutMapping("/addresses/{id}")
    public String updateAddress(@PathVariable Long id,@RequestBody Address address){
        return addressService.updateAddress(id,address);
    }
    @DeleteMapping("/addresses/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }

}
