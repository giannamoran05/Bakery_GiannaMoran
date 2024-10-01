package Bread;

public class Bread {
    // Instance Variables
    protected String flour;
    protected String water;
    protected String salt;
    protected String sugar;
    protected String bakingPowder;
    protected String yeast;
    protected String breadName;
    protected String state; // "not baked" or "baked"
    protected String recipe;

    // Default Constructor
    public Bread() {
        this.flour = "4.00 cups";
        this.water = "1.50 cups";
        this.salt = "2.00 tsps";
        this.sugar = "1.00 tbsp";
        this.bakingPowder = "1.00 tsp";
        this.yeast = "1.00 tsp";
        this.breadName = "Generic Bread";
        this.state = "not baked";
        this.recipe = "Default recipe for bread.";
    }

    // Constructor with parameters
    public Bread(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String breadName, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = "not baked";
        this.recipe = recipe;
    }

    // Getters and Setters
    public String getFlour() {
        return flour;
    }
    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getWater() {
        return water;
    }
    public void setWater(String water) {
        this.water = water;
    }

    public String getSalt() {
        return salt;

    }
    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSugar() {
        return sugar;
    }
    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getBakingPowder() {
        return bakingPowder;
    }
    public void setBakingPowder(String bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public String getYeast() {
        return yeast;

    }
    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;

    }
    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;

    }
    public void setState(String state) {
        this.state = state;
    }

    public String getRecipe() {
        return recipe;
    }

    // Method to bake the bread
    public void bake() {
        if (state.equals("not baked")) {
            state = "baked";
            System.out.println("The " + breadName + " is baked now.");
        } else {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        }
    }

    // Method to get all ingredients as a String
    public String getIngredients() {
        return "Ingredients of " + breadName + ":\n" +
                flour + "\n" +
                water + "\n" +
                salt + "\n" +
                sugar + "\n" +
                bakingPowder + "\n" +
                yeast;
    }

    @Override
    public String toString() {
        return "Bread Name: " + breadName + "\n" +
                "State: " + state + "\n" +
                "Recipe: " + recipe;
    }
}
