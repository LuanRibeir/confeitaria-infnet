package br.edu.infnet.appconfeitaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appconfeitaria.model.domain.Pudim;
import br.edu.infnet.appconfeitaria.model.repository.PudimRepository;

@Controller
public class PudimController {
    private String msgAlerta;

    @GetMapping(value = "/pudim")
    public String telaCadastro() {
        return "pudim/cadastro";
    }

    @GetMapping(value = "/pudim/lista")
    public String telaLista(Model model) {
        model.addAttribute("pudins", PudimRepository.obterLista());
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "pudim/lista";
    }

    @PostMapping(value = "/pudim/incluir")
    public String incluir(Pudim pudim) {
        PudimRepository.incluir(pudim);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/pudim/lista";
    }

    @GetMapping(value = "/pudim/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        Pudim pudim = PudimRepository.excluir(id);

        msgAlerta = "Exclussão realizada!";

        return "redirect:/pudim/lista";
    }
}
