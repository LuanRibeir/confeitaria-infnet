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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(";");
        sb.append(cpf);
        sb.append(";");
        sb.append(telefone);

        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }
}
