package com.srnr.ums.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.srnr.ums.entity.User;
import com.srnr.ums.repository.UserRepository;

@Component
public class UserDaoImpl implements UserDao{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public Optional<User> saveUser(User user) {
		if(user!=null)
		{
			User byUserName = userRepository.findByUserName(user.getUserName());
			if(byUserName==null)
			{
				User save = userRepository.save(user);
				return save!=null?Optional.of(save):Optional.empty();
			}
			else {
				throw new RuntimeException("Already Name is Existed");
			}
		}
		else {
			throw new RuntimeException("User Can not be null");
		}
		
	}

}
