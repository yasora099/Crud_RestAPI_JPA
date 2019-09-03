package com.hms.crudRestAPIJPA.Usercourse.repository;

import com.hms.crudRestAPIJPA.Usercourse.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
