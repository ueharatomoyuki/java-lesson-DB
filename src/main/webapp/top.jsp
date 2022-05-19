<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Top</title>
</head>
<body>
  <p>検索条件を入力して下さい  </p>
  <form action="logindb" method="post">
    product_name <input type="text" name="name"><br>
    price <input type="text" name="price"><br>
    <button type="submit">検索</button>
  </form>

</body>
</html>