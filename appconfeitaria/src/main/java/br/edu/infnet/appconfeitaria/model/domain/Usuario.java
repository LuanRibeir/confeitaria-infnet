package br.edu.infnet.appconfeitaria.model.domain;

public class Usuario {
    private String nome;
    private String senha;
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, String email){
        this();
        this.setNome(nome);
        this.setEmail(email);
    }

    public Usuario(String nome, String email, String senha){
        this(nome, email);
        this.setSenha(senha);
    }

    @Override
    public String toString(){
        return String.format("Bem vindo/a %s de e-mail %s!", this.nome, this.email);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
