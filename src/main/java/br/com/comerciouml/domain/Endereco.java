package br.com.comerciouml.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Endereco implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;

    @JsonBackReference // Para o relacionamento não entrar em um looping entre as duas relações
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="cidade_id")
    private Cidade cidade;


}
