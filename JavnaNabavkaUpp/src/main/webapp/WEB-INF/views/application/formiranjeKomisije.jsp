<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">



<title>Formiranje komisije</title>

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

			<!-- Include the plugin's CSS and JS: -->
			<script type="text/javascript"
				src="/resources/js/bootstrap-multiselect.min.js"></script>
			<link rel="stylesheet"
				href="/resources/css/bootstrap-multiselect.css" type="text/css" />
			<script type="text/javascript">
				$(document).ready(function() {
					$('#example-getting-started').multiselect();
					$('#sluzbenici').multiselect();
					$('#stranaLica').multiselect();
				});
			</script>
			<h2>Zadatak ${task.name}</h2>


			<c:if test="${fn:length(formProperties) > 0}">
				<form name='f' class="form-horizontal"
					action="<c:url value='/application/execute/${task.id}' />"
					method='POST'>

					<fieldset>

						<!-- 
Treba jos dodati validaciju (da li su uneta required obelezja, 
da li su uneta slova iako je tip long - ili obezbediti da se to onemoguci
Pokriti unos datuma
Pokusati smestiti u poseban jsp fajl forme, pa ukljuciti pomocu include
 -->
			</c:if>

			<c:forEach var="formProperty" items="${formProperties}">

				<c:if test="${formProperty.readable == true}">

					<div class="form-group">
						<label class="col-md-4 control-label" for="textinput">${formProperty.name}</label>


						<c:if
							test="${formProperty.type.name.equals('string') || formProperty.type.name.equals('long') || formProperty.type.name.equals('double')
	||  formProperty.type.name.equals('date') }">
							<div class="col-md-4">
								<input type="text" class="form-control input-md"
									<c:if test="${formProperty.writable==true}" > name="${formProperty.id}"</c:if>
									<c:if test="${formProperty.writable==false}"> disabled </c:if>
									value="${formProperty.value}" />
							</div>
						</c:if>

						<c:if test="${formProperty.type.name.equals('boolean')}">
							<div class="col-md-4">
								<div class="radio">
									<input type="checkbox"
										<c:if test="${formProperty.writable==true}"> name="${formProperty.id}"</c:if>
										<c:if test="${formProperty.writable==false}"> disabled </c:if>
										<c:if test="${formProperty.value==true}">checked </c:if> />
								</div>
							</div>
						</c:if>

						<c:if test="${formProperty.type.name.equals('enum')}">
							<div class="col-md-4">
								<select class="form-control"
									<c:if test="${formProperty.writable==true}"> name="${formProperty.id}"</c:if>
									<c:if test="${formProperty.writable==false}"> disabled </c:if>>

									<c:forEach var="key"
										items="${formProperty.getType().getInformation('values').keySet()}">
										<option value="${key}">${formProperty.getType().getInformation('values').get(key)}</option>
									</c:forEach>
								</select>
							</div>

						</c:if>
					</div>
					<c:if test="${formProperty.readable == false}">
						<input type="hidden" name="${formProperty.id}"
							value="${formProperty.value}" />
					</c:if>
					<br />
				</c:if>
			</c:forEach>
			<div class="form-group">
				<label class="col-md-4 control-label">Službenik za javne
					nabavke</label>
				<div class="col-md-4">
					<select id="sluzbenici" name="sluzbenici">
						<c:forEach var="sluzbenik" items="${listaSluzbenika}">
							<option value="${sluzbenik.id}">${sluzbenik.firstName} ${sluzbenik.lastName}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">Lice sa drugim
					stepenom obrazovanja na pravnom fakultetu</label>
				<div class="col-md-4">
					<select class="form-control" name="pravnik">
						<c:forEach var="pravnik" items="${listaPravnika}">
							<option value="${pravnik.id}">${pravnik.firstName} ${pravnik.lastName}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<br />
			<div class="form-group">
				<label class="col-md-4 control-label">Stručno strano lice</label>
				<div class="col-md-4">
					<select id="stranaLica" name="stranaLica">
						<c:forEach var="stranoLice" items="${listaStranihLica}">
							<option value="${stranoLice.id}">${stranoLice.firstName} ${stranoLice.lastName}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<br />


			<div class="col-md-4 control-label">
				<input type="submit" value="Potvrda" class="btn btn-success">
			</div>
			</fieldset>
			</form>


		</div>
	</div>
</body>
</html>
