package br.com.comerciouml.service;

import br.com.comerciouml.domain.Categoria;
import br.com.comerciouml.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository repository;

    public Categoria busca (Integer id) {

         Optional<Categoria> optional = repository.findById(id);

        return optional.orElse(null);
    }
}
