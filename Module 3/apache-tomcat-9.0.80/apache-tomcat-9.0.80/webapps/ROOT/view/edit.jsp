<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/1/2023
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit User</title>
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
<h2>Edit User</h2>
<form action="user-servlet?action=edit" method="post">
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
            <td><input type="text" name="name" value="${user.getName()}"></td>
            <td><input type="text" name="email" value="${user.getEmail()}"></td>
            <td><input type="text" name="country" value="${user.getCountry()}"></td>
            <td><button type="submit">Edit</button></td>
        </tr>
    </table>

</form>
</body>
</html>
