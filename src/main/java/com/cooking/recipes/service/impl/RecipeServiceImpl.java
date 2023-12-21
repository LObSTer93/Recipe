package com.cooking.recipes.service.impl;

import com.cooking.recipes.model.Recipe;
import com.cooking.recipes.service.RecipeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RecipeServiceImpl implements RecipeService {
    @Override
    public Mono<Recipe> create() {
        return Mono.just(new Recipe());
    }

    @Override
    public Mono<Recipe> update() {
        return Mono.just(new Recipe());
    }

    @Override
    public Mono<Void> delete(String recipeId) {
        return Mono.empty();
    }

    @Override
    public Mono<Recipe> get(String recipeId) {
        return Mono.just(new Recipe());
    }

    @Override
    public Flux<Recipe> getAll() {
        return Flux.just(new Recipe());
    }
}
