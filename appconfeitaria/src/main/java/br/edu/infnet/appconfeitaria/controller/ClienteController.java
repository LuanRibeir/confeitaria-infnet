package br.edu.infnet.appconfeitaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appconfeitaria.model.domain.Cliente;
import br.edu.infnet.appconfeitaria.model.repository.ClienteRepository;

@Controller
public class ClienteController {
    private String msgAlerta;

    @GetMapping(value = "/cliente")
    public String telaCadastro() {
        return "cliente/cadastro";
    }

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model) {
        model.addAttribute("clientes", ClienteRepository.obterLista());
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "cliente/lista";
    }

    @PostMapping(value = "/cliente/incluir")
    public String incluir(Cliente cliente) {
        ClienteRepository.incluir(cliente);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/cliente/lista";
    }

    @GetMapping(value = "/cliente/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        Cliente cliente = ClienteRepository.excluir(id);

        msgAlerta = "Exclussão realizada!";

        return "redirect:/cliente/lista";
    }
}