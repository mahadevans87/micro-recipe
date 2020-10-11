package io.mahadevan.api.core.recipe;

public class Recipe {
    private final int recipeId;
    private final String name;
    private final String description;
    private final String imageURL;
    private final String serviceAddress;

    public Recipe(int recipeId, String name, String description, String imageURL, String serviceAddress) {
        this.recipeId = recipeId;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.serviceAddress = serviceAddress;
    }

    public Recipe() {
        this.recipeId = 0;
        this.name = null;
        this.description = null;
        this.imageURL = null;
        this.serviceAddress = null;
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

    public String getImageURL() {
        return imageURL;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
