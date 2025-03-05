package com.srnr.ums.userservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srnr.ums.dao.UserDao;
import com.srnr.ums.dto.UserRequestDTO;
import com.srnr.ums.dto.UserResponseDTO;
import com.srnr.ums.entity.User;
import com.srnr.ums.mapper.EntityToDTOMapper;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	UserDao userDao;
	
	@Override
	public UserResponseDTO saveUser(UserRequestDTO userRequestDTO) {
		if(userRequestDTO!=null)
		{
			User user = EntityToDTOMapper.userRequestDTOToUser(userRequestDTO);
			if(user!=null)
			{
				Optional<User> saveUser = userDao.saveUser(user);
				if(saveUser.isPresent())
				{
					UserResponseDTO userrResponseDTO = EntityToDTOMapper.userToUserResponseDTO(saveUser.get());
					return userrResponseDTO!=null?userrResponseDTO:null;
				}
				else {
					throw new RuntimeException("User Not Created..");
				}
			}else {
				throw new RuntimeException("Something went wrong");
			}
		}
		else {
			throw new RuntimeException("User Must not be null");
		}
		
	}

	
	
	

}
