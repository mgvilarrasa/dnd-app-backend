package com.mgv.dnd.backoffice.users.infrastructure;

import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.backoffice.users.domain.UserRepository;
import com.mgv.dnd.backoffice.users.infrastructure.dao.UserDao;
import com.mgv.dnd.backoffice.users.infrastructure.dao.UserRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Logger;

@Service
public final class MySqlUserRepository implements UserRepository {
    private static Logger LOG = Logger.getLogger(String.valueOf(MySqlUserRepository.class));
    @Autowired
    private UserMapper mapper;
    @Autowired
    private UserRepositoryDao repositoryDao;

    @Override
    public void save(User user) {
        UserDao dao = mapper.user2Dao(user.Id().value(), user.UserName().value(), user.Password().value(), user.Email().value());
        repositoryDao.save(dao);
    }

    @Override
    public Optional<User> search(UserId id) {
        return Optional.empty();
    }
}
