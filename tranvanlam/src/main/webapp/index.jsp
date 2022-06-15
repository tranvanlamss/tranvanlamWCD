<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
    <div class="container">
        <h1 style="text-align: center">
            Phone List
        </h1>
        <br/>
        <td><a href="create.jsp" style="float: right;">Add New Employee</a></td>
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Brand</th>
                <th scope="col">Price</th>
                <th scope="col">Description</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="items" items="${requestScope.phones}">
                <tr>
                    <td>${items.name}</td>
                    <td>${items.brand}</td>
                    <td>${items.price}</td>
                    <td>${items.description}</td>
                    <td><a href="update?id=<c:out value='${items.id}'/>">Edit</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</body>

</html>