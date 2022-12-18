package br.edu.infnet.appconfeitaria.model.domain;

public class Cliente {
    private String nome;
    private String cpf;
    private int telefone;

    public Cliente(String nome, String cpf, int telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
}
