<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Customers</title>

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
   <div id="content">
   
  <input type="button" value="Jodo Graahak" 
  onclick="window.location.href='showFormForAdd'; return false;"
  class="add-button"
  /> 
   <table>
   <tr>
   <th>First Name</th>
   <th>Last Name</th>
   <th>Email</th>
   <th>Action</th>
   </tr>
   
   <c:forEach var="tempCustomer" items="${customers}">
   
   <c:url var="updateLink" value="/customer/showForUpdate">
   <c:param name="customerId" value="${tempCustomer.id}"></c:param>
   </c:url>
   
   <c:url var="deleteLink" value="/customer/graahakHataao">
   <c:param name="customerId" value="${tempCustomer.id}"></c:param>
   </c:url>
   
   <tr>
   <td>${tempCustomer.firstName}</td>
   <td>${tempCustomer.lastName}</td>
   <td>${tempCustomer.email}</td>
   <td><a href="${updateLink}">Parivartan kare</a>
   | <a href="${deleteLink}">Graah hataaye</a>
   </td>
   </tr>
   
   </c:forEach>
   </table>
   
   </div>
   </div>

</div>
</body>
</html>