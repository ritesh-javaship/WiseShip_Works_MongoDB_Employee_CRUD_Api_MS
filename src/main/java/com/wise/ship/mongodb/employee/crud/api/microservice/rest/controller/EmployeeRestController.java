package com.wise.ship.mongodb.employee.crud.api.microservice.rest.controller;

import com.wise.ship.mongodb.employee.crud.api.microservice.rest.entities.Employee;
import com.wise.ship.mongodb.employee.crud.api.microservice.rest.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/micro-service/serverOne")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    // handler method to handle list employees and return mode and view
    @GetMapping("/employees")
    public List<Employee> listEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees/save")
    public String saveEmployee(@Valid @RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return "TRUE";
    }

    @GetMapping("/employees/{id}")
    public Employee editEmployeeForm(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employees/update/{id}")
    public String updateEmployee(@PathVariable Long id,
                                @RequestBody Employee employee) {

        // get employee from database by id
        Employee existingEmployee = employeeService.getEmployeeById(id);
        existingEmployee.setId(id);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());

        // save updated employee object
        employeeService.updateEmployee(existingEmployee);
        return "TRUE";
    }

    // handler method to handle delete employee request

    @DeleteMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
        return "TRUE";
    }

}
