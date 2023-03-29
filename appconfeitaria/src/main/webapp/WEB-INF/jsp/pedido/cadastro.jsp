<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<!DOCTYPE html>
		<html lang="pt-br">

		<head>
			<meta charset="utf-8" />
			<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
			<meta name="description" content="" />
			<meta name="author" content="" />
			<title>Confeitaria Infnet</title>
			<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
			<!-- Google fonts-->
			<link
				href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
				rel="stylesheet" />
			<link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet" />
			<!-- Core theme CSS (includes Bootstrap)-->
			<link href="css/styles.css" rel="stylesheet" />
		</head>

		<body>
			<!-- Navigation-->
			<header>
				<h1 class="site-heading text-center text-faded d-none d-lg-block">
					<span class="site-heading-upper text-primary mb-3">Confeitaria</span>
					<span class="site-heading-lower">Infnet</span>
				</h1>
			</header>

			<nav class="navbar navbar-expand-lg navbar-dark py-lg-4" id="mainNav">
				<div class="container">
					<a class="navbar-brand text-uppercase fw-bold d-lg-none" href="/">Confeitaria Infnet</a>
					<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
						data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
						aria-expanded="false" aria-label="Toggle navigation"><span
							class="navbar-toggler-icon"></span></button>
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav mx-auto">
							<li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="/">Home</a>
							</li>
							<c:if test="${not empty usuario}">
								<div class="dropdown show nav-item px-lg-4">
									<a class="btn btn-secondary dropdown-toggle btn-x text-uppercase" href="#"
										role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="false">
										Gerência
									</a>
									<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
										<li><a class="dropdown-item text-uppercase" href="/usuario/lista">Usúarios</a>
										</li>
										<li><a class="dropdown-item text-uppercase" href="/cliente/lista">Clientes</a>
										</li>
										<li><a class="dropdown-item text-uppercase" href="/pedido/lista">Pedidos</a>
										</li>
									</div>
								</div>
								<div class="dropdown show nav-item px-lg-4">
									<a class="btn btn-secondary dropdown-toggle btn-x text-uppercase" href="#"
										role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="false">
										Doces
									</a>
									<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
										<li><a class="dropdown-item text-uppercase" href="/pudim/lista">Doces</a></li>
										<li><a class="dropdown-item text-uppercase" href="/bolo/lista">Bolos</a></li>
										<li><a class="dropdown-item text-uppercase" href="/torta/lista">Tortas</a></li>
										<li><a class="dropdown-item text-uppercase" href="/pudim/lista">Pudins</a></li>
									</div>
								</div>
							</c:if>
							<li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="about.html">Sobre</a>
							</li>
							<c:if test="${empty usuario}">
								<li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="/usuario">Sign
										Up</a></li>
								<li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="/login">Login</a>
								</li>
							</c:if>
							<c:if test="${not empty usuario}">
								<li class="nav-item px-lg-4"><a class="nav-link text-uppercase"
										href="/logout">Logout</a>
								</li>
							</c:if>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<!-- Navigation Ends -->

			<section class="page-section cta">
				<div class="container">
					<div class="row">
						<div class="col-xl-9 mx-auto">
							<div class="cta-inner bg-faded text-center rounded">

								<h2 class="section-heading mb-5">
									<span class="section-heading-lower">Cadastro de Pedidos</span>
								</h2>

								<form action="/pedido/incluir" method="post">
									<ul class="list-unstyled list-hours mb-5 text-left mx-auto">

										<!-- mãe -->
										<li class="list-unstyled-item list-underline center">
											<div class="form-group">
												<label>Descrição:</label>
												<input required type="text" minlength="1" maxlength="30"
													class="form-control" placeholder="Entre a descrição do pedido"
													name="descricao" value="Uma torta de limão.">
											</div>
										</li>

										<li class="list-unstyled-item list-underline">
											<div class="form-group">
												<label class="form-check-label center" for="web">Atendimento
													Web:</label>
												<input class="form-check-input" type="checkbox" id="web" name="web"
													checked>
											</div>
										</li>

										<li class="list-unstyled-item list-underline center">
											<div class="form-group">
												<c:if test="${not empty clientes}">
													<label>Cliente:</label>
													<select name="cliente" id="form-control">
														<c:forEach var="c" items="${clientes}">
															<option value="${c.id}">${c.nome}</option>
														</c:forEach>
													</select>
												</c:if>
												<c:if test="${empty clientes}">
													<c:set var="botao" value="disabled" />
													<label>Não existem solicitantes cadastrados.</label>
												</c:if>
											</div>
										</li>

										<li class="list-unstyled-item list-underline center">
											<div class="form-group">
												<c:if test="${not empty doces}">
													<label>Doces:</label>
													<c:forEach var="d" items="${doces}">
														<div class="form-check text-center">
															<label class="form-check-label center">
																<input type="checkbox" name="doces" value="${d.id}"
																	class="form-check-input center">
																${d.nome}
															</label>
														</div>
													</c:forEach>
												</c:if>

												<c:if test="${empty doces}">
													<c:set var="botao" value="disabled" />
													<label>Não existem doces cadastrados.</label>
												</c:if>
											</div>
										</li>
									</ul>
									<div class="intro-button mx-auto"><button ${botao} type="submit"
											class="btn btn-secondary btn-x">Cadastrar</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</section>
			<!-- Footer -->
			<footer class="footer text-faded text-center py-5">
				<div class="container">
					<p class="m-0 small">Copyright &copy; Luan Eduardo Ribeiro Almeida - 2023</p>
				</div>
			</footer>
			<!-- Footer Ends -->
			<!-- Bootstrap core JS-->
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
			<!-- Core theme JS-->
			<script src="../../../../resources/static/js/scripts.js"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		</body>

		</html>