package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Pedido;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appconfeitaria.model.domain.Cliente;
import br.edu.infnet.appconfeitaria.model.domain.Doce;
import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.domain.Pudim;
import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.exceptions.ClienteInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;


public class PedidoTest {
    public static void main(String[] args) {
        List<Doce> doce1 = new ArrayList<Doce>();
        List<Doce> doce2 = new ArrayList<Doce>();
        List<Doce> doce3 = new ArrayList<Doce>();

        try {
            Bolo boloQuadrado = new Bolo("codigoteste1", "bolo de formigueiro", "chocolate",
            2, 25.0f, "quadrado", "chocolate", 1);

            doce1.add(boloQuadrado);
            doce3.add(boloQuadrado);
        } catch (ValorZeradoException e) { 
            System.out.println(e.getMessage());
        }

        try {
            Pudim pudimP = new Pudim("codigoteste2", "Pudim", "chocolate",
            2, 25.0f, "P", true, 1);

            doce2.add(pudimP);
            doce3.add(pudimP);
        } catch (ValorZeradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Torta tortaSalgadaVegana = new Torta("codigoteste3", "Torta Salgada Vegana", "sabor",
            2, 25.0f, true, "decoracao", false);

            doce2.add(tortaSalgadaVegana);
            doce3.add(tortaSalgadaVegana);
        } catch (ValorZeradoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Cliente cli0 = new Cliente("joe", "doe", 123456789);

            Pedido ped0 = new Pedido();
            ped0.setDescricao("1 pedido");
            ped0.setWeb(true);
            ped0.setDoces(doce1);
            ped0.setCliente(cli0);
            ped0.imprimir();

            Pedido ped1 = new Pedido();
            ped1.setDescricao("2 pedido");
            ped1.setWeb(false);
            ped1.setDoces(doce2);
            ped1.setCliente(cli0);
            ped1.imprimir();

        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli1 = new Cliente("joe", "doe", 123456789);
            Pedido ped2 = new Pedido();
            ped2.setDescricao("3 pedido");
            ped2.setWeb(true);
            ped2.setDoces(doce3);
            ped2.setCliente(cli1);
            ped2.imprimir();
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli2 = new Cliente(null, "doe", 123456789);

            Pedido ped0 = new Pedido();
            ped0.setDescricao("1 pedido");
            ped0.setWeb(true);
            ped0.setDoces(doce1);
            ped0.setCliente(cli2);
            ped0.imprimir();
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli2 = new Cliente("joe", null, 123456789);

            Pedido ped0 = new Pedido();
            ped0.setDescricao("1 pedido");
            ped0.setWeb(true);
            ped0.setDoces(doce1);
            ped0.setCliente(cli2);
            ped0.imprimir();
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli2 = new Cliente("joe", "doe", 0);

            Pedido ped0 = new Pedido();
            ped0.setDescricao("1 pedido");
            ped0.setWeb(true);
            ped0.setDoces(doce1);
            ped0.setCliente(cli2);
            ped0.imprimir();
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

    }
}
