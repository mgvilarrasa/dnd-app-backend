package com.mgv.dnd.backoffice.users.application.create;

import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.backoffice.users.domain.vo.UserName;
import com.mgv.dnd.backoffice.users.domain.vo.UserPassword;
import com.mgv.dnd.shared.domain.bus.CommandHandler;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CreateUserCommandHandler implements CommandHandler<CreateUserCommand> {
    private static Logger LOG = Logger.getLogger(String.valueOf(CreateUserCommandHandler.class));
    private final UserCreator userCreator;
    public CreateUserCommandHandler(UserCreator creator){
        this.userCreator = creator;
    }
    @Override
    public void handle(CreateUserCommand command) throws Exception {
        UserId id = new UserId(command.id());
        UserName userName = new UserName(command.userName());
        UserPassword password = new UserPassword(command.password());
        UserEmail email = new UserEmail(command.email());
        userCreator.createUser(id, userName, password, email);
    }
}
