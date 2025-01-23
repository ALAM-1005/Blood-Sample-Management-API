package com.jsp.bsm.util;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseStructure<T> {

    private int status;
    private String message;
    private T data;

//    public int getStatus() {
//        return status;
//    }
//    public ResponseStructure<T> setStatus(int status) {
//        this.status = status;
//        return this;
//    }
//    public String getMessage(String message) {
//        return this.message;
//    }
//    public ResponseStructure<T> setMessage(String message) {
//        this.message = message;
//        return this;
//    }
//    public T getData() {
//        return data;
//    }
//    public ResponseStructure<T> setData(T data) {
//        this.data = data;
//        return this;
//    }
//    public static ResponseStructure<T> createResponse(int status, String message, T data) {
//        return new ResponseStructure<T>().setStatus(status).getMessage(message).setData(data);
//    }
}
