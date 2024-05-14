package br.com.comerciouml.repositories;

import br.com.comerciouml.domain.Estado;
import br.com.comerciouml.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento,Integer> {

}
