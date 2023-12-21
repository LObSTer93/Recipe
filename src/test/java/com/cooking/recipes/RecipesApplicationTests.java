package com.cooking.recipes;

import com.cooking.recipes.model.Recipe;
import com.cooking.recipes.controller.request.RecipeUpdateRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

@SpringBootTest
@AutoConfigureWebTestClient
class RecipesApplicationTests {

	@Autowired
	private WebTestClient webClient;

	@Test
	void addRecipeTest() {
		webClient.post().uri("/recipes")
				.body(Mono.just(new Recipe()), Recipe.class)
				.exchange()
				.expectStatus().isCreated()
				.expectBody(Recipe.class);
	}

	@Test
	void updateRecipeTest() {
		webClient.patch().uri("/recipes/1")
				.body(Mono.just(new RecipeUpdateRequest()), RecipeUpdateRequest.class)
				.exchange()
				.expectStatus().isOk()
				.expectBody(Recipe.class);
	}

	@Test
	void deleteRecipeTest() {
		webClient.delete().uri("/recipes/1")
				.exchange()
				.expectStatus().isOk();
	}

	@Test
	void getRecipeTest() {
		webClient.get().uri("/recipes/1")
				.exchange()
				.expectStatus().isOk()
				.expectBody(Recipe.class);
	}

	@Test
	void getRecipesTest() {
		webClient.get().uri("/recipes")
				.exchange()
				.expectStatus().isOk()
				.expectBodyList(Recipe.class);
	}
}
