<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Flights</title>
</head>
<body>
<h2>List of Flights</h2>
<table border='1'>
<tr>

<th>operatingAirlines</th>
<th>departureCity</th>
<th>arrivalCity</th>
<th>dateOfDeparture</th>
<th>Select Flight</th>
</tr>

<c:forEach items="${findFlight}" var="findFlight">
<tr>

<td>${findFlight.operatingAirlines}</td>
<td>${findFlight.departureCity}</td>
<td>${findFlight.arrivalCity}</td>
<td>${findFlight.dateOfDeparture}</td>
<td><a href="showCompleteReservation?flightId=${findFlight.id}">Select</a></td>

</tr>

</c:forEach>
</table>
</body>
</html>