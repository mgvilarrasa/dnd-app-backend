package com.mgv.dnd.backoffice.users.application.create;

import com.mgv.dnd.backoffice.users.domain.*;
import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.backoffice.users.domain.vo.UserName;
import com.mgv.dnd.backoffice.users.domain.vo.UserPassword;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserCreator {
    Logger LOG = Logger.getLogger(String.valueOf(UserCreator.class));
    private final UserRepository repository;

    public UserCreator(UserRepository repository){
        this.repository = repository;
    }

    public void createUser(UserId id, UserName userName, UserPassword password, UserEmail email){
        User user = User.create(id, userName, password, email);
        repository.save(user);
    }
}
