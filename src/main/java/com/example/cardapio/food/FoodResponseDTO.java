package com.example.cardapio.food;

public record FoodResponseDTO(Long id, String nome, Integer valor) {
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getNome(),  food.getValor());
    }
}
