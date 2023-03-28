package br.edu.infnet.appconfeitaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appconfeitaria.model.domain.Cliente;
import br.edu.infnet.appconfeitaria.model.domain.Endereco;
import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.service.ClienteService;

@Controller
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    private String msgAlerta;

    @GetMapping(value = "/cliente")
    public String telaCadastro() {
        return "cliente/cadastro";
    }

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {

        model.addAttribute("clientes", clienteService.obterLista(usuario));

        model.addAttribute("mensagem", msgAlerta);

        msgAlerta = null;

        return "cliente/lista";
    }

    @PostMapping(value = "/cliente/incluir")
    public String incluir(Cliente cliente, Endereco endereco, @SessionAttribute("usuario") Usuario usuario) {
        cliente.setUsuario(usuario);

        cliente.setEndereco(endereco);

        clienteService.incluir(cliente);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/cliente/lista";
    }

    @GetMapping(value = "/cliente/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        try {
            clienteService.excluir(id);

            msgAlerta = "Exclussão realizada!";
        } catch (Exception e) {
            msgAlerta = "Impossível realizar exclussão!";
        }

        return "redirect:/cliente/lista";
    }
}
