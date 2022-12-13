package com.mgv.dnd.v3_5.abilities.application.create;

import com.mgv.dnd.shared.domain.bus.CommandHandler;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityDescription;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;
import org.springframework.stereotype.Component;

@Component
public class CreateAbilityCommandHandler implements CommandHandler<CreateAbilityCommand> {
    private final AbilityCreator abilityCreator;

    public CreateAbilityCommandHandler(AbilityCreator abilityCreator){
        this.abilityCreator = abilityCreator;
    }

    @Override
    public void handle(CreateAbilityCommand command) throws Exception {
        AbilityId id = new AbilityId(command.id());
        AbilityName name = new AbilityName(command.name());
        AbilityDescription description = new AbilityDescription(command.description());
        abilityCreator.createAbility(id, name, description);
    }
}
