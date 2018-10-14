<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<style type="text/css">	h4{color:yellow;}</style>
<title>Insert title here</title>
<link rel ="stylesheet" type ="text/css" href ="css/navbar.css">
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <form method ="post" action ="registerController?command=reload"><input type ="image" src=image/남학생안정실.png width="150px"></form>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
      <c:if test="${not empty sessionScope.name }"> <li><h4>★${name}★</h4></li></c:if>
      <c:if test="${not empty sessionScope.name}"><li><a href ="jsp/signup.jsp">회원가입</a></li></c:if>
      <li><a href ="https://www.shillahotels.com/index.do">둘러보기</a></li>
	  <li><a href ="#">건의하기</a></li>
      <c:if test="${not empty sessionScope.name }"><li><a href ="loginlogout?command=logout">로그아웃</a></li></c:if>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <c:if test="${empty sessionScope.name}"><li><a href ="jsp/login.jsp">로그인</a></li></c:if>
      </ul>
    </div>
  </div>
</nav>

</body>
</html>