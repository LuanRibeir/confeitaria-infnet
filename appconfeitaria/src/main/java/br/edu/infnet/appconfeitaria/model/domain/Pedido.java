package br.edu.infnet.appconfeitaria.model.domain;

public class Pedido {
    private String descricao;
    private boolean web;
    private LocalDateTime data; 
    private Cliente cliente;
    private List<Doce> doces;
    
}
