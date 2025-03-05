package com.srnr.ums.dao;

import java.util.Optional;

import com.srnr.ums.entity.User;

public interface UserDao {
	Optional<User> saveUser(User user);

}
