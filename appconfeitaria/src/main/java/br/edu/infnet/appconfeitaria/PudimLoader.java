package br.edu.infnet.appconfeitaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appconfeitaria.model.domain.Pudim;
import br.edu.infnet.appconfeitaria.model.service.PudimService;

@Component
public class PudimLoader implements ApplicationRunner{
    @Autowired
    private PudimService pudimService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Pudim pudim = new Pudim("abcderf", "Pudim de Leite", "Leite", 1, 20, "M", false, 1);
        pudim.setId(1);

        pudimService.incluir(pudim);
    }
}
