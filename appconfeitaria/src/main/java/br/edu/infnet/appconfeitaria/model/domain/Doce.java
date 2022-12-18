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

    public abstract float calcularValorPorKilo();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codigo);
        sb.append(";");
        sb.append(nome);
        sb.append(";");
        sb.append(sabor);
        sb.append(";");
        sb.append(kilo);
        sb.append(";");
        sb.append(valorKg);
        sb.append(";");
        sb.append(this.calcularValorPorKilo());

        return super.toString();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSabor() {
        return sabor;
    }

    public int getKilo() {
        return kilo;
    }

    public float getValorKg() {
        return valorKg;
    }
}
