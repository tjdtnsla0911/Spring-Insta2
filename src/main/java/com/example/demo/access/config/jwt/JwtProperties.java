package com.example.demo.access.config.jwt;

public interface JwtProperties {
	String SECRET = "노력의천재 김성수"; //서버만 알고있는 비밀값입니다 ㅎ
	int EXPIRATION_TIME = 864000000; // 10일 (1/1000초)
	String TOKEN_PREFIX = "Bearer ";
	String HEADER_STRING = "Authorization";
}
