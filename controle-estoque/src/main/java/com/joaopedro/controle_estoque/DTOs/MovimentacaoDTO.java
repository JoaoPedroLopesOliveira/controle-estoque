package com.joaopedro.controle_estoque.DTOs;

import com.joaopedro.controle_estoque.enums.TipoMovimentacao;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class MovimentacaoDTO {

    @NotNull
    private TipoMovimentacao tipo;

    @NotNull
    private LocalDate data;

    private String observacao;

    @NotNull
    private List<ItemMovimentacaoDTO> itens;
}
