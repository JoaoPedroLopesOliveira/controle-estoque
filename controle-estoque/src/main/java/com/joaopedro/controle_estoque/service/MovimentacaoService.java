package com.joaopedro.controle_estoque.service;

import com.joaopedro.controle_estoque.repository.MovimentacaoRepository;
import com.joaopedro.controle_estoque.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovimentacaoService {

    private final ProdutoRepository produtoRepository;
    private final MovimentacaoRepository movimentacaoRepository;
}
