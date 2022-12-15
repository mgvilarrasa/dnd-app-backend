package com.mgv.dnd.v3_5.abilities.application.create;

import com.mgv.dnd.v3_5.abilities.AbilitiesModuleUnitTestCase;
import com.mgv.dnd.v3_5.abilities.domain.Ability;
import com.mgv.dnd.v3_5.abilities.domain.AbilityMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateAbilityCommandHandlerShould extends AbilitiesModuleUnitTestCase {
    private CreateAbilityCommandHandler handler;

    @BeforeEach
    protected void setUp(){
        super.setUp();
        handler = new CreateAbilityCommandHandler(new AbilityCreator(repository));
    }

    @Test
    void create_a_valid_ability(){
        CreateAbilityCommand command = CreateAbilityCommandMother.random();
        Ability ability = AbilityMother.fromRequest(command);
        try{
            handler.handle(command);
        } catch (Exception e){
            //Some exception
        }
        shouldHaveSaved(ability);
    }
}
