package com.mgv.dnd.backoffice.users.application.create;

import com.mgv.dnd.backoffice.users.domain.*;
import com.mgv.dnd.backoffice.users.infrastructure.MySqlUserRepository;
import com.mgv.dnd.shared.domain.bus.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CreateUserCommandHandler implements CommandHandler<CreateUserCommand> {
    private static Logger LOG = Logger.getLogger(String.valueOf(CreateUserCommandHandler.class));

    @Autowired
    private MySqlUserRepository repository;

    private final UserCreator userCreator;
    public CreateUserCommandHandler(UserCreator creator){
        this.userCreator = creator;
    }
    @Override
    public void handle(CreateUserCommand command) throws Exception {
        UserId id = new UserId(command.getUserId());
        UserName name = new UserName(command.getUserName());
        UserSurname surname = new UserSurname(command.getUserSurname());
        User user = new User(id, name, surname);
        userCreator.createUser(repository, user);
    }
}
