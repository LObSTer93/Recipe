package com.cooking.recipes.data;

import com.cooking.recipes.data.dao.RecipeDao;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RecipeRepository extends ReactiveMongoRepository<RecipeDao, String> {
}
