package br.edu.infnet.appconfeitaria.model.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TableUsuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Cliente> clientes;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Doce> doces;

    public Usuario() {
    }

    public Usuario(String email, String senha){
        this();
        this.setEmail(email);
        this.setSenha(senha);
    }

    public Usuario(String nome, String email, String senha){
        this(email, senha);
        this.setNome(nome);
    }

    @Override
    public String toString(){
        return String.format("Bem vindo/a %s de e-mail %s!", this.nome, this.email);
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

    public List<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Doce> getDoces() {
        return doces;
    }
    public void setDoces(List<Doce> doces) {
        this.doces = doces;
    }

}
