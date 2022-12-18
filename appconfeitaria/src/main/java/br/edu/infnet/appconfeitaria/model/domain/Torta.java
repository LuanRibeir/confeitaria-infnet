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
    

    public Boolean getVegana() {
        return vegana;
    }
    public void isVegana(Boolean vegana) {
        this.vegana = vegana;
    }

    public String getDecoracao() {
        return decoracao;
    }
    public void setDecoracao(String decoracao) {
        this.decoracao = decoracao;
    }

    public Boolean getIsDoce() {
        return isDoce;
    }
    public void setIsDoce(Boolean isDoce) {
        this.isDoce = isDoce;
    }
}
