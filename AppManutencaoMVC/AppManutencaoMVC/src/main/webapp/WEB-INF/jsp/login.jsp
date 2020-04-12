<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<spring:url var="js" value="/resources/js"/>
<spring:url var="img" value="/resources/images"/>
<spring:url var="css" value="/resources/css"/>

<!DOCTYPE html>
<html ang="en">
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" type="text/css" href="${css}/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${css}/login.css">
<link rel='shortcut icon' type='image/x-icon' href='${img}/favicon.ico' />
<title>Login</title>
</head>
<body>
<div class="container">
	<div id="login-box">
		<div class="logo">
			<img src="${img}/person_icon.png" class="img img-responsive img-circle center-block"/>
			<h1 class="logo-caption"><span class="tweak">L</span>ogin</h1>
		</div>
		<div class="controls">			
			<form action="/login" method="post">
				<div class="form-group">
				    <label for="InputLogin">Login</label>
				    <input type="text" class="form-control" id="InputLogin" aria-describedby="login" placeholder="Usuario" name="login">
				  </div>
				  <div class="form-group">
				    <label for="InputSenha">Senha</label>
				    <input type="password" class="form-control" id="InputSenha" aria-describedby="senha" placeholder="Senha" name="password">
				  </div>
				
				<c:if test="${erro != null}">  
					<div class="alert alert-danger" role="alert">
					  ${erro}
					</div>
				</c:if>
				
				<button type="submit" class="btn btn-default btn-block btn-custom">Entrar</button>
			</form>			
		</div>
	</div>
</div>
<div id="particles-js"></div>

<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.min.js"></script>
<script src="${js}/login.js"></script>
</body>
</html>




