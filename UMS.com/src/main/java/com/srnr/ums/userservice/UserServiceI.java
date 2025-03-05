package com.srnr.ums.userservice;

import com.srnr.ums.dto.UserRequestDTO;
import com.srnr.ums.dto.UserResponseDTO;

public interface UserServiceI {
	UserResponseDTO saveUser(UserRequestDTO userRequestDTO);
}
