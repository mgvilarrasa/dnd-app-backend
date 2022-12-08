package com.mgv.dnd.shared.infraestructure;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.HashMap;

public class ResponseError {
    private HashMap<String, Serializable> errorBody;
    public ResponseError(HashMap<String, Serializable> errorBody) {
        this.errorBody = errorBody;
    }
    public HashMap<String, Serializable> errorBody() {
        return errorBody;
    }
}
