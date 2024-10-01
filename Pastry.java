package Bread;

public class Pastry extends Bread {
    // Unique Instance Variables
    private String butter;

    // Default Constructor
    public Pastry() {
        super();
        this.butter = "1.00 cup of butter";
        this.breadName = "Pastry";
        this.recipe = "1. Mix flour, butter, and water.\n" +
                "2. Add sugar and salt.\n" +
                "3. Chill the dough.\n" +
                "4. Roll out the dough and shape it.\n" +
                "5. Bake until golden.";
    }

    // Constructor with parameters
    public Pastry(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String butter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Pastry", "Pastry recipe.");
        this.butter = butter;
    }

    // Getters and Setters
    public String getButter() { return butter; }
    public void setButter(String butter) { this.butter = butter; }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + butter;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getIngredients();
    }
}

