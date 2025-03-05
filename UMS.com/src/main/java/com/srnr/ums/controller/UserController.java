package com.srnr.ums.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srnr.ums.dto.UserRequestDTO;
import com.srnr.ums.dto.UserResponseDTO;
import com.srnr.ums.userservice.UserServiceI;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	
	private UserServiceI userService;
	@PostMapping(value = "/registerUser")
	public ResponseEntity<?> registerUser(@RequestBody UserRequestDTO dto)
	{
		UserResponseDTO user = this.userService.saveUser(dto);
		return new ResponseEntity<UserResponseDTO>(user,HttpStatus.CREATED)
        
		
	}

}
