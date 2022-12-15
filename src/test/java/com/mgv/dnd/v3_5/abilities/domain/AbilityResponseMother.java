package com.mgv.dnd.v3_5.abilities.domain;

import com.mgv.dnd.v3_5.abilities.application.response.AbilityResponse;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityDescription;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;

public class AbilityResponseMother {
    public static AbilityResponse create(AbilityId id, AbilityName name, AbilityDescription description) {
        return new AbilityResponse(id.value(), name.value(), description.value());
    }

    public static AbilityResponse random() {
        return create(AbilityIdMother.random(), AbilityNameMother.random(), AbilityDescriptionMother.random());
    }
}
