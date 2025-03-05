package com.srnr.ums.mapper;

import org.springframework.beans.BeanUtils;

import com.srnr.ums.dto.UserRequestDTO;
import com.srnr.ums.dto.UserResponseDTO;
import com.srnr.ums.entity.User;

public class EntityToDTOMapper {
	
	public static User userRequestDTOToUser(UserRequestDTO dto)
	{
		User user = new User();
		BeanUtils.copyProperties(dto, user);
		return user;
	}
	public static UserResponseDTO userToUserResponseDTO(User user)
	{
		UserResponseDTO dto = new UserResponseDTO();
		BeanUtils.copyProperties(user, dto);
		return dto;
	}

}
