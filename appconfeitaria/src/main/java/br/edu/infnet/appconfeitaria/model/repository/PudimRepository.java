package br.edu.infnet.appconfeitaria.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appconfeitaria.model.domain.Pudim;

@Repository
public class PudimRepository {
    private static Integer id = 1;
    private static Map<Integer,Pudim> mapaPudim = new HashMap<Integer, Pudim>();

    public boolean incluir(Pudim pudim) {
        pudim.setId(id++);

        try {
            mapaPudim.put(pudim.getId(), pudim);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Pudim excluir(Integer id) {
        return mapaPudim.remove(id);
    }

    public Collection<Pudim> obterLista(){
        return mapaPudim.values();
    }
}
