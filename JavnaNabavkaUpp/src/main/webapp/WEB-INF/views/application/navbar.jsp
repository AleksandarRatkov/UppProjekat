<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="/resources/js/jquery.min.js"></script>
<link rel="stylesheet" href="/resources/bootstrap-3.3.6/css/bootstrap.min.css" type="text/css"/>
<script type="text/javascript" src="/resources/bootstrap-3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/resources/css/navbar.css" type="text/css"/>
<div id="custom-bootstrap-menu" class="navbar navbar-default " role="navigation">
    <div class="container-fluid">
        <div class="navbar-header"><a class="navbar-brand" href="#">Javna Nabavka</a>
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-menubuilder"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse navbar-menubuilder">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="${pageContext.request.contextPath}/application/welcome">Početna</a>
                </li>
                <li><a href="<c:url value="/j_spring_security_logout"/>">Odjava</a>
                </li>
            </ul>
        </div>
    </div>
</div>
     
     
     
     
     
     
     
     
     
   