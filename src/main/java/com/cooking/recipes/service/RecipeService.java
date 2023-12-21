package com.cooking.recipes.service;

import com.cooking.recipes.model.Recipe;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RecipeService {

    Mono<Recipe> create();

    Mono<Recipe> update();

    Mono<Void> delete(String recipeId);

    Mono<Recipe> get(String recipeId);

    Flux<Recipe> getAll();
}
