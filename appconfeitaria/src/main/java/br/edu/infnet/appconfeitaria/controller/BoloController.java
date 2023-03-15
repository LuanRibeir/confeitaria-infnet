package br.edu.infnet.appconfeitaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.repository.BoloRepository;

@Controller
public class BoloController {
    private String msgAlerta;

    @GetMapping(value = "/bolo")
    public String telaCadastro() {
        return "bolo/cadastro";
    }

    @GetMapping(value = "/bolo/lista")
    public String telaLista(Model model) {
        model.addAttribute("bolos", BoloRepository.obterLista());
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "bolo/lista";
    }

    @PostMapping(value = "/bolo/incluir")
    public String incluir(Bolo bolo) {
        BoloRepository.incluir(bolo);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/bolo/lista";
    }

    @GetMapping(value = "/bolo/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        Bolo bolo = BoloRepository.excluir(id);

        msgAlerta = "Exclussão realizada!";

        return "redirect:/bolo/lista";
    }
}
