package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cli0 = new Cliente("joe", "doe", 123456789);
        System.out.println(cli0);

        Cliente cli1 = new Cliente("joe", "doe", 123456789);
        System.out.println(cli1);

        Cliente cli2 = new Cliente("joe", "doe", 123456789);
        System.out.println(cli2);
    }
}
