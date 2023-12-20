package com.cooking.recipes.controller;

import com.cooking.recipes.Model.Recipe;
import com.cooking.recipes.controller.request.RecipeCreateRequest;
import com.cooking.recipes.controller.request.RecipeUpdateRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/recipes")
public class RecipesController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Recipe> add(@RequestBody RecipeCreateRequest recipeCreateRequest, ServerHttpResponse response) {
        response.setStatusCode(HttpStatus.CREATED);
        return Mono.just(new Recipe());
    }

    @PatchMapping("/{recipeId}")
    public Mono<Recipe> update(@PathVariable("recipeId") String recipeId, @RequestBody RecipeUpdateRequest recipeUpdateRequest, ServerHttpResponse response) {
        response.setStatusCode(HttpStatus.OK);
        return Mono.just(new Recipe());
    }

    @DeleteMapping("/{recipeId}")
    public Mono<Void> delete(@PathVariable("recipeId") String recipeId, ServerHttpResponse response) {
        response.setStatusCode(HttpStatus.OK);
        return Mono.empty();
    }
}
