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
</body>
</html>