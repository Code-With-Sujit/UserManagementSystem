package com.srnr.ums.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class UserRequestDTO  implements Serializable{
	
	private String userName;

}
