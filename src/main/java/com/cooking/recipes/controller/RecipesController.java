package com.cooking.recipes.controller;

import com.cooking.recipes.model.Recipe;
import com.cooking.recipes.controller.request.RecipeCreateRequest;
import com.cooking.recipes.controller.request.RecipeUpdateRequest;
import com.cooking.recipes.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/recipes")
@RequiredArgsConstructor
public class RecipesController {

    private final RecipeService recipeService;

    @PostMapping()
    public Mono<Recipe> add(@RequestBody RecipeCreateRequest recipeCreateRequest, ServerHttpResponse response) {
        response.setStatusCode(HttpStatus.CREATED);
        return recipeService.create();
    }

    @PatchMapping("/{recipeId}")
    public Mono<Recipe> update(@PathVariable("recipeId") String recipeId, @RequestBody RecipeUpdateRequest recipeUpdateRequest, ServerHttpResponse response) {
        response.setStatusCode(HttpStatus.OK);
        return recipeService.update();
    }

    @DeleteMapping("/{recipeId}")
    public Mono<Void> delete(@PathVariable("recipeId") String recipeId, ServerHttpResponse response) {
        response.setStatusCode(HttpStatus.OK);
        return recipeService.delete(recipeId);
    }

    @GetMapping("/{recipeId}")
    public Mono<Recipe> get(@PathVariable("recipeId") String recipeId, ServerHttpResponse response) {
        response.setStatusCode(HttpStatus.OK);
        return recipeService.get(recipeId);
    }

    @GetMapping()
    public Flux<Recipe> getAll(ServerHttpResponse response) {
        response.setStatusCode(HttpStatus.OK);
        return recipeService.getAll();
    }
}
