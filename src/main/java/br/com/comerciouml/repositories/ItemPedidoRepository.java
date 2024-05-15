package br.com.comerciouml.repositories;

import br.com.comerciouml.domain.Categoria;
import br.com.comerciouml.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemPedodoRepository extends JpaRepository <ItemPedido,Integer> {

}
