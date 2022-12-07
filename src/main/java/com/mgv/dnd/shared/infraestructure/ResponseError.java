package com.mgv.dnd.shared.infraestructure;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

public class ResponseError {
    private HashMap<String, String> errorBody;
    public ResponseError(HashMap<String, String> errorBody) {
        this.errorBody = errorBody;
    }
    public HashMap<String, String> errorBody() {
        return errorBody;
    }
}
