
package projectpart1;

import org.example.projectpart1.Bill;
import org.example.projectpart1.Menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a manager in the restaurant.
 * <p>
 * This class extends the Stuff class and implements the Employee interface.
 * It provides methods for managing employee feedback, raising salaries, calculating profits,
 * adding and removing employees, changing menu prices, printing employee details, and more.
 * </p>
 */
public class Manager extends Stuff implements Employee {
    private ArrayList<Integer> excellentCount = new ArrayList<>();
    private ArrayList<Integer> goodCount = new ArrayList<>();
    private ArrayList<Integer> badCount = new ArrayList<>();
    private ArrayList<Stuff> stuff = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Manager() {
    }

    /**
     * Constructs a Manager object with the specified list of employees.
     *
     * @param stuff The list of employees.
     */
    public Manager(ArrayList<Stuff> stuff) {
        this.stuff = stuff;
        for (int i = 0; i < stuff.size(); i++) {
            excellentCount.add(0);
            goodCount.add(0);
            badCount.add(0);
        }
    }

    /**
     * Constructs a Manager object with the specified list of employees and manager details.
     *
     * @param stuff         The list of employees.
     * @param name          The name of the manager.
     * @param address       The address of the manager.
     * @param contactNumber The contact number of the manager.
     */
    public Manager(ArrayList<Stuff> stuff, String name, String address, int contactNumber) {
        this.stuff = stuff;
        for (int i = 0; i < stuff.size(); i++) {
            excellentCount.add(0);
            goodCount.add(0);
            badCount.add(0);
        }
    }

    /**
     * Allows a customer to provide feedback about an employee.
     */
    public void customerFeedback() {
        System.out.println("Enter the ID of the employee");
        int stuffId = scanner.nextInt();
        System.out.println("Enter your feedbcak from the following : 5 (EXCELLENT) / 3 (GOOD) / 0 (BAD) :)");
        int feedback = scanner.nextInt();
        switch (feedback) {

            case 5:
                excellentCount.set(stuffId - 1, (excellentCount.get(stuffId - 1)) + 1);
                break;
            case 3:
                goodCount.set(stuffId - 1, (goodCount.get(stuffId - 1)) + 1);
                break;
            case 0:
                badCount.set(stuffId - 1, (badCount.get(stuffId - 1)) + 1);
                break;

        }
    }

    /**
     * Raises the salary of an employee based on their feedback count.
     *
     * @param stuffId The ID of the employee.
     */
    public void raiseSallary(int stuffId) {
        if (excellentCount.get(stuffId - 1) > 3) {
            int newSalary = (stuff.get(stuffId - 1).getSalary()) + 1000;
            stuff.get(stuffId - 1).setSalary(newSalary);
        } else if (badCount.get(stuffId - 1) > 3) {
            int newSalary = (stuff.get(stuffId - 1).getSalary()) - 1000;
            stuff.get(stuffId - 1).setSalary(newSalary);
        }
    }

    /**
     * Prints feedback counts for a specific employee.
     */
    public void printFeedback() {
        System.out.println("enter the StuffId : ");
        int stuffId = scanner.nextInt();
        System.out.println("Excellent Count : " + excellentCount.get(stuffId - 1));
        System.out.println("Good Count : " + goodCount.get(stuffId - 1));
        System.out.println("Bad Count : " + badCount.get(stuffId - 1));
    }

    /**
     * Calculates the profit based on the total salary of employees and total bill amount.
     *
     * @param bill The bill object representing the total bill amount.
     * @return The calculated profit.
     */
    public double profit(Bill bill) {
        double total_salary = 0;
        for (int i = 0; i < stuff.size(); i++) {
            total_salary += (stuff.get(i)).getSalary();
        }
        return (bill.get_Total_Price()) - total_salary;
    }

    /**
     * Adds a new employee to the list of employees.
     *
     * @param newemp The new employee to be added.
     */
    public void add_employee(Stuff newemp) {
        stuff.add(newemp);
    }

    /**
     * Removes an employee from the list of employees.
     *
     * @param ID The ID of the employee to be removed.
     */
    public void remove_employee(int ID) {
        stuff.remove(ID - 1);
    }
    /**
     * Changes the price of an item in the menu.
     *
     * @param menuitems      The list of menu items.
     * @param price_menuitems The list of corresponding prices for menu items.
     * @param item           The name of the item to change the price for.
     * @param new_price      The new price for the item.
     */
    public static void changePrice(ArrayList<String> menuitems, ArrayList<Double> price_menuitems, String item, double new_price) {
        Menu menu = new Menu();
        menu.changeprice(item, new_price);
    }

    /**
     * Prints details of all employees managed by the manager.
     */
    public void printEmplooys() {
        System.out.println("Your Stuff are: ");
        for (Stuff element : stuff) {
            System.out.println("name: " + element.getName());
            System.out.println("address: " + element.getAddress());
            System.out.println("contact number: " + element.getContactNumber());
            System.out.println("salary: " + element.getSalary());
            System.out.println("roles: " + element.getRoles());
            System.out.println("ID: " + element.getID());
            System.out.println("dayoffno: " + element.getDayoff());
            System.out.println("///////////////////////////////////////////////////////////");
        }
    }
    /**
     * Adds a bonus to the manager's salary.
     *
     * @param salary The base salary of the manager.
     */
    @Override
    public void addBonus(int salary) {
        this.setSalary(1000 + getSalary());
    }
    /**
     * Gets the working time of the manager.
     *
     * @return The working time of the manager.
     */
    @Override
    public int getWorkingTime() {
        return 12;
    }
}
