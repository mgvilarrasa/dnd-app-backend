package com.mgv.dnd.backoffice.api.abilities;

import com.mgv.dnd.shared.infraestructure.ResponseError;
import com.mgv.dnd.shared.infraestructure.bus.CommandBus;
import com.mgv.dnd.shared.infraestructure.bus.QueryBus;
import com.mgv.dnd.shared.infraestructure.spring.ApiController;
import com.mgv.dnd.shared.infraestructure.utils.ErrorMapper;
import com.mgv.dnd.v3_5.abilities.application.response.AbilitiesResponse;
import com.mgv.dnd.v3_5.abilities.application.search_all.SearchAllAbilitiesQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AbilitiesGetController extends ApiController {
    public AbilitiesGetController(QueryBus queryBus, CommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @GetMapping(value = "/abilities")
    public List<HashMap<String, Serializable>> searchAllAbilities(){
        try{
            AbilitiesResponse abilityList = ask(new SearchAllAbilitiesQuery());
            return abilityList.abilities().stream().map(response -> new HashMap<String, Serializable>() {{
                put("id", response.id());
                put("name", response.name());
                put("description", response.description());
            }}).collect(Collectors.toList());
        } catch (Exception e){
            ResponseError error = ErrorMapper.mapDomainError(e);
            List<HashMap<String, Serializable>> errorList = new ArrayList<>();
            errorList.add(error.errorBody());
            return errorList;
        }
    }
}
