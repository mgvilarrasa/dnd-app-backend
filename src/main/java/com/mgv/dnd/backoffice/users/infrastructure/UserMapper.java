package com.mgv.dnd.backoffice.users.infrastructure;

import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.backoffice.users.domain.vo.UserName;
import com.mgv.dnd.backoffice.users.domain.vo.UserPassword;
import com.mgv.dnd.backoffice.users.infrastructure.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public final class UserMapper {
    public UserDao user2Dao(String id, String userName, String password, String email){
        return new UserDao(id, userName, password, email);
    }

    public User dao2User(UserDao dao){
        return new User(
                new UserId(dao.getId()),
                new UserName(dao.getUserName()),
                new UserPassword(dao.getPassword()),
                new UserEmail(dao.getEmail())
        );
    }
}
