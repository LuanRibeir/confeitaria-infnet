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
	  <h2>Cadastro de Cliente</h2>
	  <form action="/cliente/incluir" method="post">

	    <div class="form-group">
	      <label>Nome:</label>
	      <input required type="text" minlength="1" maxlength="20" class="form-control" placeholder="Entre o nome:" name="nome">
	    </div>

        <div class="form-group">
            <label>CPF:</label>
            <input required type="text" name="cpf" class="form-control" pattern="(\d{3}\.?\d{3}\.?\d{3}-?\d{2})|(\d{2}\.?\d{3}\.?\d{3}/?\d{4}-?\d{2})" placeholder="Digite um CPF no formato: xxx.xxx.xxx-xx">
        </div>

        <div class="form-group">
            <label>Telefone:</label>
            <input required type="number" min="1" max="9999999999" class="form-control" placeholder="Entre o telefone." name="telefone">
        </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>
</body>
</html>