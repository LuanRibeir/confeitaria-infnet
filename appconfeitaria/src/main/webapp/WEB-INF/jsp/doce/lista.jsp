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
    <h3>Listagem de Doces</h3>

    <c:if test="${not empty doces}">       
      <div class="alert alert-info">
				<strong>Atenção!</strong> ${mensagem} Quantidade de doces cadastrados: ${doces.size()}.
			</div>
    </c:if>

    <c:if test="${empty doces}">
      <div class="alert alert-warning">
				<strong>Atenção!</strong> Não existem doces cadastrados.
			</div>
    </c:if>
    
    <table class="table table-striped">
      <thead>
        <tr>
          <th>ID</th>
          <th>Código</th>
          <th>Nome</th>
          <th>Sabor</th>
          <th>Kilo</th>
          <th>Valor Kilo</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="d" items="${doces}" >
          <tr>
            <td>${d.id}</td>
            <td>${d.codigo}</td>
            <td>${d.nome}</td>
            <td>${d.sabor}</td>
            <td>${d.kilo}</td>
            <td>${d.valorKg}</td>
            <td>
              <form action="/doce/${d.id}/excluir" method="get">
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