package br.com.comerciouml.repositories;

import br.com.comerciouml.domain.Cliente;
import br.com.comerciouml.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Integer> {

}
