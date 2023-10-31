<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/31/2023
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
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
    img {
      width: 10%;
    }
  </style>
</head>
<body>
<div>
  <h1>DANH SÁCH KHÁCH HÀNG</h1>
  <div>
    <table>
      <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
      </tr>
      <c:forEach var="customer" items="${customerList}">
        <tr>
          <td>${customer.name}</td>
          <td>${customer.birthday}</td>
          <td>${customer.address}</td>
          <td><img src="${customer.image}" alt="avt"></td>
        </tr>
      </c:forEach>
    </table>
  </div>
</div>
</body>
</html>
