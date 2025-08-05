package com.joaopedro.controle_estoque.model;

import com.joaopedro.controle_estoque.enums.TipoMovimentacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipo;

    private LocalDate data;

    private String observacao;

    @OneToMany(mappedBy = "movimentacao",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ItemMovimentacao> itens = new ArrayList<>();
}
