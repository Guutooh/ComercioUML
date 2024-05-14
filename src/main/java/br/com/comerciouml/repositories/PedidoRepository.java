package br.com.comerciouml.repositories;

import br.com.comerciouml.domain.Categoria;
import br.com.comerciouml.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido,Integer> {

}
