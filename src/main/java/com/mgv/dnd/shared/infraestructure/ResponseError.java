package com.mgv.dnd.shared.infraestructure;

import java.io.Serializable;
import java.util.HashMap;

public final class ResponseError {
    private final HashMap<String, Serializable> errorBody;
    public ResponseError(HashMap<String, Serializable> errorBody) {
        this.errorBody = errorBody;
    }
    public HashMap<String, Serializable> errorBody() {
        return errorBody;
    }
}
