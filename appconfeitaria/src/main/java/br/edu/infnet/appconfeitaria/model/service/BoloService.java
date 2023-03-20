package br.edu.infnet.appconfeitaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.repository.BoloRepository;

@Service
public class BoloService {
    @Autowired
    private BoloRepository boloRepository;

    public boolean incluir(Bolo bolo) {
        return boloRepository.incluir(bolo); 
    }

    public Bolo excluir(Integer key){
        return boloRepository.excluir(key);
    }

    public Collection<Bolo> obterLista(){
        return boloRepository.obterLista();
    }
}
