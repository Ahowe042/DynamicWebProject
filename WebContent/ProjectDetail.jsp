<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dealership Catalog - Detail</title>
  <link rel="stylesheet" href="./resources/css/projectDetailStyles.css">
</head>
<body>

<form action="ProjectPage" method="post">
<div id="nav-bar">
	<input type="submit" name="back" value="Back" />
	<input type="hidden" name="carNum" value="0"/>
</div>
</form>

<div id="maincontent">
<h1>Welcome, ${sessionScope.UserName}</h1>
<h2>Selected Car:</h2>
<p>
		<div class="img-with-text">
		<img src=${currentCar.imgPath} alt=${currentCar.makeModelName} width="250px" height="150px"/>
		<p>${currentCar.makeModelName}</p>
		<p>Price $ ${currentCar.price}</p>
		<p>Mileage: ${currentCar.totalMileage}</p>
		<p>Exterior Color: ${currentCar.extColor}</p>
		<p>Interior Color: ${currentCar.intColor}</p>
		<p>MPG: ${currentCar.MPG}</p>
		</div>
</p>

</div>

</body>
</html>
</body>
</html>