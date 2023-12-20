package com.cooking.recipes;

import com.cooking.recipes.Model.Recipe;
import com.cooking.recipes.controller.request.RecipeCreateRequest;
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
				.body(Mono.just(new RecipeCreateRequest()), RecipeCreateRequest.class)
				.exchange()
				.expectStatus().isOk()
				.expectBody(Recipe.class);
	}
}
