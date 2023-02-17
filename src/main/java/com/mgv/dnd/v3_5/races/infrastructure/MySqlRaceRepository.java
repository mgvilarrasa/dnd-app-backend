package com.mgv.dnd.v3_5.races.infrastructure;

import com.mgv.dnd.v3_5.races.domain.Race;
import com.mgv.dnd.v3_5.races.domain.RaceRepository;
import com.mgv.dnd.v3_5.races.domain.vo.RaceId;
import com.mgv.dnd.v3_5.races.domain.vo.RaceName;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MySqlRaceRepository implements RaceRepository {
    @Override
    public void save(Race race) {

    }

    @Override
    public Optional<Race> searchById(RaceId id) {
        return Optional.empty();
    }

    @Override
    public Optional<Race> searchByName(RaceName name) {
        return Optional.empty();
    }

    @Override
    public List<Race> findAll() {
        return null;
    }
}
