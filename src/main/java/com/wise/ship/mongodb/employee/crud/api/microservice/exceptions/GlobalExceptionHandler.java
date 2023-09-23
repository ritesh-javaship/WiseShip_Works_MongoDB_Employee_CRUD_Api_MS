package com.wise.ship.mongodb.employee.crud.api.microservice.exceptions;

import com.wise.ship.mongodb.employee.crud.api.microservice.response.error.ErrorResponseDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDTO> handleGLobalException(ResourceNotFoundException exception, WebRequest webRequest) {
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO(exception, webRequest.getDescription(false), HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest webRequest) {
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO(exception, webRequest.getDescription(false), HttpStatus.NOT_FOUND, exception.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        return this.handleExceptionInternal(ex, (Object)null, headers, status, request);
    }

}
