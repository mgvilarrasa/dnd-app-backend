package com.mgv.dnd.shared.infraestructure.utils;

import com.mgv.dnd.shared.domain.DomainError;
import com.mgv.dnd.shared.infraestructure.ResponseError;

import java.util.HashMap;

public class ErrorMapper {
    public static ResponseError mapDomainError(Exception e){
        HashMap<String, String> errorMap = new HashMap<>();
        if(e instanceof DomainError){
            errorMap.put("code", ((DomainError) e).errorCode());
            errorMap.put("message", ((DomainError) e).errorMessage());
            return new ResponseError(errorMap);
        }
        errorMap.put("code", "generic_error");
        errorMap.put("message", e.getMessage());
        return new ResponseError(errorMap);
    }
}
