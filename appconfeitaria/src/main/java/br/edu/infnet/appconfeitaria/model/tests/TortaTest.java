package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public class TortaTest {
    public static void main(String[] args) {

        try {
            Torta tortaSalgadaVegana = new Torta("codigoteste1", "Torta Salgada Vegana", "sabor",
            2, 25.0f, true, "decoracao", false);

            System.out.println(tortaSalgadaVegana);
            System.out.println(tortaSalgadaVegana.calcularValorPorKilo());
        } catch (ValorZeradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Torta tortaDoce = new Torta("codigoteste1", "Torta Salgada", "sabor",
            2, 25.0f, false, "decoracao", true);
    
            System.out.println(tortaDoce);
            System.out.println(tortaDoce.calcularValorPorKilo());
        } catch (ValorZeradoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Torta tortaDoceVegana = new Torta("codigoteste1", "Torta Salgada", "sabor",
            2, 25.0f, true, "decoracao", true);
    
            System.out.println(tortaDoceVegana);
            System.out.println(tortaDoceVegana.calcularValorPorKilo());
        } catch (ValorZeradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
