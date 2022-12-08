package com.mgv.dnd.backoffice.api.users;

import com.mgv.dnd.backoffice.users.application.find.FindUserQuery;
import com.mgv.dnd.backoffice.users.application.response.UserResponse;
import com.mgv.dnd.shared.infraestructure.ResponseError;
import com.mgv.dnd.shared.infraestructure.bus.CommandBus;
import com.mgv.dnd.shared.infraestructure.bus.QueryBus;
import com.mgv.dnd.shared.infraestructure.spring.ApiController;
import com.mgv.dnd.shared.infraestructure.utils.ErrorMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.HashMap;

@RestController
public class UserGetController extends ApiController {

    public UserGetController(QueryBus queryBus, CommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity findUser(@PathVariable String id){
        try{
            UserResponse userResponse = ask(new FindUserQuery(id));
            HashMap<String, Serializable> responseMap = new HashMap<>();
            responseMap.put("id", userResponse.id());
            responseMap.put("userName", userResponse.userName());
            responseMap.put("email", userResponse.email());
            return new ResponseEntity<>(responseMap, HttpStatus.OK);
        } catch (Exception e){
            ResponseError error = ErrorMapper.mapDomainError(e);
            return new ResponseEntity<>(error.errorBody(), HttpStatus.NOT_FOUND);
        }
    }
}
