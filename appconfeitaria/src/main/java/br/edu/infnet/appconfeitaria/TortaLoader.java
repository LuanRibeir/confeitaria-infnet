package br.edu.infnet.appconfeitaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.service.TortaService;

@Component
public class TortaLoader implements ApplicationRunner{
    @Autowired
    private TortaService tortaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Torta torta = new Torta("abcdefg", "Torta de Morango", "Morango", 1, 40, false, "Cobertura de Morango", true);
        torta.setId(1);

        tortaService.incluir(torta);
    }
}
