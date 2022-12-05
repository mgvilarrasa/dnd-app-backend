package com.mgv.dnd.backoffice.users.application.create;

import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.backoffice.users.domain.UserRepository;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserCreator {
    Logger LOG = Logger.getLogger(String.valueOf(UserCreator.class));
    public void createUser(UserRepository repository, User user){
        repository.save(user);
    }
}
