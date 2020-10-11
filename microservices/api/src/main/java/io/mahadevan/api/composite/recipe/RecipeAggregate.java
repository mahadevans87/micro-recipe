package io.mahadevan.api.composite.recipe;

import java.util.List;

public class RecipeAggregate {
    private final int recipeId;
    private final String name;
    private final String description;
    private final String imageURL;
    private final List<RecommendationSummary> recommendations;
    private final List<ReviewSummary> reviews;
    private final ServiceAddresses serviceAddresses;

    public RecipeAggregate(
        int recipeId,
        String name,
        String description,
        String imageURL,
        List<RecommendationSummary> recommendations,
        List<ReviewSummary> reviews,
        ServiceAddresses serviceAddresses) {

        this.recipeId = recipeId;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.recommendations = recommendations;
        this.reviews = reviews;
        this.serviceAddresses = serviceAddresses;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() { return imageURL; }

    public List<RecommendationSummary> getRecommendations() {
        return recommendations;
    }

    public List<ReviewSummary> getReviews() {
        return reviews;
    }

    public ServiceAddresses getServiceAddresses() {
        return serviceAddresses;
    }
}
