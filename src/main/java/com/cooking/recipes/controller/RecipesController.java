package com.cooking.recipes.controller;

import com.cooking.recipes.Model.Recipe;
import com.cooking.recipes.controller.request.RecipeCreateRequest;
import com.cooking.recipes.controller.request.RecipeUpdateRequest;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/recipes")
public class RecipesController {

    @PostMapping()
    public Mono<Recipe> add(@RequestBody RecipeCreateRequest recipeCreateRequest) {
        return Mono.just(new Recipe());
    }

    @PatchMapping("/{recipeId}")
    public Mono<Recipe> update(@PathVariable("recipeId") String recipeId, @RequestBody RecipeUpdateRequest recipeUpdateRequest) {
        return Mono.just(new Recipe());
    }
}
