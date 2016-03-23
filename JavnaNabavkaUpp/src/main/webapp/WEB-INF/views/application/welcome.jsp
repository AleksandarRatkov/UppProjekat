<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>Welcome</title>


<link href="<c:url value="/resources/stylesheets/styles.css"/>"
	rel="stylesheet" />

<link href="<c:url value="/resources/stylesheets/reset.css" />"
	rel="stylesheet">

<link href="<c:url value="/resources/stylesheets/animate.css" />"
	rel="stylesheet">
<script type="text/javascript"
	src="<c:url value="/resources/bootstrap-3.3.6-dist/js/bootstrap.min.js" />"></script>
<link
	href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css" />"
	rel="stylesheet">




</head>

<body>
	<div class="content">
		<div class="container">
	<h3>Dobrodošli ${username}!</h3>
		
	<div class="message">${message}</div>		
	<hr>
	
	<a href="./tasksList">Pregled zadataka</a> <br/>
	<hr>
	<c:if test="${narucilac==true}" > <a href="./newInstance">Pokretanje nove instance</a> <br/> <hr></c:if>
	
	<a href="./seeHistory">Pregled istorije zadataka</a> <br/>
	<hr>
	
	<br />
	<a href="<c:url value="/j_spring_security_logout" />"> Logout</a>
	
</body>
</div>
</div>
</html>