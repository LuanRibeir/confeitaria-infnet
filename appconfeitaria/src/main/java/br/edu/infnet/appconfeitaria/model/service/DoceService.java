package br.edu.infnet.appconfeitaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.domain.Doce;
import br.edu.infnet.appconfeitaria.model.repository.DoceRepository;

@Service
public class DoceService {
    @Autowired
    private DoceRepository doceRepository;

    public void excluir(Integer key){
        doceRepository.deleteById(key);
    }

    public Collection<Doce> obterLista(){
        return (Collection<Doce>) doceRepository.findAll();
    }

    public Collection<Doce> obterLista(Usuario usuario){
        return (Collection<Doce>) doceRepository.obterLista(usuario.getId());
    }

    public Doce obterLista(Integer id){
        return doceRepository.findById(id).orElse(null);
    }
}
