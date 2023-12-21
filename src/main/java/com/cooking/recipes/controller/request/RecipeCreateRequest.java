package com.cooking.recipes.controller.request;

public record RecipeCreateRequest(String name, boolean isVegetarian, int numOfServings, String ingredients, String instruction) {
    public RecipeCreateRequest() {
        this("name", false, 1, "ingredients", "instruction");
    }
}
