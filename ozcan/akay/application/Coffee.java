package ozcan.akay.application;

import java.util.Map;
import java.util.HashMap;

/**
 * The `Coffee` class represents different coffee drinks with their names, prices, and recipes.
 */
public class Coffee {
    private String name;
    private Map<String, Integer> priceMap = new HashMap<>();

    /**
     * Constructs a new `Coffee` object with the given name and initializes its price map.
     *
     * @param name The name of the coffee drink.
     */
    public Coffee(String name) {
        this.name = name;
        createPriceMap();
    }

    /**
     * Gets the name of the coffee drink.
     *
     * @return The name of the coffee drink.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the coffee drink.
     *
     * @return The price of the coffee drink.
     */
    public int getPrice() {
        return priceMap.get(name);
    }

    /**
     * Initializes the price map with coffee drink names and their corresponding prices.
     */
    public void createPriceMap() {
        priceMap.put("Espresso", 20);
        priceMap.put("Double Espresso", 29);
        priceMap.put("Cappuccino", 27);
        priceMap.put("Caffe Latte", 27);
        priceMap.put("Mocha", 32);
        priceMap.put("Americano", 25);
        priceMap.put("Hot Water", 5);
    }

    /**
     * Generates and returns the recipe for the selected coffee drink.
     *
     * @return The recipe for the selected coffee drink.
     */
    public String recipes() {
        String strRecipe = "";

        switch (name) {
            case "Espresso":
                strRecipe = "This drink contains one dose of Espresso.";
                break;
            case "Double Espresso":
                strRecipe = "This drink contains two doses of Espresso.";
                break;
            case "Cappuccino":
                strRecipe = "This drink contains one dose of Espresso and four doses of Hot Water.";
                break;
            case "Caffe Latte":
                strRecipe = "This drink contains one dose of Espresso, two doses of Steamed Milk, and two doses of Milk Foam.";
                break;
            case "Mocha":
                strRecipe = "This drink contains one dose of Espresso, one dose of Steamed Milk, one dose of Milk Foam, and two doses of Hot Chocolate.";
                break;
            case "Americano":
                strRecipe = "This drink contains one dose of Espresso and four doses of Hot Water.";
                break;
            case "Hot Water":
                strRecipe = "This drink contains five doses of Hot Water.";
                break;
            default:
                break;
        }

        return strRecipe;
    }
}
