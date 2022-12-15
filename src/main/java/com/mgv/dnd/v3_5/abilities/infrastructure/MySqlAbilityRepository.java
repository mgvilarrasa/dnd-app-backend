package com.mgv.dnd.v3_5.abilities.infrastructure;

import com.mgv.dnd.v3_5.abilities.domain.Ability;
import com.mgv.dnd.v3_5.abilities.domain.AbilityRepository;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;
import com.mgv.dnd.v3_5.abilities.infrastructure.dao.AbilityDao;
import com.mgv.dnd.v3_5.abilities.infrastructure.dao.AbilityRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public final class MySqlAbilityRepository implements AbilityRepository {
    @Autowired
    private AbilityMapper mapper;
    @Autowired
    private AbilityRepositoryDao repositoryDao;
    @Override
    public void save(Ability ability) {
        AbilityDao dao = mapper.ability2Dao(ability.id().value(), ability.name().value(), ability.description().value());
        repositoryDao.save(dao);
    }

    @Override
    public Optional<Ability> searchById(AbilityId id) {
        return Optional.empty();
    }

    @Override
    public Optional<Ability> searchByName(AbilityName name) {
        return Optional.empty();
    }

    @Override
    public List<Ability> findAll() {
        return repositoryDao.findAll().stream().map(p -> mapper.dao2Ability(p)).collect(Collectors.toList());
    }
}
