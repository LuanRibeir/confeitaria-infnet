package br.edu.infnet.appconfeitaria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.service.BoloService;


@Order(3)
@Component
public class BoloLoader implements ApplicationRunner{
    @Autowired
    private BoloService boloService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
         try {
             String arq = "src/main/resources/static/bolos.txt";
         try {
             FileReader fReader = new FileReader(arq);
             BufferedReader ler = new BufferedReader(fReader);

             String linha = ler.readLine();
             String[] campos = null;

             while(linha != null){
                 campos = linha.split(";");

                 Bolo bolo = new Bolo(campos[0], campos[1], campos[2],
                                     Integer.parseInt(campos[3]), Float.parseFloat(campos[4]),
                                     campos[5], campos[6], Integer.parseInt(campos[7]));

                boloService.incluir(bolo);

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
