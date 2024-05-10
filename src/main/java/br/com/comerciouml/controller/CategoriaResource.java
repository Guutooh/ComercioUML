package br.com.comerciouml.controller;

import br.com.comerciouml.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    CategoriaService service;

    @GetMapping("{id}")
    public ResponseEntity<?> Procurar(@PathVariable Integer id) {

         return ResponseEntity.status(HttpStatus.OK).body(service.busca(id));

    }

}
