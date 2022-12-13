package com.mgv.dnd.v3_5.abilities.domain;

import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityDescription;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;

public final class Ability {
    private final AbilityId id;
    private final AbilityName name;
    private final AbilityDescription description;

    public Ability(AbilityId id, AbilityName name, AbilityDescription description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static Ability create(AbilityId id, AbilityName name, AbilityDescription description){
        return new Ability(id, name, description);
    }

    public AbilityId id() {
        return id;
    }

    public AbilityName name() {
        return name;
    }

    public AbilityDescription description() {
        return description;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Ability ability = (Ability) obj;
        return id.equals(ability.id) && name.equals(ability.name) && description.equals(ability.description);
    }
}
