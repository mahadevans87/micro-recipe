package io.mahadevan.api.core.recipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface RecipeService {

    @GetMapping(
            value = "/recipe/{recipeId}",
            produces = "application/json"
    )
    Recipe getProduct(@PathVariable("recipeId") int recipeId);
}
