<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

  <li class="list-unstyled-item list-underline center">
    <div class="form-group">
      <label>Cep:</label>
      <input required placeholder="Entre o cep" name="cep" value="${endereco.cep}" type="text" class="form-control">
    </div>
  </li>

  <li class="list-unstyled-item list-underline center">
    <div class="form-group">
      <label>Logradouro:</label>
      <input required placeholder="Entre o logradouro" name="logradouro" value="${endereco.logradouro}" type="text"
        class="form-control">
    </div>
  </li>

  <li class="list-unstyled-item list-underline center">
    <div class="form-group">
      <label>Complemento:</label>
      <input required placeholder="Entre o complemento" name="complemento" value="${endereco.complemento}" type="text"
        class="form-control">
    </div>
  </li>

  <li class="list-unstyled-item list-underline center">
    <div class="form-group">
      <label>Bairro:</label>
      <input required placeholder="Entre o bairro" name="bairro" value="${endereco.bairro}" type="text"
        class="form-control">
    </div>
  </li>

  <li class="list-unstyled-item list-underline center">
    <div class="form-group">
      <label>Localidade:</label>
      <input required placeholder="Entre a localidade" name="localidade" value="${endereco.localidade}" type="text"
        class="form-control">
    </div>
  </li>

  <li class="list-unstyled-item list-underline center">
    <div class="form-group">
      <label>UF:</label>
      <input required placeholder="Entre a UF" name="uf" type="text" value="${endereco.uf}" class="form-control">
    </div>
  </li>