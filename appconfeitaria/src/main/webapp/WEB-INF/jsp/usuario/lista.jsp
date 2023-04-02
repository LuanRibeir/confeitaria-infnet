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
      <link rel="icon" type="image/x-icon" href="/assets/favicon.ico" />
      <!-- Google fonts-->
      <link
        href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet" />
      <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet" />
      <!-- Core theme CSS (includes Bootstrap)-->
      <link href="/css/styles.css" rel="stylesheet" />
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
            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
            aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mx-auto">
              <li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="/">Home</a>
              </li>
              <c:if test="${not empty usuario}">
                <div class="dropdown show nav-item px-lg-4">
                  <a class="btn btn-secondary dropdown-toggle btn-x text-uppercase" href="#" role="button"
                    id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                  <a class="btn btn-secondary dropdown-toggle btn-x text-uppercase" href="#" role="button"
                    id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Doces
                  </a>
                  <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                    <li><a class="dropdown-item text-uppercase" href="/doce/lista">Doces</a></li>
                    <li><a class="dropdown-item text-uppercase" href="/bolo/lista">Bolos</a></li>
                    <li><a class="dropdown-item text-uppercase" href="/torta/lista">Tortas</a></li>
                    <li><a class="dropdown-item text-uppercase" href="/pudim/lista">Pudins</a></li>
                  </div>
                </div>
              </c:if>
              <c:if test="${empty usuario}">
                <li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="/usuario">Sign
                    Up</a></li>
                <li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="/login">Login</a>
                </li>
              </c:if>
              <c:if test="${not empty usuario}">
                <li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="/logout">Logout</a>
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
            <div class="col-xl-12 mx-auto">
              <div class="cta-inner bg-faded text-center rounded">

                <div class="container">
                  <h3>Listagem de Usuários</h3>

                  <c:if test="${not empty usuarios}">
                    <div class="alert alert-info">
                      <strong>Sucesso!</strong> ${mensagem} Quantidade de usuários cadastrados:
                      ${usuarios.size()}.
                    </div>
                  </c:if>

                  <c:if test="${empty usuarios}">
                    <div class="alert alert-warning">
                      <strong>Atenção!</strong> Não existem usuários cadastrados.
                    </div>
                  </c:if>

                  <div class="col-xl-12 bg-faded table-responsive text-center rounded">
                    <table class="table table-striped table-responsive">
                      <thead>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Senha</th>
                        <th>Admin</th>
                        <th>Endereço</th>
                        <th>Clientes</th>
                        <th>Doces</th>
                        <th>Pedidos</th>
                        <c:if test="${usuario.admin}">
                          <th></th>
                        </c:if>
                        </tr>
                      </thead>
                      <tbody>
                        <c:forEach var="u" items="${usuarios}">
                          <tr>
                            <td>${u.id}</td>
                            <td>${u.nome}</td>
                            <td>${u.email}</td>
                            <td>${u.senha}</td>
                            <td>${u.admin}</td>
                            <td>${u.endereco}</td>
                            <td>${u.clientes.size()}</td>
                            <td>${u.doces.size()}</td>
                            <td>${u.pedidos.size()}</td>
                            <c:if test="${usuario.admin}">
                              <td>
                                <form action="/usuario/${u.id}/excluir" method="get">
                                  <button type="submit" class="btn btn-danger">
                                    <span>Remover</span>
                                  </button>
                                </form>
                              </td>
                            </c:if>
                          </tr>
                        </c:forEach>
                      </tbody>
                    </table>
                  </div>
                </div>
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
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>

    </html>