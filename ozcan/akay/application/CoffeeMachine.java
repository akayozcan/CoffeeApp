package ozcan.akay.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.IllegalFormatException;

/**
 * This class represents a Coffee Machine application that allows users to select and order coffee drinks.
 */
public class CoffeeMachine {

    /**
     * The main method of the CoffeeMachine application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String args[]) {

        // Initialize the coffee map
        Map<Integer, String> coffeeMap = new HashMap<>();
        createCoffeeMap(coffeeMap);

        // Get user input
        Scanner input = new Scanner(System.in);

        // Display the coffee menu
        displayMenu();
        System.out.print("Please enter the number of the coffee you want to drink:");
        int choice = input.nextInt();

        // Prepare and display the selected coffee
        Coffee coffee = new Coffee(coffeeMap.get(choice));
        displayInfo(coffee);

        input.close();
    }

    /**
     * Displays the menu of available coffee drinks.
     */
    static void displayMenu() {
        System.out.println("- COFFEE LIST -");
        System.out.println("1. Espresso (20 ₺)");
        System.out.println("2. Double Espresso (29 ₺)");
        System.out.println("3. Cappuccino (27 ₺)");
        System.out.println("4. Caffe Latte (27 ₺)");
        System.out.println("5. Mocha (32 ₺)");
        System.out.println("6. Americano (25 ₺)");
        System.out.println("7. Hot Water (5 ₺)");
    }

    /**
     * Initializes the coffee map with coffee drink options.
     *
     * @param coffees The map to populate with coffee drink options.
     */
    static void createCoffeeMap(Map<Integer, String> coffees) {
        coffees.put(1, "Espresso");
        coffees.put(2, "Double Espresso");
        coffees.put(3, "Cappuccino");
        coffees.put(4, "Caffe Latte");
        coffees.put(5, "Mocha");
        coffees.put(6, "Americano");
        coffees.put(7, "Hot Water");
    }

    /**
     * Displays information about the selected coffee.
     *
     * @param coffee The selected Coffee object.
     */
    static void displayInfo(Coffee coffee) {

        System.out.println("\nThank you, your coffee is being prepared... ");
        System.out.println("You have selected " + coffee.getName() + ".");
        System.out.println(coffee.recipes());
        System.out.println("The price of your drink is " + coffee.getPrice() + " ₺.");
        System.out.println("Enjoy Your Meal :)");
    }
}
