package br.com.comerciouml.service;

import br.com.comerciouml.domain.Cliente;
import br.com.comerciouml.exceptions.ObjectNotFoundException;
import br.com.comerciouml.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public Cliente busca (Integer id) {

         Optional<Cliente> optional = repository.findById(id);

        return optional.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
