package com.dominicjesse.fractalBlog.services;


import java.util.List;

import com.dominicjesse.fractalBlog.dto.UserDto;
import com.dominicjesse.fractalBlog.models.User;

public interface UserService {
	User findByEmail(String email);
    User save(UserDto userDto);
    List<User> findAllUsers();
}
