package br.com.ridgue.livraria.controller;

import br.com.ridgue.livraria.model.livrariaModel;
import br.com.ridgue.livraria.service.livrariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class livrariaController {

    @Autowired
    private livrariaService service;

    @GetMapping("/")
    public String mostrarHome(){
        return "index";
    }
    @PostMapping("/cadastrar")
    public String cadastrarEventos (livrariaModel livros){
        service.cadastrarLivro(livros);
        return "/listarLivros";
    }
    @GetMapping("/livros")
    public ModelAndView listarLivros(){
        ModelAndView pagina = new ModelAndView("listarLivros");
        Iterable<livrariaModel> livros = service.listarLivros();
        pagina.addObject("livros", livros);
        return pagina;
    }
}

