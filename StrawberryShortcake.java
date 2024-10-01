package Bread;

public class StrawberryShortcake extends Bread {
    // Unique Instance Variables
    private String strawberries;
    private String whippedCream;

    // Default Constructor
    public StrawberryShortcake() {
        super();
        this.strawberries = "2.00 cups of fresh strawberries";
        this.whippedCream = "1.00 cup of whipped cream";
        this.breadName = "Strawberry Shortcake";
        this.recipe = "1. Prepare the shortcake by mixing flour, sugar, baking powder, and butter.\n" +
                "2. Add milk to form the dough and shape into rounds.\n" +
                "3. Bake until golden.\n" +
                "4. Slice the shortcakes in half.\n" +
                "5. Layer strawberries and whipped cream in between.\n" +
                "6. Top with more strawberries and cream.";
    }

    // Constructor with parameters
    public StrawberryShortcake(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String strawberries, String whippedCream) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Strawberry Shortcake", "Strawberry shortcake recipe.");
        this.strawberries = strawberries;
        this.whippedCream = whippedCream;
    }

    // Getters and Setters
    public String getStrawberries() { return strawberries; }
    public void setStrawberries(String strawberries) { this.strawberries = strawberries; }

    public String getWhippedCream() { return whippedCream; }
    public void setWhippedCream(String whippedCream) { this.whippedCream = whippedCream; }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + strawberries + "\n" + whippedCream;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getIngredients();
    }
}

