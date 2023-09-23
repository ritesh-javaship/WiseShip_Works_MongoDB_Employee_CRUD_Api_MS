package com.wise.ship.mongodb.employee.crud.api.microservice.response.error;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ErrorResponseDTO {

    private Throwable exception;
    private String webRequestDescription;
    private HttpStatus httpStatus;
    private String exceptionMessage;
    private LocalDateTime createdDate;

    public ErrorResponseDTO(Throwable exception, String webRequestDescription, HttpStatus httpStatus, String exceptionMessage, LocalDateTime createdDate) {
        this.exception = exception;
        this.webRequestDescription = webRequestDescription;
        this.httpStatus = httpStatus;
        this.exceptionMessage = exceptionMessage;
        this.createdDate = createdDate;
    }
}
