package com.mgv.dnd.v3_5.races.infrastructure;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mgv.dnd.v3_5.races.domain.Race;
import com.mgv.dnd.v3_5.races.domain.vo.*;
import com.mgv.dnd.v3_5.races.infrastructure.dao.RaceDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public final class RaceMapper {
    private final static Logger LOG = Logger.getLogger(String.valueOf(RaceMapper.class));

    public RaceDao race2Dao(Race race){
        return new RaceDao(
                race.id().value(),
                race.name().value(),
                race.description().value(),
                race.size().value(),
                race.speed().value(),
                new Gson().toJson(race.languages()),
                new Gson().toJson(race.characteristics()),
                new Gson().toJson(race.modifiers())
        );
    }

    public Race dao2Race(RaceDao dao){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return new Race(
                    new RaceId(dao.getId()),
                    new RaceName(dao.getName()),
                    new RaceDescription(dao.getDescription()),
                    new RaceSize(dao.getSize()),
                    new RaceSpeed(dao.getSpeed()),
                    objectMapper.readValue(dao.getLanguages(), new TypeReference<List<RaceLanguage>>(){}),
                    objectMapper.readValue(dao.getModifiers(), new TypeReference<List<RaceModifier>>(){}),
                    objectMapper.readValue(dao.getCharacteristics(), new TypeReference<List<RaceCharacteristic>>(){})
            );
        } catch(Exception e) {
            LOG.severe("Error deserializing Json: " + e.getMessage());
            return null;
        }
    }
}
