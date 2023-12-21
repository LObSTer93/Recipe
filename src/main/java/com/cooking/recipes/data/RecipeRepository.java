package com.cooking.recipes.data;

import com.cooking.recipes.data.dao.RecipeDao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<RecipeDao, String> {
}
