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
	  <h2>Cadastro de Pudim</h2>
	  <form action="/pudim/incluir" method="post">

	    <div class="form-group">
	      <label>Código:</label>
	      <input value="asdasd" type="text" minlength="6" maxlength="6" class="form-control" placeholder="Entre o código do doce" name="codigo">
	    </div>

	    <div class="form-group">
	      <label>Nome:</label>
	      <input value="asd" type="text" minlength="1" maxlength="20" class="form-control" placeholder="Entre o nome do doce" name="nome">
	    </div>

        <div class="form-group">
            <label>Sabor:</label>
            <input value="asd" type="text" minlength="1" maxlength="20" class="form-control" placeholder="Entre o sabor do doce" name="sabor">
        </div>

        <div class="form-group">
            <label>Kilo:</label>
            <input value="12" type="number" min="1" max="999" class="form-control" placeholder="Entre o kilo do doce" name="kilo">
        </div>

        <div class="form-group">
            <label>Valor Kilo:</label>
            <input value="1.1" type="number" min="1" max="999" step="any" class="form-control" placeholder="Entre o valor por kilo do doce" name="valorKg">
        </div>

        <!-- filha  -->

        <label>Tamanho:</label>
        <div class="form-check">            
            <input class="form-check-input" type="radio" name="tamanho" id="pequeno" value="P" checked>
            <label class="form-check-label" for="pequeno">
              Pequeno
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="tamanho" id="medio" value="M">
            <label class="form-check-label" for="medio">
              Médio
            </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="tamanho" id="grande" value="G">
          <label class="form-check-label" for="grande">
            Grande
          </label>
      </div>

      <div>
        <label for="lactose">Intolerância à lactose:</label>
        <input type="checkbox" id="lactose" name="lactose">
      </div>

      <div class="form-group">
        <label>Quantidade:</label>
        <input value="5" type="number" min="1" max="99" class="form-control" placeholder="Entre a quandidade de pudins" name="quantidade">
      </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>
</body>
</html>