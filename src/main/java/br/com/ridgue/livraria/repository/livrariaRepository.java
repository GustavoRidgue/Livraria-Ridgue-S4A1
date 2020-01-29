package br.com.ridgue.livraria.repository;

import br.com.ridgue.livraria.model.livrariaModel;
import org.springframework.data.repository.CrudRepository;

public interface livrariaRepository extends CrudRepository<livrariaModel, String> {
}
