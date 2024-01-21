package com.cardapio.cardapioback.entity;

public record FoodsDto(
        Long id,
        String titulo,
        Double preco,
        String imagem ) {

    public FoodsDto(Foods foods) {
        this(foods.getId(), foods.getTitulo(), foods.getPreco(), foods.getImagem());
    }
}
