package projectpart1;

import org.example.projectpart1.Order;
import org.example.projectpart1.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 * @author Moaz
 */

/**
 * Represents a waiter in a restaurant, inheriting from the Stuff class.
 * <p>
 * This class provides methods for managing orders, including creating, modifying, and canceling orders,
 * as well as adding bills to orders and viewing all orders.
 * </p>
 * <p>
 * It also contains static methods to access and manage orders from all waiters.
 * </p>
 */
public class Waiter extends Stuff implements Employee {


    /**
     * The list of orders managed by the whole waiters.
     */
    private static ArrayList<Order> All_orders = new ArrayList<Order>();

    /**
     * The list of orders managed by  single waiter.
     */
    private ArrayList<Order> orders;

    /**
     * Scanner object for user input.
     */
    Scanner in = new Scanner(System.in);

    public Waiter() {
        orders = new ArrayList<Order>();
    }

    public Waiter(String name, String address, int contactNumber, int salary, String roles, int dayoff) {
        super(name, address, contactNumber, salary, roles, dayoff);
        orders = new ArrayList<Order>();
    }

    public static ArrayList<Order> getAll_orders() {
        return All_orders;
    }

    /**
     * Allows the waiter to create a new order.
     */
    public void make_order() {
        System.out.println("Enter the number of items you want to order");
        int n = in.nextInt();
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the item you want to order");
            items.add(in.next());
        }
        System.out.println("Enter table number");
        n = in.nextInt();
        Order order = new Order(items, n, OrderStatus.IN_PROGRESS);
        orders.add(order);
        All_orders.add(order);
    }

    /**
     * Allows the waiter to modify an existing order by adding or removing items.
     */
    public void modify_order() {
        System.out.println("Enter the order number you want to modify");
        int n = in.nextInt();
        System.out.println("Enter the number of items you want to add");
        int m = in.nextInt();
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the item you want to add");
            items.add(in.next());
        }
        ArrayList<String> OrderedItems = orders.get(n).getOrderedItems();
        OrderedItems.addAll(items);
        System.out.println("Enter the number of items you want to remove");
        m = in.nextInt();
        items = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the item you want to remove");
            items.add(in.next());
        }
        OrderedItems = orders.get(n).getOrderedItems();
        OrderedItems.removeAll(items);
    }

    /**
     * Allows the waiter to cancel an existing order.
     */
    public void cancel_order() {
        System.out.println("Enter the order number you want to cancel");
        int n = in.nextInt();
        orders.remove(n);
        All_orders.remove(n);
    }

    /**
     * Allows  to view all orders from all waiters together
     */

    static void view_all_orders() {
        for (int i = 0; i < All_orders.size(); i++) {
            System.out.println("Order number: " + i);
            System.out.println("Table number: " + All_orders.get(i).getTableNo());
            System.out.println("Ordered items: ");
            ArrayList<String> temporder = All_orders.get(i).getOrderedItems();

            for (int j = 0; j < temporder.size(); j++) {
                System.out.println(temporder.get(j));
            }
            if (All_orders.get(i).getBill() != null) {
                System.out.println("Bill number: " + All_orders.get(i).getBill().get_billNo());
                System.out.println("Customer ID: " + All_orders.get(i).getBill().get_customerId());
                System.out.println("Total price: " + All_orders.get(i).getBill().get_Total_Price());
                System.out.println("Date: " + All_orders.get(i).getBill().getDate());
                System.out.println("Status: " + All_orders.get(i).getBill().get_status());
            }
        }
    }

    /**
     * Allows the waiter to add a bill to an existing order.
     */
    public void payBill() {
        System.out.println("Enter the order number you want to add bill to and its customer id");
        int n = in.nextInt();
        int m = in.nextInt();
        Date date = new Date();
        orders.get(n - 1).create_bill(m, date, orders.get(n - 1).getOrderedItems());
    }

    /**
     * Allows the waiter to delete a bill from an existing order.
     */
    public void deletebill() {
        System.out.println("Enter the order number you want to delete bill from");
        int n = in.nextInt();
        orders.get(n).setBill(null);
    }

    /**
     * Adds a bonus to the salary of the employee.
     *
     * @param salary The current salary of the employee to which the bonus will be added.
     *
     */
    @Override
    public void addBonus(int salary) {
        this.setSalary(500 + getSalary());
    }

    /**
     * Retrieves the working time of the employee.
     *
     * @return The number of hours the employee works per day.
     */
    @Override
    public int getWorkingTime() {
        return 8;
    }
}