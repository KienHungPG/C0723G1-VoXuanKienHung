<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<form action="/display-discount" method="post">
  <input name="description" type="text" placeholder="Enter product description">
  <input name="price" type="number" placeholder="Enter product price">
  <input name="discount" type="number" placeholder="Enter discount percent">
  <button type="submit">Calculate</button>
</form>
</body>
</html>