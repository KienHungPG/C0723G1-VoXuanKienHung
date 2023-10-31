<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/31/2023
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Result</h1>
<c:if test="${exception!=null}">
    <h5>
            ${exception}
    </h5>
</c:if>
<c:if test="${exception==null}">
    <h5>
            ${firstOperand} ${operator} ${secondOperand} = ${result}
    </h5>
</c:if>
</body>
</html>
