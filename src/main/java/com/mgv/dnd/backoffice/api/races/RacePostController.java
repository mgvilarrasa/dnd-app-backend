package com.mgv.dnd.backoffice.api.races;

import com.mgv.dnd.backoffice.api.abilities.request.CreateAbilityRequest;
import com.mgv.dnd.shared.domain.bus.Command;
import com.mgv.dnd.shared.infraestructure.ResponseError;
import com.mgv.dnd.shared.infraestructure.bus.CommandBus;
import com.mgv.dnd.shared.infraestructure.bus.QueryBus;
import com.mgv.dnd.shared.infraestructure.spring.ApiController;
import com.mgv.dnd.shared.infraestructure.utils.ErrorMapper;
import com.mgv.dnd.v3_5.abilities.application.create.CreateAbilityCommand;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RacePostController extends ApiController{

    public RacePostController(QueryBus queryBus, CommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @PostMapping(value = "/races")
    public ResponseEntity createRace(@RequestBody CreateRaceRequest request){
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
