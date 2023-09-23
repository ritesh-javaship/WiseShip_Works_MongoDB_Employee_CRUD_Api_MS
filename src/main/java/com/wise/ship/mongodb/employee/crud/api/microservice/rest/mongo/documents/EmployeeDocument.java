package com.wise.ship.mongodb.employee.crud.api.microservice.rest.mongo.documents;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.relational.core.mapping.Table;


//import javax.persistence.Id;

@Document(collection = "employee")
public class EmployeeDocument {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    public EmployeeDocument() {

    }

    public EmployeeDocument(String firstName, String lastName, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
