<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/1/2023
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Display User Information</title>
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
<form action="customer-servlet?action=view" method="get">
  <table>
    <tr>
      <th>Name</th>
      <th>Email</th>
      <th>Country</th>
    </tr>
    <tr>
      <input type="hidden" name="id" value="${user.getId()}">
    </tr>
    <tr>
      <td>${user.getName()}</td>
      <td>${user.getEmail()}</td>
      <td>${user.getCountry()}</td>
    </tr>
  </table>
</form>
<a href="user-servlet">Back to User List</a>
</body>
</html>
