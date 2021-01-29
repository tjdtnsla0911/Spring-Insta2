package com.example.demo.model;


import java.security.Timestamp;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;


@Data
@Builder
@AllArgsConstructor
@ToString
public class User {
	private int id;
	private String bio;
	private Date createDate;
	private String email;
	private String gender;
	private String name;
	private String password;
	private String phone;
	private String profileImage;
	private String provider;
	private String providerId;
	private String role;
	private String username;
	private String website;

}
