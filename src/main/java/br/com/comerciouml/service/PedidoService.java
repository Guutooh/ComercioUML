package br.com.comerciouml.service;

import br.com.comerciouml.domain.Cliente;
import br.com.comerciouml.domain.Pedido;
import br.com.comerciouml.exceptions.ObjectNotFoundException;
import br.com.comerciouml.repositories.ClienteRepository;
import br.com.comerciouml.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository repository;

    public Pedido busca (Integer id) {

        Optional<Pedido> optional = repository.findById(id);

        return optional.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
