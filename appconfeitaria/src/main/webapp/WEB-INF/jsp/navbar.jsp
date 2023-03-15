<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="navbar navbar-dark navbar-inverse"  style="background-color: #38304F;">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="#">AppConfeitaria</a>
      </div>
      <ul class="nav navbar-nav">
        <li><a href="#">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Doces
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/usuario/lista">Usúarios</a></li>
            <li><a href="#">Clientes</a></li>
            <li><a href="#">Doces</a></li>
            <li><a href="#">Bolos</a></li>
            <li><a href="#">Pudins</a></li>
            <li><a href="#">Tortas</a></li>
            <li><a href="#">Pedidos</a></li>
          </ul>
        </li>
      </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
        </ul>
    </div>
</nav>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>