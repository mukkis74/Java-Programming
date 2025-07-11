import java.net.StandardSocketOptions;

public class Sandwich {

    // Array for storing the names of the ingredients
    static String[] ingredients;

    // variable for storing the status of the sandwich
    // if it is ready or not
    static boolean sandwichReady;

    public static void gatherIngredients() {
        // place the ingredients in the array
        ingredients = new String[4];
        ingredients[0] = "bread";
        ingredients[1] = "chicken";
        ingredients[2] = "cheese";
        ingredients[3] = "lettuce";
        System.out.println("All ingredients arranged");
    }

    ;

    public static void assembleSandwich() {
        // check if all the ingredients are available
        if (ingredients.length == 4) {
            if (ingredients[0].equals("bread") &&
                    ingredients[1].equals("chicken") &&
                    ingredients[2].equals("cheese") &&
                    ingredients[3].equals("lettuce")) ;
            System.out.println("Assemble the sandwich ..");
            sandwichReady = true;
        } else {
            System.out.println("Some ingredients are missing .");

        };

        //public static void serveSandwich () {

        };
    }
