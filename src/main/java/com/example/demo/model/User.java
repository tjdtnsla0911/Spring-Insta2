package com.example.demo.model;


import java.security.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

	public List<String> getRoleList(){
    	System.out.println("model.User의 getRoleList()에 왔습니다");
        if(this.role.length() > 0){
        	System.out.println("model.User의 getRoleList()의 if문에 왔습니다");
            return Arrays.asList(this.role.split(","));
        }
        return new ArrayList<>();
    }
}
