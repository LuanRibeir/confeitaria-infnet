package br.edu.infnet.appconfeitaria.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map; 

import br.edu.infnet.appconfeitaria.model.domain.Torta;

public class TortaRepository {
    private static Integer id = 1;
    private static Map<Integer,Torta> mapaTorta = new HashMap<Integer, Torta>();

    public static boolean incluir(Torta torta) {
        torta.setId(id++);

        try {
            mapaTorta.put(torta.getId(), torta);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Torta excluir(Integer id) {
        return mapaTorta.remove(id);
    }

    public static Collection<Torta> obterLista(){
        return mapaTorta.values();
    }
}
