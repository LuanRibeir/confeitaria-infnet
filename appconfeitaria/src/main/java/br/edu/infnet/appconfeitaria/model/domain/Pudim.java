package br.edu.infnet.appconfeitaria.model.domain;

public class Pudim extends Doce{
    private String tamanho;
    private boolean lactose;
    private int quantidade;

    public Pudim(String codigo, String nome, String sabor, int kilo,
                float valorKg, String tamanho, Boolean lactose, int quantidade) throws ValorZeradoException{
                    
        super(codigo, nome, sabor, kilo, valorKg);
        this.tamanho = tamanho;
        this.lactose = lactose;
        this.quantidade = quantidade;
    }

    
}
