<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2023
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert</title>
</head>
<body>
<p><a href="/?action=">User List</a></p>
<form method="post" action="/?action=insert">
    <fieldset>
        <legend>Creat User</legend>
        <table>
            <tr>
                <td>User name:</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>User email:</td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            <tr>
                <td>User country:</td>
                <td><input type="text" name="country" id="country"></td>
            </tr>
            <tr>
                <td>Permission</td>
                <td>
                    <input type="checkbox" name="add" size="15"/>add |
                    <input type="checkbox" name="edit" size="15"/>edit |
                    <input type="checkbox" name="delete" size="15"/> delete |
                    <input type="checkbox" name="view" size="15"/> view
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Create">
                </td>
            </tr>
        </table>
    </fieldset>

</form>

</body>
</html>
