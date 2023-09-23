package com.wise.ship.mongodb.employee.crud.api.microservice.rest.services;

import com.wise.ship.mongodb.employee.crud.api.microservice.rest.entities.Employee;
import com.wise.ship.mongodb.employee.crud.api.microservice.rest.mongo.documents.EmployeeDocument;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDocument> getAllEmployees();

    EmployeeDocument saveEmployee(EmployeeDocument employee);

    EmployeeDocument getEmployeeById(Long id);

    EmployeeDocument updateEmployee(EmployeeDocument employee);

    void deleteEmployeeById(Long id);
}
