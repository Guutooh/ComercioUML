package br.com.comerciouml.repositories;

import br.com.comerciouml.domain.Categoria;
import br.com.comerciouml.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository <Cidade,Integer> {

}
