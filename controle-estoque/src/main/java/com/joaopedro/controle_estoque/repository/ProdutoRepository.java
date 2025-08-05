package com.joaopedro.controle_estoque.repository;

import com.joaopedro.controle_estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
