package br.edu.infnet.appconfeitaria.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appconfeitaria.model.domain.Pudim;

public class PudimRepository {
    private static Integer id = 1;
    private static Map<Integer,Pudim> mapaPudim = new HashMap<Integer, Pudim>();

    public static boolean incluir(Pudim pudim) {
        pudim.setId(id++);

        try {
            mapaPudim.put(pudim.getId(), pudim);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Pudim excluir(Integer id) {
        return mapaPudim.remove(id);
    }

    public static Collection<Pudim> obterLista(){
        return mapaPudim.values();
    }
}
