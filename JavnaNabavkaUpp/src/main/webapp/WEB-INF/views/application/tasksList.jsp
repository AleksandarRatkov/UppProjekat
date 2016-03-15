<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Pregled zadataka</title>
<link href="<c:url value="/resources/stylesheets/styles.css"/>"
	rel="stylesheet" />
<link href="<c:url value="/resources/stylesheets/reset.css" />"
	rel="stylesheet">

<link href="<c:url value="/resources/stylesheets/animate.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css" />"
	rel="stylesheet">
<script type="text/javascript"
	src="<c:url value="/resources/bootstrap-3.3.6-dist/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="content">
		<div class="container">
<h2 class="center">Pregled zadataka</h2>

<div class="message">${message}</div>

<c:if test="${fn:length(myTasks) > 0}">
<h2>Vaši zadaci</h2>
<ol>
<hr>
<c:forEach var="task" items="${myTasks}">
	<li><a href="${pageContext.request.contextPath}/application/showTask/${task.id}"><c:out value="${task.name}, id = ${task.id}"/></a></li>
</c:forEach>
</ol>
</c:if>

<c:if test="${fn:length(candidateTasks) > 0}">
<h2>Zadaci koje možete prihvatiti</h2>
<hr>
<ol>
<c:forEach var="task" items="${candidateTasks}">
	<li><a href="${pageContext.request.contextPath}/application/claim/${task.id}"><c:out value="${task.name}, id = ${task.id}"/></a></li>
</c:forEach>
</ol>
</c:if>

<div class="home">
		<a href="${pageContext.request.contextPath}/application/welcome">Početna</a>
</div>
</body>
</html>


