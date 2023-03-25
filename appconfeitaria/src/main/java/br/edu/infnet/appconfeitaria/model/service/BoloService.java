package br.edu.infnet.appconfeitaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.repository.BoloRepository;

@Service
public class BoloService {
    @Autowired
    private BoloRepository boloRepository;

    public Bolo incluir(Bolo bolo) {
        return boloRepository.save(bolo); 
    }

    public void excluir(Integer key){
        boloRepository.deleteById(key);
    }

    public Collection<Bolo> obterLista(){
        return (Collection<Bolo>) boloRepository.findAll();
    }

    public Collection<Bolo> obterLista(Usuario usuario){
        return (Collection<Bolo>) boloRepository.obterLista(usuario.getId());
    }

    public Bolo obterLista(Integer id){
        return boloRepository.findById(id).orElse(null);
    }
}
