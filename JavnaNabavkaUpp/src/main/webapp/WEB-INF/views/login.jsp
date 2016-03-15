<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

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


	<div id="container">

		<form name='f' class="form-horizontal" action="<c:url value='j_spring_security_check' />"
			method='POST'>

			<c:if test="${not empty error}">
				<div class="errorblock">
				Your login attempt was not successful, try again.<br /> Caused :
				${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
				</div>
			</c:if>

		
			<label for="name" class="col-md-4 control-label">Koriničko ime:</label>
			<input type="text" name='j_username' value='' > 
				
			<label for="username" class="col-md-4 control-label">Lozinka:</label>
			<input type="password" name='j_password'>

			<div class="upperLine">
				
				<input type="submit" class="login" value="Login">
			</div>


		</form>

	</div>



</body>

</html>






