package br.edu.infnet.appconfeitaria.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;

@Repository
public class BoloRepository {
    private static Integer id = 1;
    private static Map<Integer,Bolo> mapaBolo = new HashMap<Integer, Bolo>();

    public boolean incluir(Bolo bolo) {
        bolo.setId(id++);

        try {
            mapaBolo.put(bolo.getId(), bolo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Bolo excluir(Integer id) {
        return mapaBolo.remove(id);
    }

    public Collection<Bolo> obterLista(){
        return mapaBolo.values();
    }
}
