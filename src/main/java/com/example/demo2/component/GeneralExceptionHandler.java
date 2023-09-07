package com.example.demo2.component;

import com.example.demo2.dto.ExceptionBody;
import com.example.demo2.dto.FieldException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.HttpURLConnection;
import java.util.List;

@ControllerAdvice
public class GeneralExceptionHandler {

    @ExceptionHandler(BindException.class)

    public ResponseEntity<?>handler(BindException e){
        List<FieldError>fieldErrors=e.getFieldErrors();
        List<FieldException>errors= fieldErrors.stream()
                .map(error-> new FieldException(error.getField(), error.getDefaultMessage()))
                .toList();
        ExceptionBody body = new ExceptionBody(errors);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }


}
