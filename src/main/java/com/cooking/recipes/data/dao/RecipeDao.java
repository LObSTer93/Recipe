package com.cooking.recipes.data.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;

public record RecipeDao(@Id String id, @Indexed(unique = true) String name, boolean isVegetarian, int numOfServings, @TextIndexed String ingredients, @TextIndexed String instruction) {
}
