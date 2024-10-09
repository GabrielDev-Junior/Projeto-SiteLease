package br.com.sitelease.controller;

import org.springframework.stereotype.Controller;

@Controller
public class SiteController {

//    @Autowired
//    private ClienteRepository estadoRepositorio;
//

//
//    @GetMapping("/ecommerce.html")
//    public ModelAndView cadastrar(@ModelAttribute Site site) {
//        ModelAndView mv = new ModelAndView("administration/site/ecommerce");
//        mv.addObject("site", ecommerce);
//        return mv;
//    }


    /*
    @GetMapping("/cadastroEstado")
    public ModelAndView cadastrar(@ModelAttribute Cliente cliente) {
        ModelAndView mv = new ModelAndView("administrativo/estados/cadastro");
        mv.addObject("estado", cliente);
        return mv;
    }

    @GetMapping("/listarEstado")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("administrativo/estados/lista");
        mv.addObject("listaEstados", estadoRepositorio.findAll());
        return mv;
    }

    @GetMapping("/editarEstado/{id}")
    public ModelAndView editar(@PathVariable("id") Long id) {
        Optional<Cliente> estado = estadoRepositorio.findById(id);
        if (estado.isPresent()) {
            return cadastrar(estado.get());
        } else {
            // Lidar com a situação em que o estado não é encontrado
            return listar(); // ou redirecionar para uma página de erro
        }
    }

    @GetMapping("/removerEstado/{id}")
    public ModelAndView remover(@PathVariable("id") Long id) {
        Optional<Cliente> cliente = estadoRepositorio.findById(id);
        if (cliente.isPresent()) {
            estadoRepositorio.delete(cliente.get());
        }
        return listar();
    }

    @PostMapping("/salvarEstado")
    public ModelAndView salvar(@ModelAttribute Cliente cliente, BindingResult result) {
        if (result.hasErrors()) {
            return cadastrar(cliente);
        }
        estadoRepositorio.saveAndFlush(cliente);
        return cadastrar(new Cliente() {});
    }


     */
}
