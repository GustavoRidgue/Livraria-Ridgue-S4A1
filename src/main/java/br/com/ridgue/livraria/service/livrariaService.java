package br.com.ridgue.livraria.service;

import br.com.ridgue.livraria.model.livrariaModel;
import br.com.ridgue.livraria.repository.livrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

//Aqui, no service, a gnt coloca as regras de negocios:
@Service
public class livrariaService {

    @Autowired
    private livrariaRepository repository;

    public livrariaModel cadastrarLivro(livrariaModel livro) {
        return repository.save(livro);
    }
    public Iterable<livrariaModel> listarLivros(){
         Iterable<livrariaModel> livros = repository.findAll();
         return livros;
    }
}
