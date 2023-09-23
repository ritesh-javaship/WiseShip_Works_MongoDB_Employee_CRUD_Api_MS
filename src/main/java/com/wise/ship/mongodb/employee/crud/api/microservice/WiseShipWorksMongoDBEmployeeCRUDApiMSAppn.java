package com.wise.ship.mongodb.employee.crud.api.microservice;

import com.mongodb.Block;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {"com.wise.ship.mongodb.employee.crud.api.microservice"},
        exclude = {DataSourceAutoConfiguration.class})
@EnableMongoRepositories
@EntityScan
@EnableJpaRepositories
@EnableWebMvc
//@Configuration(enforceUniqueMethods = false)
public class WiseShipWorksMongoDBEmployeeCRUDApiMSAppn {

    public static void main(String[] args) {
        SpringApplication.run(WiseShipWorksMongoDBEmployeeCRUDApiMSAppn.class, args);
    }


}
