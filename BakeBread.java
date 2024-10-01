package Bread;

public class BakeBread {
    public static void main(String[] args) {
        // Creating instances of bread and its subclasses

        Pastry pastry = new Pastry();
        StrawberryShortcake shortcake = new StrawberryShortcake();

        // Displaying ingredients and recipes for each bread

        System.out.println(pastry.getIngredients());
        System.out.println("A recipe of Pastry:\n" + pastry.recipe);
        pastry.bake();

        System.out.println();

        System.out.println(shortcake.getIngredients());
        System.out.println("A recipe of Strawberry Shortcake:\n" + shortcake.recipe);
        shortcake.bake();
    }
}

