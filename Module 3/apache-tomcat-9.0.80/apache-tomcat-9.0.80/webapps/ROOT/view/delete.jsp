<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/31/2023
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Xóa sản phẩm</h1>
<p><a href="/product">Trở về trang chính</a> </p>

<form action="/product?action=delete&id=${product.getId()}"method="post">
    <h3>Bạn có mốn xóa không</h3>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Tên sản phẩm</td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td>Giá sản phẩm</td>
                <td>${product.getPrice()}</td>
            </tr>
            <tr>
                <td>Mô tả sản phẩm</td>
                <td>${product.getDescription()}</td>
            </tr>
            <tr>
                <td>Nhà sản xuất</td>
                <td>${product.getManufacturer()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete Product?"></td>
                <td><a href="/product">Trở về trang chính</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
