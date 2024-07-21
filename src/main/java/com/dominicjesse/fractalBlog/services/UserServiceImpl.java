package com.dominicjesse.fractalBlog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dominicjesse.fractalBlog.dto.UserDto;
import com.dominicjesse.fractalBlog.models.User;
import com.dominicjesse.fractalBlog.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public User findByEmail(String email) {
		//return userRepository.find(email);
		return null;
	}
	
	 @Override
	 public User save(UserDto userDto) {
	  User user = new User(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()),
	    userDto.getUserType());
	  return userRepository.save(user);
	 }

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

}
