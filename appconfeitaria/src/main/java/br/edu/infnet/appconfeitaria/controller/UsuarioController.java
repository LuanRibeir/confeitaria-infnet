package br.edu.infnet.appconfeitaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.repository.UsuarioRepository;


@Controller
public class UsuarioController {
    private String msgAlerta;

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {
        model.addAttribute("usuarios", UsuarioRepository.obterLista());
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "usuario/lista";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {
        UsuarioRepository.incluir(usuario);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        Usuario usuario = UsuarioRepository.excluir(id);

        msgAlerta = "Exclussão realizada!";

        return "redirect:/usuario/lista";
    }
}
