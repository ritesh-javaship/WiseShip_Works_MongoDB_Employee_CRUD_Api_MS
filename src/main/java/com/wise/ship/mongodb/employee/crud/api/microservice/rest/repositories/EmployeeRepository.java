package com.wise.ship.mongodb.employee.crud.api.microservice.rest.repositories;

import com.wise.ship.mongodb.employee.crud.api.microservice.rest.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
