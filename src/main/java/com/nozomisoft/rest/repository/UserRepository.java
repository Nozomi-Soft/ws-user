package com.nozomisoft.rest.repository;

import com.nozomisoft.rest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String>, UserRepositoryCustom{

  User findUserByEmail(@Param("email") String email);

  User findUserByUsername(@Param("username") String username);

  User findUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
