package br.edu.infnet.appconfeitaria.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appconfeitaria.model.domain.Pudim;

@Repository
public interface PudimRepository extends CrudRepository<Pudim, Integer>{
    @Query("from Pudim p where p.usuario.id = :id")
    List<Pudim> obterLista(Integer id, Sort sort);
}
