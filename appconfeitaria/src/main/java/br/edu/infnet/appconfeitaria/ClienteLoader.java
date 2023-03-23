package br.edu.infnet.appconfeitaria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appconfeitaria.model.domain.Cliente;
import br.edu.infnet.appconfeitaria.model.service.ClienteService;

@Component
public class ClienteLoader implements ApplicationRunner{
    @Autowired
    private ClienteService clienteService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            String arq = "src/main/resources/static/clientes.txt";
        try {
            FileReader fReader = new FileReader(arq);
            BufferedReader ler = new BufferedReader(fReader);

            String linha = ler.readLine();
            String[] campos = null;

            while(linha != null){
                campos = linha.split(";");

                Cliente cliente = new Cliente(campos[0], campos[1], Integer.parseInt(campos[2]));

                clienteService.incluir(cliente);

                linha = ler.readLine();
            }

            ler.close();
            fReader.close();
        } catch (IOException e) {
            System.out.println("[ERRO] " + e.getMessage());
        }
        } finally {
            System.out.println("Processamento Finalizado!");
        }
    }
}
