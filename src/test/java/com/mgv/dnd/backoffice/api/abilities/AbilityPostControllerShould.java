package com.mgv.dnd.backoffice.api.abilities;

import com.mgv.dnd.DndApplicationTests;
import com.mgv.dnd.shared.domain.utils.UuidGenerator;
import com.mgv.dnd.v3_5.abilities.domain.AbilityDescriptionMother;
import com.mgv.dnd.v3_5.abilities.domain.AbilityNameMother;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AbilityPostControllerShould extends DndApplicationTests {
    @Autowired
    private UuidGenerator generator;

    @Test
    void create_a_valid_non_existing_ability() throws Exception{
        String uuid = generator.generate();
        String name = AbilityNameMother.random().value();
        String description = AbilityDescriptionMother.random().value();
        assertRequestWithBody(
                "POST",
                "/abilities",
                "{\"id\": \"" + uuid + "\",\"name\": \"" + name + "\",\"description\": \"" + description + "\"}",
                201
        );
    }
}
