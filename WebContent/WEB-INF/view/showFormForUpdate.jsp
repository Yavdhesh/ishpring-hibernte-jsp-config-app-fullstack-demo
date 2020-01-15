<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jaankaari Parivartan</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />

</head>
<body>

<div id="wrapper">
   <div id="header">
   <h2>
   CRM- Customer Relationship Manager
   </h2>
   </div>
   
   <div id="container">
   <h3> Samrakshit karo Graahk ko</h3>
   
   <form:form action="badloCustomer" modelAttribute="graahakBadlo" method="POST">
   <form:hidden path="id"/>
   <table>
   <tbody>
   
   </tbody>
   <tr>
   <td><label>Pratham Naame</label></td>
   <td><form:input  path="firstName" /> </td>
   
   </tr>
   
   <tr>
   <td><label>Up Naame</label></td>
   <td><form:input  path="lastName" /> </td>
   
   </tr>
   
   <tr>
   <td><label>Email</label></td>
   <td><form:input  path="email" /> </td>
   
   </tr>
   
   <tr>
   <td><label>Kar do jhat pat</label></td>
   <td> 
   <input type="submit" value="Samrakshana"/> </td>
   
   </tr>
   
   </table>
  
   
   </form:form>
   
   <div style="clear;both;">
   
   <a href="${pageContext.request.contextPath}/customer/list">Graahak Soochi pristha par punah jaaye</a>
   
   </div>
   
   </div>

</body>
</html>