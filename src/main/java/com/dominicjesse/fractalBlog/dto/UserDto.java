package com.dominicjesse.fractalBlog.dto;

import com.dominicjesse.fractalBlog.enums.UserType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	String email;
	String password;
	UserType userType;
}
