package br.com.comerciouml.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Produto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private Double preco;

    @JsonBackReference // Para o relacionamento não entrar em um looping entre as duas relações
    @ManyToMany
    @JoinTable(name = "PRODUTO_CATEGORIA", //nome da tabela intermediaria do muitos x muitos
            joinColumns = @JoinColumn(name = "produto_id"), // nome da chave estrangeira correspondente a produto
            inverseJoinColumns = @JoinColumn(name = "categoria_id")) //chave estrangeira correspondente a categoria
    private List<Categoria> categorias = new ArrayList<>();


    public Produto(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}
