package br.edu.infnet.appconfeitaria.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;

@Repository
public interface BoloRepository extends CrudRepository<Bolo, Integer>{
}
