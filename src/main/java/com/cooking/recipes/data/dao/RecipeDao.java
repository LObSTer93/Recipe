package com.cooking.recipes.data.dao;

import org.springframework.data.annotation.Id;

public record RecipeDao(@Id String id, String name, boolean isVegetarian, int numOfServings, String ingredients, String instruction) {
}
