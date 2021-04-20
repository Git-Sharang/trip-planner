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

<link rel="stylesheet" href="resources/css/reservationStyle.css" />
<style>
<
style>* {
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
	padding-top: 10px;
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
	padding-top: 0px;
}

footer {
	color: white;
	text-align: center;
	padding-top: 20px;
}
.topnav {
  margin-top:0px;
  overflow: hidden;
  background-color: rgba(0, 0, 0, 0.6);
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

.container  {
  max-width:1140px;
  margin:0 auto; 
  display:block;
}
.row  {
  display:flex;
  align-items:center
}


.thumb-box {
  display:flex;
  max-width:33.3333%;
  margin:15px 20px;
  position:relative;
}

.thumb-box a {
  padding:0;
  position: relative;
  width: 100%;
  height: 100%;
  z-index:9997;
}

.thumb-box img {
    width:100%;
    height:280px;
    float:left;
  }

.overlay-box {
  position:absolute;
  bottom:0;
  width:90%;
  z-index:9998;
  left:0;
  padding:5%;
  background-image: linear-gradient(to bottom, transparent, rgba(0,0,0,0.75));
}

.meta {
  font-size:14px;
  display:block;
  color:#fff;
  
}

.thumb-box:hover .overlay-box {
  background-image: linear-gradient(to bottom, transparent, rgba(0,0,0, 1));
}

</style>

</head>
<body>
	<header>
		<div class="topnav">
			<a>Trip Planner - Book Hotel Rooms</a> 
			<a href="home">Home</a>
			<a class="active" href="booking">Make Reservation</a> 
			<a href="feedback">Feedback</a> 
			<a href="profile" style="margin-left: 690px">Profile</a> 
			<a href="logout" style="margin-left: 10px">Logout</a>
		</div>
	</header>
	
	<div class="container">
	<div class="row">
		 <div class="thumb-box">
		    <img src="https://images.unsplash.com/photo-1461703220177-c637914a6648?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1053&q=80" alt="Ocean View Room of our Hotel">
		     <span class="overlay-box">
		    <span class="meta">Ocean View - $150 per Night</span>
		    </span>
		</div>
		
		<div class="thumb-box">
		    <img src="https://images.unsplash.com/photo-1534359417954-ffa3a669dae9?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80" alt="The mountain View Room of our resort">
		     <span class="overlay-box">
		    <span class="meta">Mountain View - $175 per Night</span>
		    </span>
		</div>
		
		<div class="thumb-box">
		    <img src="https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80" alt="The Resort View room of our resort">
		     <span class="overlay-box">
		    <span class="meta">Resort View - $130 per Night</span>
		    </span>
		</div>
	</div>
	</div>

	<div class="login">
		<form:form action="booking" method="post">
			<div class="login-screen">
				<div class="login-form">
					<div class="app-title">
						<h2 style="text-align:center; padding-bottom: 20px;" >Make Reservation</h2>
					</div>
					<div class="control-group">
						<label class="login-label">Departure Date&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<label class="login-label">Return Date</label><br /> 
						<input type="date" name="departureDate" class="login-field" required>
						<input type="date" name="returnDate" class="login-field" required>
					</div>
					<br />

					<div class="control-group">
						<label class="login-label">Number of Adults&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<label class="login-label">Number of Children</label><br /> 
						<input type="number" name="noOfAdults" class="login-field" min="1" max="" placeholder="1" required> 
						<input type="number" name="noOfKids" class="login-field" min="0" max="" placeholder="1" required>
					</div>
					<br />

					<div class="form-group" style="color: white;">
						<label class="login-label">Room Preference</label><br />
						<br />
						<div class="form-checkbox">
							<label> <input type="radio" name="roomType" value="Ocean View - $150 per night" style="width: 20px;" required> 
								<span></span>Ocean View
							</label> <br /> <br /> 
							<label> <input type="radio" name="roomType" style="width: 20px;" value="Mountain View - $175 per night">
								<span></span>Mountain View
							</label> <br /> <br /> 
							<label> 
								<input type="radio" name="roomType" style="width: 20px;" value="Resort View - $130 per night">
								<span></span>Resort View
							</label>
						</div>
					</div>
					<br /> <br />

					<div class="control-group">
						<label class="login-label" for="login-name">Number of
							Nights&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<label class="login-label" for="login-name">Number of
							Rooms</label><br /> <input type="number" name="noOfNights"
							class="login-field" min="1" placeholder="1" required> <input
							type="number" name="noOfRooms" class="login-field" min="1"
							placeholder="1" required>
					</div>
					<br />
					<div class="control-group">
						<button class="btn " type="submit" class="submit-btn">Proceed</button>
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