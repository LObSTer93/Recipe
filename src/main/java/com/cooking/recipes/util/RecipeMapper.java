package com.cooking.recipes.util;

import com.cooking.recipes.controller.request.RecipeCreateRequest;
import com.cooking.recipes.controller.response.RecipeResponse;
import com.cooking.recipes.data.dao.RecipeDao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    RecipeResponse daoToResponse(RecipeDao recipeDao);

    RecipeDao requestToDao(RecipeCreateRequest recipeCreateRequest);
}
