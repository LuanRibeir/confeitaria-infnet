package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Pedido;
import br.edu.infnet.appconfeitaria.model.domain.Cliente;


public class PedidoTest {
    public static void main(String[] args) {
        Cliente cli0 = new Cliente("joe", "doe", 123456789);
        Cliente cli1 = new Cliente("joe", "doe", 123456789);

        Pedido ped0 = new Pedido();
        ped0.setDescricao("descricao teste");
        ped0.setWeb(true);
        ped0.setCliente(cli0);
        System.out.println(ped0);

        Pedido ped1 = new Pedido();
        ped1.setDescricao("descricao teste");
        ped1.setWeb(false);
        ped0.setCliente(cli0);
        System.out.println(ped1);

        Pedido ped2 = new Pedido();
        ped2.setDescricao("descricao teste");
        ped2.setWeb(true);
        ped0.setCliente(cli1);
        System.out.println(ped2);
    }
}
