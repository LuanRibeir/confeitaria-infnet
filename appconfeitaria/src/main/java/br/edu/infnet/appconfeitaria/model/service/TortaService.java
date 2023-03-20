package br.edu.infnet.appconfeitaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.repository.TortaRepository;

@Service
public class TortaService {
    @Autowired
    private TortaRepository tortaRepository;

    public boolean incluir(Torta torta) {
        return tortaRepository.incluir(torta); 
    }

    public Torta excluir(Integer key){
        return tortaRepository.excluir(key);
    }

    public Collection<Torta> obterLista(){
        return tortaRepository.obterLista();
    }
}
