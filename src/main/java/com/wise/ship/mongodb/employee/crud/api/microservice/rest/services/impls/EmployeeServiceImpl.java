package com.wise.ship.mongodb.employee.crud.api.microservice.rest.services.impls;

import com.wise.ship.mongodb.employee.crud.api.microservice.rest.mongo.documents.EmployeeDocument;
import com.wise.ship.mongodb.employee.crud.api.microservice.rest.repositories.EmployeeRepository;
import com.wise.ship.mongodb.employee.crud.api.microservice.rest.services.EmployeeService;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ServletContextAware;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService, ServletContextAware {

    @Autowired
    private EmployeeRepository employeeRepository;

    private ServletContext context;

    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }

    @Override
    public List<EmployeeDocument> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeDocument saveEmployee(EmployeeDocument employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeDocument getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public EmployeeDocument updateEmployee(EmployeeDocument employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
