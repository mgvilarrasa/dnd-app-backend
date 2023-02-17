package com.mgv.dnd.v3_5.races.domain;

import com.mgv.dnd.v3_5.races.domain.vo.RaceId;
import com.mgv.dnd.v3_5.races.domain.vo.RaceName;

import java.util.List;
import java.util.Optional;

public interface RaceRepository {
    void save(Race race);
    Optional<Race> searchById(RaceId id);
    Optional<Race> searchByName(RaceName name);
    List<Race> findAll();
}
