package br.edu.infnet.appconfeitaria.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.appconfeitaria.model.domain.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer>{
    @Query("from Pedido p where p.usuario.id = :id")
    List<Pedido> obterLista(Integer id, Sort sort);
}
