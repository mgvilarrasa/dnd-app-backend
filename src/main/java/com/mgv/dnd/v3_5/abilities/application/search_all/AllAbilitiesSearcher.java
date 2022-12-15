package com.mgv.dnd.v3_5.abilities.application.search_all;

import com.mgv.dnd.backoffice.users.application.response.UserResponse;
import com.mgv.dnd.backoffice.users.application.response.UsersResponse;
import com.mgv.dnd.v3_5.abilities.application.response.AbilitiesResponse;
import com.mgv.dnd.v3_5.abilities.application.response.AbilityResponse;
import com.mgv.dnd.v3_5.abilities.domain.AbilityRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class AllAbilitiesSearcher {
    private final AbilityRepository repository;

    public AllAbilitiesSearcher(AbilityRepository repository){
        this.repository = repository;
    }

    public AbilitiesResponse findAll(){
        return new AbilitiesResponse(repository.findAll().stream().map(AbilityResponse::fromAggregate).collect(Collectors.toList()));
    }
}
