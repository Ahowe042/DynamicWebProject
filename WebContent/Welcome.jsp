<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TOMO DEALERSHIP</title>
<link rel="stylesheet" href="styles.css">	
</head>
<body bgcolor="#C0C0C0">
<h1>Welcome to</h1>
    <div id="Container">
        <div id="Header">
			<p><img src="./resources/logo2.png" align = "center"></p>
		<div id="Images01">
		    <div id="Content">
            <div id="Login">
                <form action="ProjectPage" method="post">
					<table align = "right" bgcolor=#808080 height= 350 width = 450>
						<tr><td align = "center"><b>Please Login Here</b></td>
						<c:if test="${hasUName ge false}">
						<tr><td align = "left">PLEASE TYPE BOTH USERNAME AND PASSWORD</td>
                        </c:if>
                        <tr><td align = "left">Username: </td>
                            <td rowspan="9" align="right">
                            </td>
                        </tr>
                        <tr>
                            <td><input name="username" type="text" size="30"></td>
                            <td></td>
                        </tr>
                        <tr><td align = "left">Password: </td></tr>
                        <tr><td><input name="password" type="password" size="30"></td></tr>
                        <input type="hidden" name="carNum" value="0">
						<div id="SubLog">
                        <tr><td align = "left"><input type="submit" value="LOGIN"></td></tr> 
						</div>
						 <tr><td><button type="Reset" >Reset</button></td></tr> 
						<tr><td align = "left">Not yet registered? <a href="./Registration.jsp">Register Here</a></td></tr>
							<tr><td><a href="./About.jsp">About us</a></td></tr>
                    </table>
                </form>
            </div>
        </div>
		<c:forEach items="${CarImageSet}" var="newImg">
		  <image src=${newImg} height="160" width="240"></image>
		</c:forEach>
        <div id="Footer">
            Copyright &copy; CSC 363 Winter 2018 TOMO. Made by Anthony Howell & Mohammed Salam
        </div>
    </div>  
</body>
</html>