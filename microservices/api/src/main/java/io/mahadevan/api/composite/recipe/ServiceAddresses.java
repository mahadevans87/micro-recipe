package io.mahadevan.api.composite.recipe;

public class ServiceAddresses {
    private final String cmp;
    private final String recipe;
    private final String review;
    private final String recommendation;

    public ServiceAddresses() {
        cmp = null;
        recipe = null;
        review = null;
        recommendation = null;
    }

    public ServiceAddresses(String compositeAddress, String recipeAddress, String reviewAddress, String recommendationAddress) {
        this.cmp = compositeAddress;
        this.recipe = recipeAddress;
        this.review = reviewAddress;
        this.recommendation = recommendationAddress;
    }

    public String getCmp() {
        return cmp;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getReview() {
        return review;
    }

    public String getRecommendation() {
        return recommendation;
    }
}
