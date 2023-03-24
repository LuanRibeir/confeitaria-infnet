package br.edu.infnet.appconfeitaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner{

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Usuario userAdmin = new Usuario("Administrador", "admin@admin.com", "123");

        usuarioService.incluir(userAdmin);

        for (int i = 0; i < 9; i++) {
            Usuario usuario = new Usuario("Usuario "+i, "usuario@"+i+"usuario.com", "0"+i);
            usuarioService.incluir(usuario);
        }

    }
}
