package br.edu.infnet.appconfeitaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.service.UsuarioService;


@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    private String msgAlerta;

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {
        model.addAttribute("usuarios", usuarioService.obterLista());
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "usuario/lista";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {
        usuarioService.incluir(usuario);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        try {
            usuarioService.excluir(id);

            msgAlerta = "Exclussão realizada!";
        } catch (Exception e) {
            msgAlerta = "Impossível realizar exclussão!";
        }

        return "redirect:/usuario/lista";
    }
}
