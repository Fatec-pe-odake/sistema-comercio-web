package br.com.fatec.sistema_comercio_web.repository;

import br.com.fatec.sistema_comercio_web.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {



}
