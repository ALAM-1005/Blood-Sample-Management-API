package com.jsp.bsm.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class RestResponseBuilder {

    public <T> ResponseEntity<ResponseStructure<T>> success(HttpStatus status, String message, T data) {
        return ResponseEntity
                .status(status)
                .body(ResponseStructure.<T>builder()
                        .status(status.value())
                        .message(message)
                        .data(data)
                        .build());
    }

    public ResponseEntity<ErrorStructure> error(HttpStatus status, String message, String rootCause) {
        return ResponseEntity
                .status(status)
                .body(ErrorStructure.builder()
                        .status(status)
                        .message(message)
                        .rootCause(rootCause)
                        .build());
    }
}
