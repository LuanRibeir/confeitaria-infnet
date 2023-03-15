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
    <h3>Listagem de Bolos</h3>

    <c:if test="${not empty bolos}">       
      <div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem} Quantidade de bolos cadastrados: ${bolos.size()}.
			</div>
    </c:if>

    <c:if test="${empty bolos}">
      <div class="alert alert-info">
				<strong>Atenção!</strong> Não existem bolos cadastrados.
			</div>
    </c:if>

    <form action="/bolo" method="get">
        <button type="submit" class="btn btn-success">
          <span class="glyphicon glyphicon-plus"></span>
        </button>
    </form> 
    
  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>Código</th>
        <th>Nome</th>
        <th>Sabor</th>
        <th>Kilo</th>
        <th>Valor Kilo</th>
        <th>Formato</th>
        <th>Sabor da Cobertura</th>
        <th>Número de Camadas</th>
        <th>Valor</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="u" items="${bolos}" >
        <tr>
          <td>${u.id}</td>
          <td>${u.codigo}</td>
          <td>${u.nome}</td>
          <td>${u.sabor}</td>
          <td>${u.kilo}</td>
          <td>${u.valorKg}</td>
          <td>${u.formato}</td>
          <td>${u.saborCobertura}</td>
          <td>${u.camadas}</td>
          <td>$${u.calcularValorPorKilo()}</td>
          <td>
            <form action="/bolo/${u.id}/excluir" method="get">
              <button type="submit" class="btn btn-danger">
                <span class="glyphicon glyphicon-remove"></span>
              </button>
            </form> 
        </td>
        </tr>
      </c:forEach>
    </tbody>
    </table>		
  </div>
</body>
</html>