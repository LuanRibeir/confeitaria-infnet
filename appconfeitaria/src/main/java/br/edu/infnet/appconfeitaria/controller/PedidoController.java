package br.edu.infnet.appconfeitaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appconfeitaria.model.domain.Doce;
import br.edu.infnet.appconfeitaria.model.domain.Pedido;
import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.service.ClienteService;
import br.edu.infnet.appconfeitaria.model.service.DoceService;
import br.edu.infnet.appconfeitaria.model.service.PedidoService;

@Controller
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private DoceService doceService;

    private String msgAlerta;

    @GetMapping(value = "/pedido")
    public String telaCadastro(Model model, @SessionAttribute("usuario") Usuario usuario) {
        model.addAttribute("clientes", clienteService.obterLista(usuario));
        model.addAttribute("doces", doceService.obterLista(usuario));

        return "pedido/cadastro";
    }

    @GetMapping(value = "/pedido/lista")
    public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
        model.addAttribute("pedidos", pedidoService.obterLista(usuario));

        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "pedido/lista";
    }

    @PostMapping(value = "/pedido/incluir")
    public String incluir(Pedido pedido, @SessionAttribute("usuario") Usuario usuario) {
        pedido.setUsuario(usuario);
        pedidoService.incluir(pedido);

        msgAlerta = "Inclussão realizada!";

        return "redirect:/pedido/lista";
    }

    @GetMapping(value = "/pedido/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        pedidoService.excluir(id);

        msgAlerta = "Exclussão realizada!";

        return "redirect:/pedido/lista";
    }
}
