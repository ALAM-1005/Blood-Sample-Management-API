package com.jsp.bsm.exceptionhandler;

import com.jsp.bsm.exception.UserNotFoundByIdException;
import com.jsp.bsm.util.ErrorStructure;
import com.jsp.bsm.util.RestResponseBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@AllArgsConstructor
public class UserExceptionHandler {

    private RestResponseBuilder responseBuilder;

    public ResponseEntity<ErrorStructure> handleUserNotFoundById(UserNotFoundByIdException ex) {
        return responseBuilder.error(HttpStatus.NOT_FOUND, ex.getMessage(), "User not found by given Id");
    }
}
