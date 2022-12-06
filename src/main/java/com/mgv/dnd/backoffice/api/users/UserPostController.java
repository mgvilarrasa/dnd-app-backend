package com.mgv.dnd.backoffice.api.users;

import com.mgv.dnd.backoffice.api.users.request.CreateUserRequest;
import com.mgv.dnd.backoffice.users.application.create.CreateUserCommand;
import com.mgv.dnd.shared.domain.bus.Command;
import com.mgv.dnd.shared.domain.utils.UuidGenerator;
import com.mgv.dnd.shared.infraestructure.spring.ApiController;
import com.mgv.dnd.shared.infraestructure.spring.SpringCommandBus;
import com.mgv.dnd.shared.infraestructure.spring.SpringQueryBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPostController extends ApiController {
    @Autowired
    private UuidGenerator generator;

    public UserPostController(SpringQueryBus queryBus, SpringCommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest request){
        String uuid = generator.generate();
        Command command = new CreateUserCommand(uuid, request.getUserName(), request.getPassword(), request.getEmail());
        try{
            dispatch(command);
        } catch (Exception e){
            return new ResponseEntity<>("Error creating new user",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
