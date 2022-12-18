package br.edu.infnet.appconfeitaria.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pedido {
    private String descricao;
    private boolean web;
    private LocalDateTime data; 
    private Cliente cliente;
    private List<Doce> doces;

    public Pedido(){
        data = LocalDateTime.now();
    }

    public void imprimir(){
        System.out.println("Pedido: " + toString());
        System.out.println("Cliente: " + cliente);
        System.out.println("Quantidade: " + doces.size());
        System.out.println("Doces: ");
        for (Doce doce : doces) {
            System.out.println("- " + doce.getNome());
        }
    }

    @Override
    public String toString() {

        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        return String.format("%s;%s;%s",
                    descricao,
                    web ? "web" : "loja",
                    data.format(formatoDataHora));
    }

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
