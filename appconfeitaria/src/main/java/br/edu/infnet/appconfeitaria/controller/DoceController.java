package br.edu.infnet.appconfeitaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.service.DoceService;

@Controller
public class DoceController {
    @Autowired
    private DoceService doceService;

    private String msgAlerta;

    @GetMapping(value = "/doce/lista")
    public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
        model.addAttribute("doces", doceService.obterLista(usuario));
        
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "doce/lista";
    }

    @GetMapping(value = "/doce/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        try {
            doceService.excluir(id);

            msgAlerta = "Exclussão realizada!";
        } catch (Exception e) {
            msgAlerta = "Impossível realizar exclussão!";
        }
        
        return "redirect:/doce/lista";
    }
}
