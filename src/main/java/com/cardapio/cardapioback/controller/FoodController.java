package com.cardapio.cardapioback.controller;

import com.cardapio.cardapioback.entity.FoodRepository;
import com.cardapio.cardapioback.entity.Foods;
import com.cardapio.cardapioback.entity.FoodsDto;
import com.cardapio.cardapioback.entity.FoodRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;
    @GetMapping
    public List<FoodsDto> listarTodos(){
        List<FoodsDto> foodList = repository.findAll().stream().map(FoodsDto::new).toList();
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDto data){
        Foods foodData = new Foods(data);
        repository.save(foodData);
        return;
    }
}
