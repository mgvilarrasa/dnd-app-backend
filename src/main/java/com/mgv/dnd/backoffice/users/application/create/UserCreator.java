package com.mgv.dnd.backoffice.users.application.create;

import com.mgv.dnd.backoffice.users.domain.*;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserCreator {
    Logger LOG = Logger.getLogger(String.valueOf(UserCreator.class));
    private final UserRepository repository;

    public UserCreator(UserRepository repository){
        this.repository = repository;
    }

    public void createUser(UserId id, UserName name, UserSurname surname){
        User user = User.create(id, name, surname);
        repository.save(user);
    }
}
