package com.mgv.dnd.v3_5.abilities.domain;

import com.mgv.dnd.v3_5.abilities.application.create.CreateAbilityCommand;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityDescription;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;

public class AbilityMother {
    public static Ability create(AbilityId id, AbilityName name, AbilityDescription description) {
        return new Ability(id, name, description);
    }

    public static Ability fromRequest(CreateAbilityCommand request) {
        return create(
                AbilityIdMother.create(request.id()),
                AbilityNameMother.create(request.name()),
                AbilityDescriptionMother.create(request.description())
        );
    }

    public static Ability random() {
        return create(AbilityIdMother.random(), AbilityNameMother.random(), AbilityDescriptionMother.random());
    }
}
