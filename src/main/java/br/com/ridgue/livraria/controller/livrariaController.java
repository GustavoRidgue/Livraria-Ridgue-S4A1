package br.com.ridgue.livraria.controller;

import br.com.ridgue.livraria.model.livrariaModel;
import br.com.ridgue.livraria.service.livrariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class livrariaController {

    @Autowired
    private livrariaService service;

    @GetMapping("/")
    public String mostrarHome(){
        return "index";
    }
    @PostMapping("/cadastrar")
    public String cadastrarLivro(livrariaModel livro) {
        service.cadastrarLivro(livro);
        return "index";
    }
}
