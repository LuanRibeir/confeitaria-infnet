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

    public Pudim incluir(Pudim pudim) {
        return pudimRepository.save(pudim); 
    }

    public void excluir(Integer key){
        pudimRepository.deleteById(key);
    }

    public Collection<Pudim> obterLista(){
        return (Collection<Pudim>) pudimRepository.findAll();
    }

    public Pudim obterLista(Integer id){
        return pudimRepository.findById(id).orElse(null);
    }
}
