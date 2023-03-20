package br.edu.infnet.appconfeitaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appconfeitaria.model.domain.Pudim;
import br.edu.infnet.appconfeitaria.model.repository.PudimRepository;

@Service
public class PudimService {
    @Autowired
    private PudimRepository pudimRepository;

    public boolean incluir(Pudim pudim) {
        return pudimRepository.incluir(pudim); 
    }

    public Pudim excluir(Integer key){
        return pudimRepository.excluir(key);
    }

    public Collection<Pudim> obterLista(){
        return pudimRepository.obterLista();
    }
}
