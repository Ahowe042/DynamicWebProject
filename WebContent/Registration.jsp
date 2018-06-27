<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<div id="Header">
			<p><img src="./resources/logo2.png" align = "center" height="150" width="600"></p>
			</div>

			<form  action="ProjectPage" method="post"> 
			<body bgcolor="#C0C0C0">
			
				<h1> Register </h1>
				<p> 
					<label>First Name: </label>
					<input id="usernamesignup" name="firstname" required="required" type="text" placeholder="Enter First Name" />
				</p>
				<p> 
					<label>Last Name: </label>
					<input id="usernamesignup" name="lastname" required="required" type="text" placeholder="Enter Last Name" />
				</p>
				<p> 
					<label>Username: </label>
					<input id="usernamesignup" name="username" required="required" type="text" placeholder="Enter User Name" />
				</p>
				<p> 
					<label>Email: </label>
					<input id="emailsignup" name="email" required="required" type="email" placeholder="Enter your Email"/> 
				</p>
				<p> 
					<label>Password: </label>
					<input id="passwordsignup" name="password" required="required" type="password" placeholder="Password"/>
				</p>
				<p> 
					<label>Confirm Your Password: </label>
					<input id="passwordsignup_confirm" name="password_confirm" required="required" type="password" placeholder="Confirm Password"/>
				</p>
				<p class="signin button">
					<input type="hidden" name="carNum" value="0"/>
					<input type="submit" value="Sign up"/> 
				</p>
				<tr><td><button type="Reset" >Reset</button></td></tr> 
				<p class="change_link">  
					Already a member ?
					<a href="WelcomePage"> Click here to login </a>
					
				</p>
			</form>
		</div>
		
	</div>
</body>
</html>