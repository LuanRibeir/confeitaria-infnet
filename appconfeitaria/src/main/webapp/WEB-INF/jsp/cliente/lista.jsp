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
    <h3>Listagem de Clientes</h3>

    <c:if test="${not empty clientes}">       
      <div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem} Quantidade de clientes cadastrados: ${clientes.size()}.
			</div>
    </c:if>

    <c:if test="${empty clientes}">
      <div class="alert alert-info">
				<strong>Atenção!</strong> Não existem clientes cadastrados.
			</div>
    </c:if>

    <form action="/cliente" method="get">
        <button type="submit" class="btn btn-success">
          <span class="glyphicon glyphicon-plus"></span>
        </button>
    </form> 
    
  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>CPF</th>
        <th>Telefone</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="u" items="${clientes}" >
        <tr>
          <td>${u.id}</td>
          <td>${u.nome}</td>
          <td>${u.cpf}</td>
          <td>${u.telefone}</td>
          <td>
            <form action="/cliente/${u.id}/excluir" method="get">
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