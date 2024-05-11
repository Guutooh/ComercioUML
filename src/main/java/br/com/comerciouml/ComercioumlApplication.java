package br.com.comerciouml;

import br.com.comerciouml.domain.Categoria;
import br.com.comerciouml.domain.Cidade;
import br.com.comerciouml.domain.Estado;
import br.com.comerciouml.domain.Produto;
import br.com.comerciouml.repositories.CategoriaRepository;
import br.com.comerciouml.repositories.CidadeRepository;
import br.com.comerciouml.repositories.EstadoRepository;
import br.com.comerciouml.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ComercioumlApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	ProdutoRepository produtoRepository;
	@Autowired
	CidadeRepository cidadeRepository;
	@Autowired
	EstadoRepository estadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ComercioumlApplication.class, args);
	}


	@Override //um dos meios de realizar carga ou alguma operacao no sistema ao ser iniciado,
	public void run(String... args) throws Exception {

		Categoria categoria1 = new Categoria(null,"Informatica");
		Categoria categoria2 = new Categoria(null,"Escritório");


		Produto produto1 = new Produto(null,"computador", 2000.00);
		Produto produto2 = new Produto(null,"impressora", 800.00);
		Produto produto3 = new Produto(null,"mouse", 80.00);


		//Colocando os produtos em suas categorias
		categoria1.getProdutos().addAll(Arrays.asList(produto1,produto2,produto3));
		categoria2.getProdutos().addAll(Arrays.asList(produto2));


		//Add categoria aos produtos
		produto1.getCategorias().addAll(Arrays.asList(categoria1));
		produto2.getCategorias().addAll(Arrays.asList(categoria1,categoria2));
		produto3.getCategorias().addAll(Arrays.asList(categoria1));

		Estado estado1 = new Estado(null, "Minas Gerais");
		Estado estado2 = new Estado(null, "Sao Paulo");


		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
		produtoRepository.saveAll(Arrays.asList(produto1, produto2,produto3));

		Cidade cidade1 = new Cidade(null, "Uberlandia", estado1);
		Cidade cidade2 = new Cidade(null, "Sao Paulo", estado2);
		Cidade cidade3 = new Cidade(null, "Campinas", estado2);

		estado1.getCidades().addAll(Arrays.asList(cidade1));
		estado2.getCidades().addAll(Arrays.asList(cidade2,cidade3));

		estadoRepository.saveAll(Arrays.asList(estado1,estado2));
		cidadeRepository.saveAll(Arrays.asList(cidade1,cidade2,cidade3));

	}
}
