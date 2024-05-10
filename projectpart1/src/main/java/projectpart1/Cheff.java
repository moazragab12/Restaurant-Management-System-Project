package projectpart1;

import org.example.projectpart1.Menu;
/**
 * Represents a Chef in the restaurant.
 * <p>
 * This class extends the abstract class Stuff and implements the Employee interface.
 * It provides methods for adding and removing items from the menu, viewing orders, and managing bonuses.
 * </p>
 */
public class Cheff extends Stuff implements Employee {
    private Menu menu;

    /**
     * Constructs a Chef object with the specified attributes.
     *
     * @param name          The name of the chef.
     * @param address       The address of the chef.
     * @param contactNumber The contact number of the chef.
     * @param salary        The salary of the chef.
     * @param roles         The roles of the chef.
     * @param dayoff        The day off of the chef.
     */
    public Cheff(String name, String address, int contactNumber,int salary, String roles, int dayoff)
    {
        super(name, address, contactNumber, salary, roles, dayoff);
        this.menu=new Menu();
    }
    /**
     * Adds an item to the menu.
     *
     * @param type  The type of the item.
     * @param item  The name of the item.
     * @param price The price of the item.
     */
    public void additem(String type,String item,double price)
    {
        menu.additem(type,item,price);
    }
    /**
     * Removes an item from the menu.
     *
     * @param item The name of the item to be removed.
     */
    public void removeitem(String item)
    {
        menu.removeitem(item);
    }
    /**
     * Views all orders.
     */
    public void viewOrders ()
    {
        Waiter.view_all_orders();
    }
    /**
     * Adds a bonus to the chef's salary.
     *
     * @param salary The base salary of the chef.
     */
    @Override
    public void addBonus(int salary) {
        this.setSalary(750+getSalary());
    } /**
     * Gets the working time of the chef.
     *
     * @return The working time of the chef.
     */

    @Override
    public int getWorkingTime() {
        return 10;
    }
}

