/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.example.projectpart1;

/**
 * @author Dell
 */

import java.util.ArrayList;

/**
 * Represents an abstract class for items in the application.
 * <p>
 * This class provides methods for managing items such as adding, removing, and changing their prices.
 * It also provides functionality for searching and comparing items based on their prices.
 * </p>
 * <p>
 * Subclasses must implement the abstract methods to define specific behavior for adding, removing, changing prices,
 * searching, and finding the highest price among items.
 * </p>
 */
public abstract class Items implements Comparable<Items> {
    private double price;
    /**
     * Adds an item to the collection.
     *
     * @param type  The type of the item.
     * @param item  The name of the item.
     * @param price The price of the item.
     */
    public abstract void additem(String type, String item, double price);
    /**
     * Removes an item from the collection.
     *
     * @param item The name of the item to be removed.
     */
    public abstract void removeitem(String item);
    /**
     * Changes the price of an item in the collection.
     *
     * @param item     The name of the item whose price needs to be changed.
     * @param new_price The new price of the item.
     */
    public abstract void changeprice(String item, double new_price);
    /**
     * Searches for an item in the collection.
     *
     * @param item The name of the item to search for.
     */
    public abstract void search(String item);
    /**
     * Gets the price of the item.
     *
     * @return The price of the item.
     */
    public final double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }
    /**
     * Compares this item with another item based on their prices.
     *
     * @param item The item to compare with.
     * @return An integer value representing the comparison result.
     *         <ul>
     *         <li>1 if this item's price is greater than the other item's price.</li>
     *         <li>-1 if this item's price is less than the other item's price.</li>
     *         <li>0 if both items have the same price.</li>
     *         </ul>
     */
    @Override
    public int compareTo(Items item) {

        if (this.getprice() > item.getprice()) {
            return 1;
        } else if (this.getprice() < item.getprice()) {
            return -1;
        } else {
            return 0;
        }
    }
    /**
     * Finds the highest price among the items.
     *
     * @param items The collection of items to search within.
     * @return The highest price among the items.
     */
    public abstract Double getHeighestPrice(Items items);
}


