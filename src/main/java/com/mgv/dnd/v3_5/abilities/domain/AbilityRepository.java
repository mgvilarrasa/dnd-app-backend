package com.mgv.dnd.v3_5.abilities.domain;

import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;

import java.util.List;
import java.util.Optional;

public interface AbilityRepository {
    void save(Ability ability);
    Optional<Ability> searchById(AbilityId id);
    Optional<Ability> searchByName(AbilityName name);
    List<Ability> findAll();
}
