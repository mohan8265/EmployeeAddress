# Employee Address

## Framework and language used 
* Spring Boot
* Java
---
## Data flow
1. controller 
    * AddressController
    * EmployeeController
2. model
    * Address
    * Employee
3. service
    * AddressService
    * EmployeeService
4. repository
    * IAddressRepo
    * IEmployeeRepo

---

## Data Structure Used
* MySQL

---

```In this project I made two models Address and Employee. we can do CRUD(create, read, update, delete) operations on both. here I have applied OneToOne mapping in Employee model with Address so Address can refers to Employee.```
