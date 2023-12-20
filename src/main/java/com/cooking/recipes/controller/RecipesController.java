package com.cooking.recipes.controller;

import com.cooking.recipes.Model.Recipe;
import com.cooking.recipes.controller.request.RecipeCreateRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/recipes")
public class RecipesController {

    @PostMapping()
    public Mono<Recipe> add(@RequestBody RecipeCreateRequest recipeCreateRequest) {
        return Mono.just(new Recipe());
    }
}
