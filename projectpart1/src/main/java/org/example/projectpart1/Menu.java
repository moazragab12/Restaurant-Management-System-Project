package org.example.projectpart1;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a menu containing various items.
 * <p>
 * This class extends the abstract class Items and provides methods to manage the menu items,
 * such as adding, removing, changing prices, and displaying the menu.
 * </p>
 */
public class Menu extends Items implements Comparable<Items> {
    protected static ArrayList<String> menuItems = new ArrayList<>();
    protected static ArrayList<Double> priceMenuItems = new ArrayList<>();
    protected static ArrayList<String> typeMenuItems = new ArrayList<>();

    /**
     * Constructs an empty Menu object.
     */
    public Menu() {
    }

    /**
     * Constructs a Menu object with specified menu items, prices, and types.
     *
     * @param typeMenuItems  The types of menu items.
     * @param menuItems      The names of menu items.
     * @param priceMenuItems The prices of menu items.
     */
    public Menu(ArrayList<String> typeMenuItems, ArrayList<String> menuItems, ArrayList<Double> priceMenuItems) {
        this.setMenuitems(menuItems);
        this.setPrice_menuitems(priceMenuItems);
        this.setType_menuItems(typeMenuItems);
    }


    /**
     * Retrieves the menu items.
     *
     * @return The list of menu items.
     */
    public ArrayList<String> getMenuitems() {
        return menuItems;
    }



    /**
     * Retrieves the prices of menu items.
     *
     * @return The list of prices of menu items.
     */
    public ArrayList<Double> price_menuItems() {
        return priceMenuItems;
    }



    /**
     * Retrieves the types of menu items.
     *
     * @return The list of types of menu items.
     */
    public ArrayList<String> getType_menuItems() {
        return typeMenuItems;
    }

    /**
     * Sets the types of menu items.
     *
     * @param typeMenuItems The list of types of menu items.
     */
    public void setType_menuItems(ArrayList<String> typeMenuItems) {
        this.typeMenuItems = typeMenuItems;
    }

    /**
     * Adds an item to the menu.
     *
     * @param type  The type of the item.
     * @param item  The name of the item.
     * @param price The price of the item.
     */
    @Override
    public void additem(String type, String item, double price) {
        int lastIndex = typeMenuItems.lastIndexOf(type);

        int m = 0;
        if (lastIndex != -1) {
            for (int i = typeMenuItems.indexOf(type); i <= lastIndex; i++) {
                if (type.equals(typeMenuItems.get(i)) && item.equals(menuItems.get(i))) {
                    if (priceMenuItems.get(i) == price) {
                        System.out.println("Item already exists in the menu.");
                        m = 1;
                        return;
                    }// Exit the method if item already exists
                    else {
                        this.changeprice(item, price);
                        m = 1;
                        return;
                    }
                }
            }
        }
        if (m == 0) {
            if (lastIndex == -1) {
                lastIndex = menuItems.size() - 1;
            }
            menuItems.add(lastIndex + 1, item);
            priceMenuItems.add(lastIndex + 1, price);
            typeMenuItems.add(lastIndex + 1, type);
        }
        Menu menu = new Menu();
        getHeighestPrice(menu);

    }

    /**
     * Removes an item from the menu.
     *
     * @param item The name of the item to be removed.
     */
    @Override
    public void removeitem(String item) {
        int i = menuItems.indexOf(item);
        menuItems.remove(item);
        priceMenuItems.remove(i);
        typeMenuItems.remove(i);
        Menu menu = new Menu();
        getHeighestPrice(menu);


    }

    /**
     * Displays the menu.
     */

    public void displayMenu() {
        System.out.println("Menu");
        System.out.println(typeMenuItems.get(0));
        System.out.println("\t" + menuItems.get(0) + "\t" + priceMenuItems.get(0));
        for (int i = 1; i < menuItems.size(); i++) {
            if (!((typeMenuItems.get(i)).equals(typeMenuItems.get(i - 1))))
                System.out.println(typeMenuItems.get(i));
            System.out.println("\t" + menuItems.get(i) + "\t" + priceMenuItems.get(i));


        }
    }

    /**
     * Changes the price of an item in the menu.
     *
     * @param item      The name of the item whose price needs to be changed.
     * @param new_price The new price of the item.
     */
    public void changeprice(String item, double new_price) {

        priceMenuItems.set(menuItems.indexOf(item), new_price);

    }

    /**
     * Retrieves the price of an item.
     *
     * @param item The name of the item.
     * @return The price of the item.
     */
    public double getprice(String item) {
        int i = menuItems.indexOf(item);
        return priceMenuItems.get(i);

    }

    /**
     * Searches for an item in the menu.
     *
     * @param item The name of the item to search for.
     */
    public void search(String item) {
        int flag = 0;
        for (int i = 0; i < menuItems.size(); i++) {
            if (item.equals(menuItems.get(i)))
                flag = 1;
        }
        if (flag == 0)
            System.out.println("The menu does not contain this element.");
        else
            System.out.println("The menu does contain " + item + " and this price " + this.getprice(item));


    }
    /**
     * Finds the highest price among the menu items.
     *
     * @param o The collection of items to search within.
     * @return The highest price among the menu items.
     */

    public Double getHeighestPrice(Items o) {

        ArrayList<Double> tempPrice = new ArrayList<>();
        tempPrice.addAll(((Menu) o).price_menuItems());
        Collections.sort(tempPrice);
        super.setprice(tempPrice.get(tempPrice.size() - 1));
        return tempPrice.get(tempPrice.size() - 1);

    }
    public void setMenuitems(ArrayList<String> menuitems) {
        this.menuItems = menuitems;
    }


    //    setter and getter price_menuitems
    public static ArrayList<Double> getPrice_menuitems() {
        return priceMenuItems;
    }
    public void setPrice_menuitems(ArrayList<Double> price_menuitems) {
        this.priceMenuItems = price_menuitems;
    }


    //    setter and getter type_menuitems
    public static ArrayList<String> getType_menuitems() {
        return typeMenuItems;
    }

    public void setType_menuitems(ArrayList<String> type_menuitems) {
        this.typeMenuItems = type_menuitems;
    }

}
