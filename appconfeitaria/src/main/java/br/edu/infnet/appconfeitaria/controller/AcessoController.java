package br.edu.infnet.appconfeitaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.service.UsuarioService;
import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("usuario")
public class AcessoController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/login")
    public String telaLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String senha) {
        Usuario usuario = new Usuario(email, senha);

        usuario = usuarioService.autenticar(usuario);

        if(usuario != null) {
            model.addAttribute("usuario", usuario);

            return "redirect:/home";
        }

        model.addAttribute("alertaCredencialEmail", "As credenciais para o e-mail. " + email + " estão incorretas!");

        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus status){
        status.setComplete();
        session.removeAttribute("usuario");

        return "redirect:/";
    }
}
