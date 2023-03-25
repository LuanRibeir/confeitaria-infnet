package br.edu.infnet.appconfeitaria.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;

@Repository
public interface BoloRepository extends CrudRepository<Bolo, Integer>{
    @Query("from Bolo b where b.usuario.id = :id")
    List<Bolo> obterLista(Integer id);
}
