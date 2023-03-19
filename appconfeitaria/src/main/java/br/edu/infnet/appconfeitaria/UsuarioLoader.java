package br.edu.infnet.appconfeitaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner{

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Usuario usuario = new Usuario("Administrador", "admin@admin.com", "123");
        usuario.setId(1);

        usuarioService.incluir(usuario);

    }
}
