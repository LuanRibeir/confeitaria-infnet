package br.edu.infnet.appconfeitaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.service.TortaService;

@Controller
public class TortaController {
    @Autowired
    private TortaService tortaService;

    private String msgAlerta;

    @GetMapping(value = "/torta")
    public String telaCadastro() {
        return "torta/cadastro";
    }

    @GetMapping(value = "/torta/lista")
    public String telaLista(Model model) {
        model.addAttribute("tortas", tortaService.obterLista());
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "torta/lista";
    }

    @PostMapping(value = "/torta/incluir")
    public String incluir(Torta torta) {
        tortaService.incluir(torta);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/torta/lista";
    }

    @GetMapping(value = "/torta/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        Torta torta = tortaService.excluir(id);

        msgAlerta = "Exclussão realizada!";

        return "redirect:/torta/lista";
    }
}
