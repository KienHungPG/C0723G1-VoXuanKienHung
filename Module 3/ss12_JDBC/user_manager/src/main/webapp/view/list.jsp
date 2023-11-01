<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/1/2023
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>List of user</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h2>User List</h2>
<form action="/user-servlet?action=search" method="post">
    <input type="text" name="country" placeholder="Search by country">
    <button type="submit">Search</button>
</form>
<p><a href="user-servlet?action=create">Insert User</a></p>
<table>
    <tr>
        <th>No.</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${userList}" var="user" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td><a href="user-servlet?action=view&id=${user.id}">${user.getName()}</a></td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
            <td><a href="user-servlet?action=edit&id=${user.id}">edit</a></td>
            <td><a href="user-servlet?action=delete&id=${user.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>



</body>
</html>
