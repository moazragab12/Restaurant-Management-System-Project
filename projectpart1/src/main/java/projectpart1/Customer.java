
package projectpart1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Represents a customer in the restaurant.
 * <p>
 * This class provides methods for the customer to interact with the restaurant staff,
 * such as placing orders, modifying orders, canceling orders, paying bills, making reservations,
 * giving feedback, and canceling reservations.
 * </p>
 */
public class Customer {
    private static int idCounter = 1;
    private int id;
    private String name;
    private Scanner scanner;
    /**
     * Constructs a Customer object with the specified name.
     *
     * @param name The name of the customer.
     */
    public Customer(String name) {
        this.id = idCounter++;
        this.name = name;
        this.scanner = new Scanner(System.in);
    }
    /**
     * Cancels a reservation made by the customer.
     *
     * @param receptionist The receptionist handling reservations.
     */
    public void cancelRes(Receptionist receptionist)
    {
        System.out.println("Enter your table number: ");
        int tableNo = scanner.nextInt();
        receptionist.removeReserve(tableNo);
    }
    /**
     * Places an order with the waiter.
     *
     * @param waiter The waiter taking the order.
     */
    public void placeOrder(Waiter waiter) {
        waiter.make_order();
    }
    /**
     * Modifies an existing order with the waiter.
     *
     * @param waiter The waiter handling the order.
     */
    public void modifyOrder(Waiter waiter) {
        waiter.modify_order();
    }
    /**
     * Cancels an existing order with the waiter.
     *
     * @param waiter The waiter handling the order.
     */
    public void cancelOrder(Waiter waiter) {
        waiter.cancel_order();
    }

    /**
     * Pays the bill to the waiter.
     *
     * @param waiter The waiter presenting the bill.
     */
    public void payBill (Waiter waiter) {
        waiter.payBill();
    }
    /**
     * Makes a reservation with the receptionist.
     *
     * @param receptionist The receptionist handling reservations.
     */
    public void makeReservation(Receptionist receptionist) {
        System.out.println("Enter the number of people for the reservation:");
        int numOfPeople = scanner.nextInt();
        if(receptionist.reserve(numOfPeople)>0);
    }
    /**
     * Gives feedback to the manager.
     *
     * @param manager The manager receiving the feedback.
     */
    public void giveFeedback(Manager manager) {
        manager.customerFeedback();
    }

    /**
     * Gets the ID of the customer.
     *
     * @return The ID of the customer.
     */
    public int getId() {
        return id;
    }
    /**
     * Gets the name of the customer.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

   /* public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }*/
}
