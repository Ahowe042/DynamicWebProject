<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dealership Catalog</title>
  <link rel="stylesheet" href="./resources/css/projectDetailStyles.css">
</head>
<body>

<form action="./LogoutServlet" method="post">
<div id="nav-bar">
	<input type="submit" name="Logout" value="Logout" />
</div>
</form>

<div id="maincontent">
<img src="./resources/logo2.png" align = "center" height="50" width="200">
<h1>Welcome, ${sessionScope.UserName}</h1>
<h2>Current Inventory:</h2>

<p>
	
	<c:forEach items="${AvailableCars}" var="car">
		<div class="img-with-text">
		<img src=${car.imgPath} alt=${car.makeModelName} width="250px" height="150px"/>
		<p>${car.makeModelName}</p>
		<p>Price $ ${car.price}</p>
		<form action="ProjectPage" method="post">
		  <button type="submit" name="MoreInfo">More Info</button>
		  <input type="hidden" name="carNum" value=${car.ID}>
		</form>
		<br>
		</div>
	</c:forEach>
	
</p>

</div>

</body>
</html>
</body>
</html>