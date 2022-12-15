package com.mgv.dnd.v3_5.abilities.domain;

import com.mgv.dnd.shared.domain.DescriptionMother;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityDescription;

public class AbilityDescriptionMother {
    public static AbilityDescription create(String value) {
        return new AbilityDescription(value);
    }
    public static AbilityDescription random() {
        return create(DescriptionMother.random());
    }
}
