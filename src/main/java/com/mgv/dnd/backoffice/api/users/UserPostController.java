package com.mgv.dnd.backoffice.api.users;

import com.mgv.dnd.backoffice.api.users.request.CreateUserRequest;
import com.mgv.dnd.backoffice.users.application.create.CreateUserCommand;
import com.mgv.dnd.shared.domain.bus.Command;
import com.mgv.dnd.shared.infraestructure.ResponseError;
import com.mgv.dnd.shared.infraestructure.spring.ApiController;
import com.mgv.dnd.shared.infraestructure.spring.SpringCommandBus;
import com.mgv.dnd.shared.infraestructure.spring.SpringQueryBus;
import com.mgv.dnd.shared.infraestructure.utils.ErrorMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserPostController extends ApiController {
    public UserPostController(SpringQueryBus queryBus, SpringCommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<HashMap<String, String>> createUser(@RequestBody CreateUserRequest request){
        Command command = new CreateUserCommand(request.getId(), request.getUserName(), request.getPassword(), request.getEmail());
        try{
            dispatch(command);
        } catch (Exception e){
            ResponseError error = ErrorMapper.mapDomainError(e);
            return new ResponseEntity<>(error.errorBody(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
