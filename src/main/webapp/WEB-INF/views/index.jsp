<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file="../layout/footer.jsp" %>
<!DOCTYPE html>
<html>
<head>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link rel="shortcut icon" href="/images/favicon.ico">
<link rel="stylesheet" href="/css/styles.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<main id="login">
		<div class="login__column">
			<img src="/images/phoneImage.png" />
		</div>
		<div class="login__column">
			<div class="login__box">
				<img src="/images/loginLogo.png" />
				<form action="/auth/login" method="post" class="login__form">
					<input type="text" name="username" placeholder="Username" required> 
					<input type="password" name="password" placeholder="Password"
						required> <input type="submit" value="Log in">
				</form>
				<span class="login__divider"> or </span> 
				<!-- 여기서 oauth2를탐 -->
				<a href="/oauth2/authorization/facebook" class="login__fb-link"><i class="fa fa-facebook-square"></i> Log in
					with Facebook</a> <a href="#" class="login__small-link">Forgot password?</a>
			</div>
			<div class="login__box">
				<span class="login__text"> Don't have an account? <br />
				</span> <a class="login__blue-link" href="/auth/joinForm">Sign up</a>
			</div>
			<div class="login__t-box">
				<span class="login__text"> Get the app. </span>
				<div class="login__appstores">
					<img src="/images/ios.png" class="login__appstore" /> <img src="/images/android.png" class="login__appstore" />
				</div>
			</div>
		</div>
	</main>
</body>
</html>