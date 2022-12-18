package br.edu.infnet.appconfeitaria.model.domain;

public abstract class Doce {
    private String codigo;
    private String nome;
    private String sabor;
    private int kilo;
    private float valorKg;


    public Doce(String codigo, String nome, String sabor, int kilo, float valorKg) {
        this.codigo = codigo;
        this.nome = nome;
        this.sabor = sabor;
        this.kilo = kilo;
        this.valorKg = valorKg;
    }
    
}
