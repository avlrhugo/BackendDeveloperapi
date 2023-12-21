package edu.unifaa.pizzaria.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import edu.unifaa.pizzaria.model.exception.ResourceNotFoundException;


    @ControllerAdvice
    public class RestExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException ex){

        ModeloErro erro = new ModeloErro("Not Found", ex.getMessage() );
        return null;
}

}