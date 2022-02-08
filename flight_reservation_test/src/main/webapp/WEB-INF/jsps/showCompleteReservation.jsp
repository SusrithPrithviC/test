<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show Complete Reservation</title>
</head>
<body>
<h2>Flight Details</h2>

operating Airlines:${flight.operatingAirlines}
<br/>
departure City:${flight.departureCity}
<br/>
arrival City:${flight.arrivalCity}
<br/>
date Of Departure:${flight.dateOfDeparture}
<br/>
<h2>Enter the Passenger Details</h2>
<form action="confirmReservation" method="post">
<table>
<tr>
<td>first Name</td>
<td><input type="text" name="firstName"/>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName"/>
</tr>
<tr>
<td>Middle Name</td>
<td><input type="text" name="middleName"/>
</tr>
<tr>
<td>Age</td>
<td><input type="text" name="age"/>
</tr>
<tr>
<td>Gender</td>
<td><input type="text" name="gender"/>
</tr>
<tr>
<td>Meals</td>
<td><input type="text" name="meals"/>
</tr>
<tr>
<td><input type="hidden" name="flightId" value="${flight.flightId}"/>
</tr>
<tr>
<td><input type="submit" value="save"/>
</tr>
</table>
</form>

</body>
</html>