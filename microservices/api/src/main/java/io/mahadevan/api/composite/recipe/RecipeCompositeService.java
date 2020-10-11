package io.mahadevan.api.composite.recipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface RecipeCompositeService {

    /**
     * Sample usage: curl $HOST:$PORT/recipe-composite/1
     *
     * @param recipeId
     * @return the composite recipe info, if found, else null
     */
    @GetMapping(
        value    = "/recipe-composite/{recipeId}",
        produces = "application/json")
    RecipeAggregate getProduct(@PathVariable int recipeId);
}
