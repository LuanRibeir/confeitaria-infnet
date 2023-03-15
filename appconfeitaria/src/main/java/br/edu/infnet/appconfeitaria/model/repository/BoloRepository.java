package br.edu.infnet.appconfeitaria.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;

public class BoloRepository {
    private static Integer id = 1;
    private static Map<Integer,Bolo> mapaBolo = new HashMap<Integer, Bolo>();

    public static boolean incluir(Bolo bolo) {
        bolo.setId(id++);

        try {
            mapaBolo.put(bolo.getId(), bolo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Bolo excluir(Integer id) {
        return mapaBolo.remove(id);
    }

    public static Collection<Bolo> obterLista(){
        return mapaBolo.values();
    }
}
