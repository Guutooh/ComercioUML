package br.com.comerciouml.repositories;

import br.com.comerciouml.domain.Cidade;
import br.com.comerciouml.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository <Estado,Integer> {

}
