package com.srnr.ums.dao;

import java.util.List;
import java.util.Optional;

import com.srnr.ums.entity.User;

public interface UserDao {
	Optional<User> saveUser(User user);
	Optional<String> deleteUser(String userId);
    Optional<User> findUserById(String userId);
    Optional<List<User>> findAllUser();
    Optional<User> updateUser(User user);

}
