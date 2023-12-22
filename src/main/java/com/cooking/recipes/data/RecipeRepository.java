package com.cooking.recipes.data;

import com.cooking.recipes.data.dao.RecipeDao;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface RecipeRepository extends ReactiveMongoRepository<RecipeDao, String> {

    Mono<RecipeDao> findByName(String name);
}
