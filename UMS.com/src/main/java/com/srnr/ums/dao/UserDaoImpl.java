package com.srnr.ums.dao;

import java.util.List;
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

	@Override
	public Optional<String> deleteUser(String userId) {
		
		if(userId!=null && !userId.isBlank()) 
		{
			Optional<User> byId = userRepository.findById(userId);
			if(byId.isPresent()) 
			{
				userRepository.delete(byId.get());
				return Optional.of("user deleted Successfully with userID"+userId);
			}
			else {
				throw new RuntimeException("User not exist with id : "+userId);
			}
		}
		else {
			throw new RuntimeException("UserId can not be null or blank");
		}	
	}

	@Override
	public Optional<User> findUserById(String userId) {
		if(userId!=null && !userId.isBlank()) {
			Optional<User> byId = userRepository.findById(userId);
			if(byId.isPresent()) {
				User referenceById = userRepository.getReferenceById(userId);
				return Optional.of(referenceById);
			}
			else {
				throw new RuntimeException("user with userId"+userId+"not existed in database");
			}
		}
		else {
			throw new RuntimeException("userId can't be null.please provide userId.");
		}
	}

	@Override
	public Optional<List<User>> findAllUser() {
		List<User> all = userRepository.findAll();
		if(all!=null && all.size() > 0) 
		{
			return Optional.of(all);
		}
		else {
			throw new RuntimeException("No User exist ! ");
		}
	}

	@Override
	public Optional<User> updateUser(User user) {
	    if (user!=null) {
	    	Optional<User> existingUser = userRepository.findById(user.getUserId());

		    if (existingUser.isPresent()) {
		        User updatedUser = existingUser.get();
		        updatedUser.setUserName(user.getUserName());
		        User savedUser = userRepository.save(updatedUser);
		        
		        return   savedUser!=null ?  Optional.of(savedUser) : Optional.empty();
		    } else {
		        throw new RuntimeException("User with ID " + user.getUserId() + " not found");
		    }
	    }
	    else {
	    	throw new RuntimeException("user must not be null");
	    }   
	}

}
