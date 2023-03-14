package br.edu.infnet.appconfeitaria.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;

public class UsuarioRepository {
    private static Integer id = 1;
    private static Map<Integer,Usuario> mapaUsuario = new HashMap<Integer, Usuario>();

    public static boolean incluir(Usuario usuario) {
        usuario.setId(id++);

        try {
            mapaUsuario.put(usuario.getId(), usuario);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Usuario excluir(Integer id) {
        return mapaUsuario.remove(id);
    }

    public static Collection<Usuario> obterLista(){
        return mapaUsuario.values();
    }
}
