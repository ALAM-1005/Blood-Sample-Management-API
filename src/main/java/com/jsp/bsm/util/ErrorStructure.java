package com.jsp.bsm.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorStructure {
//    public static <T> ResponseEntity<T> builder() {
//
//    }
    private HttpStatus status;
    private String message;
    private String rootCause;
}
