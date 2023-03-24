package br.edu.infnet.appconfeitaria.model.domain;

import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCamadasInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeQuantidadeInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "TableDoce")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Doce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private String nome;
    private String sabor;
    private int kilo;
    private float valorKg;

    public Doce(){
        
    }

    public Doce(String codigo, String nome, String sabor, int kilo, float valorKg) throws ValorZeradoException {
        if (kilo == 0 || valorKg == 0){
            throw new ValorZeradoException("[ERRO] Valor do kg está zerado!!");
        }

        if (kilo < 0 || valorKg < 0){
            throw new ValorZeradoException("[ERRO] Valor do kg é negativo!!");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.sabor = sabor;
        this.kilo = kilo;
        this.valorKg = valorKg;
    }

    public abstract float calcularValorPorKilo() throws NumeroDeQuantidadeInvalidoException,
                                                        NumeroDeCamadasInvalidoException;

    @Override
    public String toString(){
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

        return sb.toString();
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getKilo() {
        return kilo;
    }
    public void setKilo(Integer kilo) {
        this.kilo = kilo;
    }

    public float getValorKg() {
        return valorKg;
    }
    public void setValorKg(Float valorKg) {
        this.valorKg = valorKg;
    }
}
