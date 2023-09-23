package com.wise.ship.mongodb.employee.crud.api.microservice.rest.repositories;

import com.wise.ship.mongodb.employee.crud.api.microservice.rest.mongo.documents.EmployeeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeDocument, Long> {

}
