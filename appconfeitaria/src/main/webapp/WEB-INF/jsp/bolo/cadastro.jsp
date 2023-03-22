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
	  <h2>Cadastro de Bolo</h2>
	  <form action="/bolo/incluir" method="post">

	    <div class="form-group">
	      <label>Código:</label>
	      <input required type="text" minlength="6" maxlength="6" class="form-control" placeholder="Entre o código do doce" name="codigo">
	    </div>

	    <div class="form-group">
	      <label>Nome:</label>
	      <input required type="text" minlength="1" maxlength="20" class="form-control" placeholder="Entre o nome do doce" name="nome">
	    </div>

        <div class="form-group">
            <label>Sabor:</label>
            <input required type="text" minlength="1" maxlength="20" class="form-control" placeholder="Entre o sabor do doce" name="sabor">
        </div>

        <div class="form-group">
            <label>Kilo:</label>
            <input required type="number" min="1" max="999" class="form-control" placeholder="Entre o kilo do doce" name="kilo">
        </div>

        <div class="form-group">
            <label>Valor Kilo:</label>
            <input required type="number" min="1" max="999" step="any" class="form-control" placeholder="Entre o valor por kilo do doce" name="valorKg">
        </div>

        <div class="form-group">
          <label>Sabor da Cobertura:</label>
          <input required type="text" minlength="1" maxlength="20" class="form-control" placeholder="Entre o sabor da cobertura" name="saborCobertura">
      </div>

        <label>Formato:</label>
        <div class="form-check">            
            <input class="form-check-input" type="radio" name="formato" id="exampleRadios1" value="redondo" checked>
            <label class="form-check-label" for="exampleRadios1">
              Redondo
            </label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="formato" id="exampleRadios2" value="quadrado">
            <label class="form-check-label" for="exampleRadios2">
              Quadrado
            </label>
        </div>

        <div class="form-group">
            <label>Camadas:</label>
            <input required type="number" min="1" max="999" class="form-control" placeholder="Entre o número de camadas" name="camadas">
        </div>

        

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>
</body>
</html>