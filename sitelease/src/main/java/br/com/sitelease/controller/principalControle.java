package br.com.sitelease.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principalControle {

    // Mapeia a URL para a página de administração
    @GetMapping("/administration")
    public String acessarAdministracao() {
        return "administration/login"; // Retorna a view administration/home.html
    }

}
