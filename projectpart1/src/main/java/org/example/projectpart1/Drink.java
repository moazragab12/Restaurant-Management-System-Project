package org.example.projectpart1;

/**
 * Represents a drink item in the application.
 */
public class Drink extends Items {

    private double price = 50; // Default price
    private String name;

    public String getName() {
        return name;
    }

    /**
     * Constructs a Drink object with default price.
     */
    Drink() {
        super.setprice(price);
    }

    /**
     * Constructs a Drink object with specified price.
     *
     * @param price The price of the drink.
     */
    Drink(Double price) {
        this.price = price;
        super.setprice(price);
    }

    /**
     * Constructs a Drink object with specified price and name.
     *
     * @param price The price of the drink.
     * @param name  The name of the drink.
     */
    Drink(Double price, String name) {
        this(price);
        this.name = name;
    }

    /**
     * Adds an item to the drink category.
     *
     * @param type  The type of the item.
     * @param item  The name of the item.
     * @param price The price of the item.
     */
    @Override
    public void additem(String type, String item, double price) {
        // Implementation details...
    }

    /**
     * Removes an item from the drink category.
     *
     * @param item The name of the item to be removed.
     */
    @Override
    public void removeitem(String item) {
        // Implementation details...
    }

    /**
     * Changes the price of an item in the drink category.
     *
     * @param item     The name of the item whose price needs to be changed.
     * @param new_price The new price of the item.
     */
    @Override
    public void changeprice(String item, double new_price) {
        // Implementation details...
    }

    /**
     * Searches for an item in the drink category.
     *
     * @param item The name of the item to search for.
     */
    @Override
    public void search(String item) {
        // Implementation details...
    }

    /**
     * Retrieves the highest price among all items.
     *
     * @param items The collection of items.
     * @return The highest price among all items.
     */
    @Override
    public Double getHeighestPrice(Items items) {
        return 0.0;
    }
}