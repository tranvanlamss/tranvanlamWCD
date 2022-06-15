<%--
  Created by IntelliJ IDEA.
  User: lamt6
  Date: 15/06/2022
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <h1 style="text-align: center;">Update Phone</h1>
    <form action="update" method="post">
        <div class="form-group">
            <label for="exampleInputName">Name</label>
            <input type="text" name="name" class="form-control" id="exampleInputName"  placeholder="Enter name">
        </div>
        <div class="form-group">
            <label for="exampleInputBrand">Brand</label>
            <input type="text" name="brand" class="form-control" id="exampleInputBrand" placeholder="Brand">
        </div>
        <div class="form-group">
            <label for="exampleInputPrice">Price</label>
            <input type="number" name="price" class="form-control" id="exampleInputPrice" placeholder="Price">
        </div>
        <div class="form-group">
            <label for="exampleInputDescription">Description</label>
            <input type="text" name="description" class="form-control" id="exampleInputDescription" placeholder="Description">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>


</body>
</html>
