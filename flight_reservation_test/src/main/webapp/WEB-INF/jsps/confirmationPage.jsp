<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Details</title>
</head>
<body>
<h2>Your Ticket is Confirmed</h2>
Flight Details
<table border='1'>
<tr>
<td>Passenger First Name:</td>
<td>${firstName}</td>
</tr>
<tr>
<td>Passenger Last Name:</td>
<td>${lastName}</td>
</tr>
<tr>
<td>Passenger Middle Name:</td>
<td>${middleName}</td>
</tr>

<tr>
<td> Age:</td>
<td>${age}</td>
</tr>
<tr>
<td>Gender:</td>
<td>${gender}</td>
</tr>
<tr>
<td>Meals:</td>
<td>${meals}</td>
</tr>


</table>

</body>
</html>