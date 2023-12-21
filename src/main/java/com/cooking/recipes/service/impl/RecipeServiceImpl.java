package com.cooking.recipes.service.impl;

import com.cooking.recipes.controller.request.RecipeCreateRequest;
import com.cooking.recipes.controller.response.RecipeResponse;
import com.cooking.recipes.data.dao.RecipeDao;
import com.cooking.recipes.service.RecipeService;
import com.cooking.recipes.util.RecipeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    private RecipeMapper recipeMapper;

    @Override
    public Mono<RecipeResponse> create(RecipeCreateRequest recipeCreateRequest) {
        RecipeDao recipeDao = recipeMapper.requestToDao(recipeCreateRequest);
        return Mono.just(recipeMapper.daoToResponse(recipeDao));
    }

    @Override
    public Mono<RecipeResponse> update() {
        return Mono.just(new RecipeResponse());
    }

    @Override
    public Mono<Void> delete(String recipeId) {
        return Mono.empty();
    }

    @Override
    public Mono<RecipeResponse> get(String recipeId) {
        return Mono.just(new RecipeResponse());
    }

    @Override
    public Flux<RecipeResponse> getAll() {
        return Flux.just(new RecipeResponse());
    }
}
