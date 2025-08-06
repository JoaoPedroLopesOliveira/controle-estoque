package com.joaopedro.controle_estoque.DTOs;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ItemMovimentacaoDTO {

    @NotNull
    private Long produtoId;

    @NotNull
    @Min(1)
    private Integer quantidade;

    @NotNull
    @Min(0)
    private double valorUnitario;

}
