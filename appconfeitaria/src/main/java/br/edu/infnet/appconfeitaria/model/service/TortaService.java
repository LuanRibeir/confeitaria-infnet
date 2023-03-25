package br.edu.infnet.appconfeitaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.repository.TortaRepository;

@Service
public class TortaService {
    @Autowired
    private TortaRepository tortaRepository;

    public Torta incluir(Torta torta) {
        return tortaRepository.save(torta); 
    }

    public void excluir(Integer key){
        tortaRepository.deleteById(key);
    }

    public Collection<Torta> obterLista(){
        return (Collection<Torta>) tortaRepository.findAll();
    }

    public Collection<Torta> obterLista(Usuario usuario){
        return (Collection<Torta>) tortaRepository.obterLista(usuario.getId());
    }

    public Torta obterLista(Integer id){
        return tortaRepository.findById(id).orElse(null);
    }
}
