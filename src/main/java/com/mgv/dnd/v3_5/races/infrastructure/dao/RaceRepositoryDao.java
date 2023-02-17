package com.mgv.dnd.v3_5.races.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepositoryDao extends JpaRepository<RaceDao, String> {
}
