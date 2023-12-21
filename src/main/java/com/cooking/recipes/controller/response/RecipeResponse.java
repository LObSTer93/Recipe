package com.cooking.recipes.controller.response;

public record RecipeResponse(String id, String name, boolean isVegetarian, int numOfServings, String ingredients, String instruction) {
    public RecipeResponse() {
        this("id", "name", false, 1, "ingredients", "instruction");
    }
}
