package com.mgv.dnd.v3_5.abilities.application.create;

import com.mgv.dnd.v3_5.abilities.domain.AbilityDescriptionMother;
import com.mgv.dnd.v3_5.abilities.domain.AbilityIdMother;
import com.mgv.dnd.v3_5.abilities.domain.AbilityNameMother;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityDescription;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;

public class CreateAbilityCommandMother {
    public static CreateAbilityCommand create(AbilityId id, AbilityName name, AbilityDescription description) {
        return new CreateAbilityCommand(id.value(), name.value(), description.value());
    }

    public static CreateAbilityCommand random() {
        return create(AbilityIdMother.random(), AbilityNameMother.random(), AbilityDescriptionMother.random());
    }
}
