package br.edu.infnet.appconfeitaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.repository.TortaRepository;

@Controller
public class TortaController {
    private String msgAlerta;

    @GetMapping(value = "/torta")
    public String telaCadastro() {
        return "torta/cadastro";
    }

    @GetMapping(value = "/torta/lista")
    public String telaLista(Model model) {
        model.addAttribute("tortas", TortaRepository.obterLista());
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "torta/lista";
    }

    @PostMapping(value = "/torta/incluir")
    public String incluir(Torta torta) {
        TortaRepository.incluir(torta);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/torta/lista";
    }

    @GetMapping(value = "/torta/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        Torta torta = TortaRepository.excluir(id);

        msgAlerta = "Exclussão realizada!";

        return "redirect:/torta/lista";
    }
}
