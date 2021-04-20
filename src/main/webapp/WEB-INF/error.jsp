<!-- Name: Sharang Verma
 	 Student Number: 300981587
 	 Submission Date: March 7, 2021 
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sharang Hotel Reservation</title>
<!-- <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/result.css" /> -->
<style>
	 * {
		box-sizing: border-box;
		}
		
		*:focus {
		  outline: none;
		}
		*::before,
		*::after {
		  content: '';
		}
		body {
		font-family: 'Lato', Verdana, sans-serif;
		background: url("http://k46.kn3.net/taringa/B/3/5/9/B/C/WIk4N/66D.jpg") center/cover fixed;
		}
		.login {
		margin: 20px auto;
		width: 850px;
		padding-top: 40px;
		}
		.login-screen {
		background-color: rgba(0,0,0,0.6);
		overflow: hidden;
		padding: 2em;
		border-radius: 10px;
		box-sizing: border-box;
		box-shadow: 0 15px 25px rgba(0,0,0,.6);
		}
		
		.login-screen::before {
		  display: block;
		  position: absolute;
		  filter: blur(5px);
		  z-index: -1;
		}
		.app-title {
		text-align: center;
		color: white;
		}
		
		.login-form {
		text-align: left;
		color: white;
		}
		.control-group {
		margin-bottom: 10px;
		}
		
		label.login-label{
		color: white;
		}
		
		.login-link {
		  color: #1ce1ff;
		  display: block;
		  margin-top: 12px;
		  text-align: center;
		}
		
		header{
		color: white;
		text-align: center;
		}
		
		footer{
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
</style>
</head>
<body>
	<header>
		<div class="topnav">
			<a>Trip Planner - Book Hotel Rooms</a>
			<a class="active" href="home">Home</a> 
			<a href="booking">Make Reservation</a> 
			<a href="feedback">Feedback</a> 
			<a href="profile" style="margin-left:690px">Profile</a>
			<a href="logout" style="margin-left:10px">Logout</a>
		</div>
	</header>
	<div class="login">
	    	<div class="login-screen">
	      		<div class="app-title">
	       			<h2>OOPS!! We are sorry</h2>
	       			<c:if test="${exceptionMessage != null}">
						<h3 style="color:red;">${exceptionMessage}</h3>
					</c:if>
	      		</div>
	      		<br/>
			    <h2 class="login-link"><a href="home" style="color:white; text-decoration:none;">Back</a></h2>
			    <br />
			</div>
	</div>
	<footer>
			&copy;2021 Sharang Verma - Java EE Programming 
			<br />All Rights Reserved
  	</footer>	     
</body>
</html>