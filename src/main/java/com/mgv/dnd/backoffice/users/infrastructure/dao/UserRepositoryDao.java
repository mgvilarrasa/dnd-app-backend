package com.mgv.dnd.backoffice.users.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryDao extends JpaRepository<UserDao, String> {
}
