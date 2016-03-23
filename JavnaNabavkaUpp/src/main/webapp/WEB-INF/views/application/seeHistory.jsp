<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
		        <hr>
		
	 <table class="table table-bordered">
          <thead>
            <tr>
              <th>Aktivni procesi</th>
            </tr>
          </thead>
          <tbody>
              <c:if test="${fn:length(unfinishedInstances) > 0}">
              <c:forEach var="p" items="${unfinishedInstances}">
            <tr>
              <td>${p}</td>
            </tr>
            </c:forEach>
            </c:if>
          </tbody>
        </table>
        <hr>
         <table class="table table-bordered">
          <thead>
            <tr>
              <th>Zavrseni procesi</th>
            </tr>
          </thead>
          <tbody>
              <c:if test="${fn:length(finishedInstances) > 0}">
              <c:forEach var="p" items="${finishedInstances}">
            <tr>
              <td>${p}</td>
            </tr>
            </c:forEach>
            </c:if>
          </tbody>
        </table>
                <hr>
        
         <table class="table table-bordered">
          <thead>
            <tr>
              <th>Procesi na koje se ceka</th>
            </tr>
          </thead>
          <tbody>
              <c:if test="${fn:length(taskOnWait) > 0}">
              <c:forEach var="p" items="${taskOnWait}">
            <tr>
              <td>${p}</td>
            </tr>
            </c:forEach>
            </c:if>
          </tbody>
        </table>
	
</body>
</div>
</div>
</html>