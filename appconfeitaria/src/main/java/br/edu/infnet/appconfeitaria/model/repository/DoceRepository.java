package br.edu.infnet.appconfeitaria.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appconfeitaria.model.domain.Doce;

@Repository
public interface DoceRepository extends CrudRepository<Doce, Integer>{
    @Query("from Doce d where d.usuario.id = :userId")
	List<Doce> obterLista(Integer userId, Sort sort);
}
