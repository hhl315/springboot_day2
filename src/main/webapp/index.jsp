
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <table>
       <tr>id</tr>
       <tr>name</tr>
       <tr>pwd</tr>
       <c:forEach items="users" var="user">
       <tr>
           <td>${user.id}</td>
           <td>${user.name}</td>
           <td>${user.pwd}</td>
       </tr>
       </c:forEach>
   </table>
</body>
</html>
