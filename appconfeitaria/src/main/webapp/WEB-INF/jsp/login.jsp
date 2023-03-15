<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppConfeitaria</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/navbar.jsp"/>
	<div class="container">
		<h2>Autenticação</h2>

		<c:if test="${not empty alertaCredencialEmail}">
			<div class="alert alert-danger">
				<strong>Atenção!</strong> ${alertaCredencialEmail}
			</div>
		</c:if>

		<form action="/login" method="post">

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input value="luan.almeida@al.infnet.edu.br" type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	    </div>

	    <div class="form-group">
	      <label>Senha:</label>
	      <input value="luan.almeida@al.infnet.edu.br" type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
	    </div>

	    <button type="submit" class="btn btn-default">Acessar</button>
	  </form>
	</div>

</body>
</html>