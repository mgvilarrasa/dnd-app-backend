package com.mgv.dnd.backoffice.users.infrastructure;

import com.mgv.dnd.backoffice.users.infrastructure.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public final class UserMapper {
    public UserDao user2Dao(String id, String userName, String password, String email){
        return new UserDao(id, userName, password, email);
    }
}
