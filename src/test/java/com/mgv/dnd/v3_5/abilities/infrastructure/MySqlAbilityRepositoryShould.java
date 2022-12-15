package com.mgv.dnd.v3_5.abilities.infrastructure;

import com.mgv.dnd.DndApplicationTests;
import com.mgv.dnd.v3_5.abilities.domain.Ability;
import com.mgv.dnd.v3_5.abilities.domain.AbilityMother;
import com.mgv.dnd.v3_5.abilities.domain.AbilityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

@Transactional
public class MySqlAbilityRepositoryShould extends DndApplicationTests {
    @Autowired
    private AbilityRepository repository;

    @Test
    void save_ability(){
        Ability ability = AbilityMother.random();
        repository.save(ability);
    }
}
