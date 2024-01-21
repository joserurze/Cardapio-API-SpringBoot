package com.cardapio.cardapioback.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name ="foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Double preco;
    private String imagem;

    public Foods(FoodRequestDto data) {
        this.titulo = data.titulo();
        this.preco = data.preco();
        this.imagem = data.imagem();
    }
}
