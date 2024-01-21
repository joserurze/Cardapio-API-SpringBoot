package com.cardapio.cardapioback.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Foods,Long> {
}
