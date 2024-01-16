package com.v3.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {
        StudentErrorResponse studentNotFound = new StudentErrorResponse();
        studentNotFound.setStatus(HttpStatus.NOT_FOUND.value());
        studentNotFound.setMessage(exception.getMessage());
        studentNotFound.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(studentNotFound, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception genericException) {
        StudentErrorResponse genericStudentError = new StudentErrorResponse();
        genericStudentError.setStatus(HttpStatus.BAD_REQUEST.value());
        genericStudentError.setMessage(genericException.getMessage());
        genericStudentError.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(genericStudentError, HttpStatus.BAD_REQUEST);
    }
}
