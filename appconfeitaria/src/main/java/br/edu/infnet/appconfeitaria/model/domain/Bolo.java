package br.edu.infnet.appconfeitaria.model.domain;

public class Bolo extends Doce{
    private String formato;
    private String saborCobertura;
    private int camadas;

    public Bolo(String codigo, String nome, String sabor, int kilo,
                float valorKg, String formato, String saborCobertura, int camadas) {
                    
        super(codigo, nome, sabor, kilo, valorKg);
        this.formato = formato;
        this.camadas = camadas;
        this.saborCobertura = saborCobertura;
    }
    
}
