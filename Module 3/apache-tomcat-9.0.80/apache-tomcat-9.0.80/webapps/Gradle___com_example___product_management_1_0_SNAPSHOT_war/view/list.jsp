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
    <title>Title</title>
</head>
<body>
<div>
    <h1>DANH SÁCH SẢN PHẨM</h1>
    <div>
        <table>
            <tr>
                <th>STT</th>
                <th>ID</th>
                <th>Tên sản phẩm</th>
                <th>Giá</th>
                <th>Mô tả</th>
                <th>Hãng sản xuất</th>
            </tr>
            <c:forEach var="product" items="${productList}" varStatus="loop">
                <tr>
                    <td>${loop.count}</td>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.description}</td>
                    <td>${product.manufacturer}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
