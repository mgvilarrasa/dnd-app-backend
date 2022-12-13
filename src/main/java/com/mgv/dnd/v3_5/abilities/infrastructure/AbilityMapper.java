package com.mgv.dnd.v3_5.abilities.infrastructure;

import com.mgv.dnd.v3_5.abilities.domain.Ability;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityDescription;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;
import com.mgv.dnd.v3_5.abilities.infrastructure.dao.AbilityDao;
import org.springframework.stereotype.Service;

@Service
public final class AbilityMapper {
    public AbilityDao ability2Dao(String id, String name, String description){
        return new AbilityDao(id, name, description);
    }

    public Ability dao2Ability(AbilityDao dao){
        return new Ability(
                new AbilityId(dao.getId()),
                new AbilityName(dao.getName()),
                new AbilityDescription(dao.getDescription())
        );
    }
}
