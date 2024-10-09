package br.com.sitelease.controller;

import br.com.sitelease.model.domain.Cliente;
import br.com.sitelease.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/cadastroCliente")
    public ModelAndView mostrarFormularioCadastroCliente(@ModelAttribute Cliente cliente) {
        ModelAndView mv = new ModelAndView("administration/cliente/cadastro");
        mv.addObject("cliente", cliente);
        return mv;
    }

    @PostMapping("/salvarCliente") // Corrija a rota para refletir a ação correta
    public ModelAndView salvar(@ModelAttribute Cliente cliente, BindingResult result) {
        if (result.hasErrors()) {
            return mostrarFormularioCadastroCliente(cliente);
        }
        clienteRepository.save(cliente); // Você pode usar save() em vez de saveAndFlush() se não precisar de uma transação imediata
        return mostrarFormularioCadastroCliente(new Cliente());
    }
}
