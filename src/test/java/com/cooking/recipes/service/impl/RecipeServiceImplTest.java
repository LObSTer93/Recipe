package com.cooking.recipes.service.impl;

import com.cooking.recipes.controller.request.RecipeCreateRequest;
import com.cooking.recipes.controller.response.RecipeResponse;
import com.cooking.recipes.data.RecipeRepository;
import com.cooking.recipes.service.RecipeService;
import com.cooking.recipes.util.RecipeMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@DataMongoTest
@ExtendWith(SpringExtension.class)
class RecipeServiceImplTest {

    @Autowired
    private RecipeRepository recipeRepository;
    RecipeService recipeService;

    @BeforeEach
    public void init() {
        recipeService = new RecipeServiceImpl(Mappers.getMapper(RecipeMapper.class), recipeRepository);
    }

    @Test
    void createSuccessTest() {
        RecipeCreateRequest recipeCreateRequest = new RecipeCreateRequest(
                "name", false, 1, "ingredients", "instruction"
        );
        Mono<RecipeResponse> recipeResponseMono = recipeService.create(recipeCreateRequest);
        StepVerifier.create(recipeResponseMono)
                        .expectNextMatches(it ->
                                it.name().equals("name") &&
                                !it.isVegetarian() &&
                                it.numOfServings() == 1 &&
                                it.ingredients().equals("ingredients") &&
                                it.instruction().equals("instruction")

                        )
                .verifyComplete();
    }

    @Test
    void createConflictTest() {
        RecipeCreateRequest recipeCreateRequest = new RecipeCreateRequest(
                "name", false, 1, "ingredients", "instruction"
        );
        Mono<RecipeResponse> recipeResponseMono = recipeService.create(recipeCreateRequest);
        RecipeCreateRequest anotherRecipeCreateRequest = new RecipeCreateRequest(
                "name", false, 1, "ingredients", "instruction"
        );
        Mono<RecipeResponse> anotherRecipeResponseMono = recipeResponseMono.then(
                recipeService.create(anotherRecipeCreateRequest)
        );
        StepVerifier.create(anotherRecipeResponseMono)
                .expectError(IllegalArgumentException.class)
                .verify();
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