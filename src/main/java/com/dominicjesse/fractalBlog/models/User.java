package com.dominicjesse.fractalBlog.models;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.dominicjesse.fractalBlog.enums.UserType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, unique = true, length = 45)
	private String email;
	
	@Column(nullable = false, length = 64)
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Timestamp createdOn;
	
	@Column(nullable = false)
	private UserType userType;

	public User() {
		this.createdOn = Timestamp.valueOf(LocalDateTime.now());
	}
	
	public User(String email, String password, UserType userType) {
		super();
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.createdOn = Timestamp.valueOf(LocalDateTime.now());
	}
}