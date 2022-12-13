package com.mgv.dnd.v3_5.abilities.application.create;

import com.mgv.dnd.v3_5.abilities.domain.Ability;
import com.mgv.dnd.v3_5.abilities.domain.AbilityRepository;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityDescription;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;
import org.springframework.stereotype.Service;

@Service
public class AbilityCreator {
    private AbilityRepository repository;

    public AbilityCreator(AbilityRepository repository){
        this.repository = repository;
    }

    public void createAbility(AbilityId id, AbilityName name, AbilityDescription description){
        Ability ability = Ability.create(id, name, description);
        repository.save(ability);
    }
}
