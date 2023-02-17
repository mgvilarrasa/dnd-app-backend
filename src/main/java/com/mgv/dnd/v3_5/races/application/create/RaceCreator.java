package com.mgv.dnd.v3_5.races.application.create;

import com.mgv.dnd.v3_5.races.domain.Race;
import com.mgv.dnd.v3_5.races.domain.RaceRepository;
import com.mgv.dnd.v3_5.races.domain.vo.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class RaceCreator {
    private final RaceRepository repository;

    public RaceCreator(RaceRepository repository) {
        this.repository = repository;
    }

    public void createRace(RaceId id, RaceName name, RaceDescription description, RaceSize size, RaceSpeed speed,
                           List<RaceLanguage> languages, List<RaceCharacteristic> characteristics, List<RaceModifier> modifiers){
        Race race = new Race(id, name, description, size, speed, languages, modifiers, characteristics);
        repository.save(race);
    }
}
