package br.com.fatec.sistema_comercio_web.repository;

import br.com.fatec.sistema_comercio_web.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
