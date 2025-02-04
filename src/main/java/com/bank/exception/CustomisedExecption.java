package com.bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.time.LocalDate;

@ControllerAdvice
public class CustomisedExecption extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class )
    public final ResponseEntity<Object> handleExceptionAll(Exception ex, WebRequest request) throws Exception {
        ErrorDetails error = new ErrorDetails(LocalDate.now(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    @ExceptionHandler(UserPrincipalNotFoundException.class )
    public final ResponseEntity<Object> handleUserException(Exception ex, WebRequest request) throws Exception {
        ErrorDetails error = new ErrorDetails(LocalDate.now(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(AccountNotFound.class )
    public final ResponseEntity<Object> accountNotFound(Exception ex, WebRequest request) throws Exception {
        ErrorDetails error = new ErrorDetails(LocalDate.now(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    


}
