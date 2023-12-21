package com.cooking.recipes.service.impl;

import com.cooking.recipes.model.Recipe;
import com.cooking.recipes.service.RecipeService;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

class RecipeServiceImplTest {

    RecipeService recipeService = new RecipeServiceImpl();

    @Test
    void create() {
        Recipe recipe = new Recipe();
        Mono<Recipe> recipeMono = recipeService.create(recipe);
        assertEquals(recipe, recipeMono.block());
    }

    @Test
    void update() {

    }

    @Test
    void delete() {
    }

    @Test
    void get() {
    }

    @Test
    void getAll() {
    }
}