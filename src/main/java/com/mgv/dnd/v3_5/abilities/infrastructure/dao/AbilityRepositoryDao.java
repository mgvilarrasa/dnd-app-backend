package com.mgv.dnd.v3_5.abilities.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityRepositoryDao extends JpaRepository<AbilityDao, String> {
}
