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
    
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getSaborCobertura() {
        return saborCobertura;
    }
    public void setSaborCobertura(String saborCobertura) {
        this.saborCobertura = saborCobertura;
    }

    public int getCamadas() {
        return camadas;
    }
    public void setCamadas(int camadas) {
        this.camadas = camadas;
    }

}
