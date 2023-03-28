package br.edu.infnet.appconfeitaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.service.BoloService;

@Controller
public class BoloController {
    @Autowired
    private BoloService boloService;

    private String msgAlerta;

    @GetMapping(value = "/bolo")
    public String telaCadastro() {
        return "bolo/cadastro";
    }

    @GetMapping(value = "/bolo/lista")
    public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
        model.addAttribute("bolos", boloService.obterLista(usuario));
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "bolo/lista";
    }

    @PostMapping(value = "/bolo/incluir")
    public String incluir(Bolo bolo, @SessionAttribute("usuario") Usuario usuario) {
        bolo.setUsuario(usuario);

        boloService.incluir(bolo);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/bolo/lista";
    }

    @GetMapping(value = "/bolo/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        try {
            boloService.excluir(id);

            msgAlerta = "Exclussão realizada!";
        } catch (Exception e) {
            msgAlerta = "Impossível realizar exclussão!";
        }

        return "redirect:/bolo/lista";
    }
}
