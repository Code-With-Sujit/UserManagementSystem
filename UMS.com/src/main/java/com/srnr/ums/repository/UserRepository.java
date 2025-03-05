package com.srnr.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srnr.ums.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	User findByUserName(String userName);

}
