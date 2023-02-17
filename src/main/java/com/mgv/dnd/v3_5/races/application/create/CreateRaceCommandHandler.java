package com.mgv.dnd.v3_5.races.application.create;

import com.mgv.dnd.shared.domain.bus.CommandHandler;
import com.mgv.dnd.v3_5.races.domain.vo.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public final class CreateRaceCommandHandler implements CommandHandler<CreateRaceCommand> {
    private final RaceCreator raceCreator;

    public CreateRaceCommandHandler(RaceCreator raceCreator){
        this.raceCreator = raceCreator;
    }

    @Override
    public void handle(CreateRaceCommand command) throws Exception {
        RaceId id = new RaceId(command.id());
        RaceName name = new RaceName(command.name());
        RaceDescription description = new RaceDescription(command.description());
        RaceSize size = new RaceSize(command.size());
        RaceSpeed speed = new RaceSpeed(command.speed());
        List<RaceLanguage> languages = command.languages().stream()
                .map(language -> new RaceLanguage(language.language())).collect(Collectors.toList());
        List<RaceCharacteristic> characteristics = command.characteristics().stream()
                .map(characteristic -> new RaceCharacteristic(characteristic.name(), characteristic.description())).collect(Collectors.toList());
        List<RaceModifier> modifiers = command.modifiers().stream()
                .map(modifier -> new RaceModifier(modifier.type(), modifier.modifiedField(), modifier.modifier())).collect(Collectors.toList());
        raceCreator.createRace(id, name, description, size, speed, languages, characteristics, modifiers);
    }
}
