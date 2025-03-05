package com.srnr.ums.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srnr.ums.dto.UserRequestDTO;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@PostMapping(value = "/registerUser")
	public ResponseEntity<?> registerUser(@RequestBody UserRequestDTO dto)
	{
		return null;
	}

}
