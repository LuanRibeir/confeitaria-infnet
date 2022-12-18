package br.edu.infnet.appconfeitaria.model.domain;

public class Torta extends Doce{
    private boolean vegana;
    private String decoracao;
    private boolean isDoce; //doce ou salgada

    public Torta(String codigo, String nome, String sabor, int kilo,
                float valorKg, Boolean vegana, String decoracao, Boolean doce) throws ValorZeradoException{

        super(codigo, nome, sabor, kilo, valorKg);
        this.vegana = vegana;
        this.decoracao = decoracao;
        this.isDoce = doce;
    }
    
}
