package br.edu.infnet.appconfeitaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.service.BoloService;

@Component
public class BoloLoader implements ApplicationRunner{
    @Autowired
    private BoloService boloService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Bolo bolo = new Bolo("abcdefg", "Bolo de Cenoura", "Cenoura", 1, 30, "redondo", "Chocolate", 1);
        bolo.setId(1);

        boloService.incluir(bolo);
    }
}
