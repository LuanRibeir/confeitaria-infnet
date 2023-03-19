package br.edu.infnet.appconfeitaria.model.domain;

import br.edu.infnet.appconfeitaria.model.exceptions.ClienteInvalidoException;

public class Cliente {
    private Integer id;
    private String nome;
    private String cpf;
    private int telefone;

    public Cliente(String nome, String cpf, int telefone) throws ClienteInvalidoException{
        this.nome = nome;
        if(nome == null){
            throw new ClienteInvalidoException("[ERRO] Nome inválido!");
        }

        if(cpf == null){
            throw new ClienteInvalidoException("[ERRO] cpf inválido!");
        }

        if(telefone == 0){
            throw new ClienteInvalidoException("[ERRO] Numero inválido!");
        }

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

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
