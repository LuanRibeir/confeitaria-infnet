package br.edu.infnet.appconfeitaria.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appconfeitaria.model.domain.Doce;

@Repository
public interface DoceRepository extends CrudRepository<Doce, Integer>{

}
