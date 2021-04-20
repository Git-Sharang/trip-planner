<!-- Name: Sharang Verma
 	 Student Number: 300981587
 	 Submission Date: March 7, 2021 
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sharang Hotel Reservation</title>

<!-- <link rel="stylesheet" href="resources/css/signupStyle.css" /> -->
<style>
* {
	box-sizing: border-box;
}

*:focus {
	outline: none;
}

*::before, *::after {
	content: '';
}

body {
	font-family: 'Lato', Verdana, sans-serif;
	background: url("http://k46.kn3.net/taringa/B/3/5/9/B/C/WIk4N/66D.jpg")
		center/cover fixed;
}

.login {
	margin: 20px auto;
	width: 850px;
	padding-top: 40px;
}

.login-screen {
	background-color: rgba(0, 0, 0, 0.6);
	overflow: hidden;
	padding: 2em;
	border-radius: 10px;
	box-sizing: border-box;
	box-shadow: 0 15px 25px rgba(0, 0, 0, .6);
}

.login-screen::before {
	display: block;
	position: absolute;
	filter: blur(5px);
	z-index: -1;
}

.app-title {
	text-align: left;
	color: white;
}

.login-form {
	text-align: left;
}

.control-group {
	margin-bottom: 10px;
}

label.login-label {
	color: white;
}

input {
	text-align: center;
	background-color: rgba(255, 255, 255, 0.6);
	border: 2px solid transparent;
	border-radius: 3px;
	font-size: 16px;
	font-weight: 200;
	padding: 10px 0;
	width: 250px;
	transition: border .5s;
}

input:focus {
	border: 2px solid #3498DB;
	box-shadow: none;
}

.btn {
	border: none;
	outline: none;
	margin-top: 1em;
	padding: 1em 3em;
	border-radius: 4px;
	font-family: 'Lato', Verdana, sans-serif;
	font-weight: 900;
	text-transform: uppercase;
	letter-spacing: 0.15em;
	background-color: transparent;
	border: 3px solid #f2f2f8;
	color: #f2f2f8;
	transform: translate3D(0, 0, 0);
	transition: color 0.3s, background-color 0.3s, transform 0.15s;
	cursor: pointer;
}

.btn:hover {
	color: #212121;
	background-color: #f2f2f8;
	outline: none;
}

.btn:focus {
	outline: none;
}

.btn:active {
	transform: translate3D(0, 2px, 0);
	outline: none;
}

.login-link {
	font-size: 12px;
	color: #444;
	display: block;
	margin-top: 12px;
}

header {
	color: white;
	text-align: center;
	padding-top: 20px;
}

footer {
	color: white;
	text-align: center;
	padding-top: 20px;
}
</style>
</head>
<body>
	<header>
		<h1>Trip Planner - Book Hotel Rooms</h1>
	</header>
	<div class="login">
		<form:form action="register" method="post">
			<div class="login-screen">
				<div class="app-title"></div>
				<div class="login-form">
					<div class="control-group">
						<label class="login-label">Name</label><br /> <input type="text"
							name="firstname" class="login-field" placeholder="first name "
							required> <input type="text" name="lastname"
							class="login-field" placeholder="last name" required>
					</div>
					<br />
					<div class="control-group">
						<label class="login-label">Address</label><br /> <input
							type="text" name="address" class="login-field"
							placeholder="Street Address" required> <input type="text"
							name="city" class="login-field" placeholder="City" required>
						<input type="text" name="pCode" class="login-field"
							placeholder="Postal/ZipCode" required><br />
					</div>
					<div class="control-group">
						<input type="text" name="province" class="login-field"
							placeholder="State/Province" required> <input type="text"
							name="country" class="login-field" placeholder="Country" required>
					</div>
					<br />
					<div class="control-group">
						<label class="login-label">Phone</label><br /> <input type="text"
							name="phone" class="login-field" placeholder="466-466-4778"
							required>
					</div>
					<br />
					<div class="control-group">
						<label class="login-label">Email</label><br /> <input type="email"
							name="email" class="login-field" placeholder="me@example.com"
							style="width: 515px;" required>
					</div>
					<br />

					<div class="control-group">
						<label class="login-label">Password</label><br /> <input
							type="password" name="password" max="6" class="login-field"
							style="width: 515px;" required>
					</div>
					<br /> <br />
					<br />
					<c:if test="${exceptionMessage != null}">
						<p style="color: red;">${exceptionMessage}</p>
					</c:if>
					<div class="control-group">
						<button class="btn " type="submit" class="submit-btn">Register</button>
					</div>
				</div>
			</div>
		</form:form>
	</div>
	<br />
	<footer>
		&copy;2021 Sharang Verma - Java EE Programming <br />All Rights
		Reserved
	</footer>
</body>
</html>