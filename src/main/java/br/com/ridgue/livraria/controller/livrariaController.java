package br.com.ridgue.livraria.controller;

import br.com.ridgue.livraria.model.livrariaModel;
import br.com.ridgue.livraria.service.livrariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class livrariaController {

    @Autowired
    private livrariaService service;

    @GetMapping("/")
    public String mostrarHome() {
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastrarEventos(livrariaModel livros) {
        service.cadastrarLivro(livros);
        return "/listarLivros";
    }

    @GetMapping("/livros")
    public ModelAndView listarLivros() {
        ModelAndView pagina = new ModelAndView("listarLivros");
        Iterable<livrariaModel> livros = service.listarLivros();
        pagina.addObject("livros", livros);
        return pagina;
    }

    @GetMapping("/buscar")
    public String retornarLivro(){
        return "buscarPorId";
    }

    @GetMapping("livro")
    public String listaLivros(@RequestParam("id") int id, Model model) {
        livrariaModel livro = service.listarLivro(id);
        if (livro != null) {
            model.addAttribute("livro", livro);
        }
        return "listarLivro";
    }
    @GetMapping("livro/{id}")
    public String listaLivrosPorPagina(@PathVariable("id") int id, Model model) {
        livrariaModel livro = service.listarLivro(id);
        if (livro != null) {
            model.addAttribute("livro", livro);
        }
        return "listarLivro";
    }
}

