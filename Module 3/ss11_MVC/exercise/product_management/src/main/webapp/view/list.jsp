<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/31/2023
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/product?action=create">Thêm mới sản phẩm</a>
</p>
<p>
    <a href="/product?action=search">Tìm kiếm</a>
</p>
<span>
<c:if test="${msg != null}">
    ${msg}
</c:if>
</span>
<table border="1px">
    <tr>
        <td>Tên sản phẩm</td>
        <td>Giá sản phẩm</td>
        <td>Mô tả của sản phẩm</td>
        <td>Nhà sản xuất</td>
        <td>Sửa thông tin</td>
        <td>Xóa sản phẩm</td>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td><a href="/product?action=detail&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getManufacturer()}</td>
            <td><a href="/product?action=update&id=${product.getId()}">Chỉnh sửa</a> </td>
            <td><a href="/product?action=delete&id=${product.getId()}">Xóa</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
