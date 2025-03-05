package com.srnr.ums.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "USER_TABLE")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String userName;
}
