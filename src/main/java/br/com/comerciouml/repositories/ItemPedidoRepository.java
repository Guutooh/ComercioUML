package br.com.comerciouml.repositories;

import br.com.comerciouml.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository <ItemPedido,Integer> {

}
