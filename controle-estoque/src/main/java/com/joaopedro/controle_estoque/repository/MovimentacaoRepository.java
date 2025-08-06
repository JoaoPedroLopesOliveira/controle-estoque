package com.joaopedro.controle_estoque.repository;

import com.joaopedro.controle_estoque.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
