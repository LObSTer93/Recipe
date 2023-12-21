package com.cooking.recipes.model;

public record Recipe(String name, boolean isVegetarian, int numOfServings, String ingredients, String instruction) {
    public Recipe() {
        this("name", false, 1, "ingredients", "instruction");
    }
}
