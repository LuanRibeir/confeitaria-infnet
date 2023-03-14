package br.edu.infnet.appconfeitaria.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.repository.UsuarioRepository;


@Controller
public class UsuarioController {
    private String alertaInclussaoSucesso;

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {
        model.addAttribute("usuarios", UsuarioRepository.obterLista());
        model.addAttribute("mensagem", alertaInclussaoSucesso);
        alertaInclussaoSucesso = null;

        return "usuario/lista";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {
        UsuarioRepository.incluir(usuario);

        alertaInclussaoSucesso = "Inclussão realizada com sucesso!";

        return "redirect:/usuario/lista";
    }
}
