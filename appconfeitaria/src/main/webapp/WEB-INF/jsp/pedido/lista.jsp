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
    <h3>Listagem de Pedidos</h3>

    <c:if test="${not empty pedidos}">       
      <div class="alert alert-info">
				<strong>Atenção!</strong> ${mensagem} Quantidade de pedidos cadastrados: ${pedidos.size()}.
			</div>
    </c:if>

    <c:if test="${empty pedidos}">
      <div class="alert alert-warning">
				<strong>Atenção!</strong> Não existem pedidos cadastrados.
			</div>
    </c:if>

    <form action="/pedido" method="get">
        <button type="submit" class="btn btn-success">
          <span class="glyphicon glyphicon-plus"></span>
        </button>
    </form> 
    
  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>Descrição</th>
        <th>Web</th>
        <th>Data</th>
        <th>Cliente</th>
        <th>Doces</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="p" items="${pedidos}" >
        <tr>
          <td>${p.id}</td>
          <td>${p.descricao}</td>
          <td>${p.web}</td>
          <td>${p.data}</td>
          <td>${p.cliente.nome}</td>
          <td>${p.doces.size()}</td>
          <td>
            <form action="/pedido/${p.id}/excluir" method="get">
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