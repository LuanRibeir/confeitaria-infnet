package br.edu.infnet.appconfeitaria.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appconfeitaria.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    @Query("from Cliente c where c.usuario.id = :id")
    List<Cliente> obterLista(Integer id, Sort sort);
}