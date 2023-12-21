package com.cooking.recipes.service;

import com.cooking.recipes.controller.request.RecipeCreateRequest;
import com.cooking.recipes.controller.response.RecipeResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RecipeService {

    Mono<RecipeResponse> create(RecipeCreateRequest recipeCreateRequest);

    Mono<RecipeResponse> update();

    Mono<Void> delete(String recipeId);

    Mono<RecipeResponse> get(String recipeId);

    Flux<RecipeResponse> getAll();
}
