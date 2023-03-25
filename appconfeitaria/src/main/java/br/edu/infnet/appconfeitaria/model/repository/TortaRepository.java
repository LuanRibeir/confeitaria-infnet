package br.edu.infnet.appconfeitaria.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appconfeitaria.model.domain.Torta;

@Repository
public interface TortaRepository extends CrudRepository<Torta, Integer>{
    @Query("from Torta t where t.usuario.id = :id")
    List<Torta> obterLista(Integer id);
}
