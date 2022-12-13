package com.mgv.dnd.v3_5.api.abilities;

import com.mgv.dnd.shared.domain.bus.Command;
import com.mgv.dnd.shared.infraestructure.ResponseError;
import com.mgv.dnd.shared.infraestructure.spring.ApiController;
import com.mgv.dnd.shared.infraestructure.spring.SpringCommandBus;
import com.mgv.dnd.shared.infraestructure.spring.SpringQueryBus;
import com.mgv.dnd.shared.infraestructure.utils.ErrorMapper;
import com.mgv.dnd.v3_5.abilities.application.create.CreateAbilityCommand;
import com.mgv.dnd.v3_5.api.abilities.request.CreateAbilityRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbilityPostController extends ApiController {

    public AbilityPostController(SpringQueryBus queryBus, SpringCommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @PostMapping(value = "/abilities")
    public ResponseEntity createUser(@RequestBody CreateAbilityRequest request){
        Command command = new CreateAbilityCommand(request.getId(), request.getName(), request.getDescription());
        try{
            dispatch(command);
        } catch (Exception e){
            ResponseError error = ErrorMapper.mapDomainError(e);
            return new ResponseEntity<>(error.errorBody(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
