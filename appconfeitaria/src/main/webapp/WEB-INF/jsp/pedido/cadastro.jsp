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
	<c:set var="botao" value=""/>

	<c:import url="/WEB-INF/jsp/navbar.jsp"/>
	<div class="container">
	  <h2>Cadastro de Pedidos</h2>
	  <form action="/pedido/incluir" method="post">

	    <div class="form-group">
	      <label>Descrição:</label>
	      <input required type="text" minlength="1" maxlength="30" class="form-control" placeholder="Entre a descrição do pedido" name="descricao">
	    </div>

      <div>
        <label for="web">Atendimento Web:</label>
        <input type="checkbox" id="web" name="web">
      </div>

	  <div class="form-group">
		<c:if test="${not empty clientes}">
			<label>Cliente</label>
			<select name="cliente" id="form-control">
				<c:forEach var="c" items="${clientes}">
					<option value="${c.id}">${c.nome}</option>
				</c:forEach>
			</select>
		</c:if> 

		<c:if test="${empty clientes}">
			<c:set var="botao" value="disabled"/>
			<label>Não existem solicitantes cadastrados.</label>
		</c:if>
	  </div>

	  <div class="form-group"> 
		<c:if test="${not empty doces}">
			<label>Doces</label>
			<c:forEach var="d" items="${doces}">
				<div class="form-check">            
					<label class="form-check-label">
						<input type="checkbox" name="doces" value="${d.id}" class="form-check-input">
						${d.nome}
					</label>
				</div>
			</c:forEach>
		</c:if>

		<c:if test="${empty doces}">
			<c:set var="botao" value="disabled"/>
			<label>Não existem doces cadastrados.</label>
		</c:if>
	  </div>
        
	    <button ${botao} type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>
</body>
</html>