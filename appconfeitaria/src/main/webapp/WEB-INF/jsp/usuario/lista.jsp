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
    <h3>Listagem de Usuários</h3>

    <c:if test="${not empty usuarios}">       
      <div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem} Quantidade de usuários cadastrados: ${usuarios.size()}.
			</div>
    </c:if>

    <c:if test="${empty usuarios}">
      <div class="alert alert-info">
				<strong>Atenção!</strong> Não existem usuários cadastrados.
			</div>
    </c:if>
    
  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>E-mail</th>
        <th>Senha</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="u" items="${usuarios}" >
        <tr>
          <td>${u.id}</td>
          <td>${u.nome}</td>
          <td>${u.email}</td>
          <td>${u.senha}</td>
          <td>
            <form action="/usuario/${u.id}/excluir" method="get">
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