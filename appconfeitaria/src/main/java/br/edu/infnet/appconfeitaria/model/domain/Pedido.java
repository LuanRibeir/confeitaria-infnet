package br.edu.infnet.appconfeitaria.model.domain;

public class Pedido {
    private String descricao;
    private boolean web;
    private LocalDateTime data; 
    private Cliente cliente;
    private List<Doce> doces;
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isWeb() {
        return web;
    }
    public void setWeb(boolean web) {
        this.web = web;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Doce> getDoces() {
        return doces;
    }
    public void setDoces(List<Doce> doces) {
        this.doces = doces;
    }
}
