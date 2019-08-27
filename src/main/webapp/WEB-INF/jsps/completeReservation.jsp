<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Complete Reservation</h2>
Airline: ${flights.operatingairline}<br>
Airline: ${flights.departurecity}<br>
Airline: ${flights.arrivalcity}<br>

<form action="completeReservation" method="post">
<pre>
<h2>Passenger details</h2>
First name:<input type="text" name="passengerFirstName">
Last name:<input type="text" name="passengerLastName">
Email:<input type="text" name="passengerEmail">
Phone:<input type="text" name="passengerPhone">

<h2>Card details</h2>
Name on card:<input type="text" name="nameOnCard">
Card no:<input type="text" name="cardNumber">
Expiry date:<input type="text" name="expiryDate">
CVV:<input type="text" name="CVV">

<input type="hidden" name="flightId" value="${flights.id}">
<input type="submit" value="confirm">
</pre>
</form>


</body>
</html>