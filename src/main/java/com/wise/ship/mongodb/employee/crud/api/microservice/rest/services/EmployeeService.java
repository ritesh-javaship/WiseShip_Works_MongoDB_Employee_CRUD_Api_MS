package com.wise.ship.mongodb.employee.crud.api.microservice.rest.services;

import com.wise.ship.mongodb.employee.crud.api.microservice.rest.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);
}
