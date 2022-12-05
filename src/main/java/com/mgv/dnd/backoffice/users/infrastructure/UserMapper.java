package com.mgv.dnd.backoffice.users.infrastructure;

import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.backoffice.users.infrastructure.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    public UserDao user2Dao(User user){
        return new UserDao(
                user.Id().value(),
                user.Name().value(),
                user.Surname().value()
        );
    }
}
