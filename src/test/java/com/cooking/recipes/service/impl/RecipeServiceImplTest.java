package com.cooking.recipes.service.impl;

import com.cooking.recipes.controller.request.RecipeCreateRequest;
import com.cooking.recipes.controller.response.RecipeResponse;
import com.cooking.recipes.service.RecipeService;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

class RecipeServiceImplTest {

    RecipeService recipeService = new RecipeServiceImpl();

    @Test
    void create() {
//        RecipeCreateRequest recipeCreateRequest = new RecipeCreateRequest();
//        Mono<RecipeResponse> recipeResponseMono = recipeService.create(recipeCreateRequest);
//        assertEquals(recipeCreateRequest, recipeResponseMono.block());
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