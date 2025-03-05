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
public class UserResponseDTO implements Serializable
{
    private Integer id;
    private String userName;
}
