<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/1/2023
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/product">Trở về trang chính</a>
</p>
<table>
    <tr>
        <td>Tên sản phẩm: </td>
        <td>${product.name}</td>
    </tr>
    <tr>
        <td>Giá sản phẩm: </td>
        <td>${product.price}</td>
    </tr>
    <tr>
        <td>Mô tả sản phẩm: </td>
        <td>${product.description}</td>
    </tr>
    <tr>
        <td>Nhà sản xuất: </td>
        <td>${product.manufacturer}</td>
    </tr>
</table>
</body>
</html>
