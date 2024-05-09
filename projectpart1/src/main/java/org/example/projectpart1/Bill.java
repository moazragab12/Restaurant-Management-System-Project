package org.example.projectpart1;

import org.example.projectpart1.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Moaz
 */

/**
 * Represents a bill associated with an order in a restaurant.
 */
public class Bill {

    /** The incremental number assigned to each bill. */
    static int billIncremental = 1;

    /** The unique identifier of the bill. */
    static int billNo;

    /** The ID of the customer associated with the bill. */
    private int customerId;

    /** The total price of the items included in the bill. */
    private Double totalPrice;

    /** The list of items included in the bill. */
    ArrayList<String> items;

    public Date getDate() {
        return date;
    }

    /** The date of the bill creation. */
    Date date;

    /** The status of the bill. */
    OrderStatus status;

    /**
     * Constructs a bill with a pending status and assigns it a unique bill ID.
     */
    public Bill() {
        billNo = billIncremental;
        billIncremental++;
        set_status(OrderStatus.IN_PROGRESS);
    }

    /**
     * Constructs a bill with the specified customer ID, date, and items.
     * @param customerId The ID of the customer associated with the bill.
     * @param date The date of the bill creation.
     * @param items The list of items included in the bill.
     */
    public Bill(int customerId, Date date, ArrayList<String> items) {
        this();
        this.customerId = customerId;
        this.date = date;
        this.items = items;
    }

    /**
     * Sets the customer ID associated with the bill.
     * @param customerId The customer ID to be set.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Sets the total price of the bill based on the provided menu and prices.
     * @param menu The menu containing item names.
     * @param prices The prices corresponding to the items in the menu.
     */
    public void setTotalPrice(ArrayList<String> menu, ArrayList<Double> prices) {
        int ind;
        for (int i = 0; i < items.size(); i++) {
            ind = menu.indexOf(items.get(i));
            this.totalPrice += prices.get(ind);
        }
    }

    /**
     * Gets the total price of the bill.
     * @return The total price of the bill.
     */
    public Double get_Total_Price() {
        return totalPrice;
    }

    /**
     * Prints the details of the bill.
     * @param billNo The bill number.
     * @param customerId The customer ID associated with the bill.
     * @param totalPrice The total price of the bill.
     * @param date The date of the bill creation.
     * @param status The status of the bill.
     */
    public void print_bill(int billNo, int customerId, Double totalPrice, Date date, OrderStatus status) {
        pay(billNo);
        System.out.println( "Customer ID: " + customerId + " Total Price: " + totalPrice + " Date: " + date
                + " Status: " + status);
        System.out.println("Bill No: " + billNo + " is paid successfully.");
    }

    /**
     * Marks the bill as paid.
     * @param billNo The bill number.
     */
    public void pay(int billNo) {
        System.out.println("Bill No: " + billNo + " is paid successfully.");
        set_status(OrderStatus.COMPLETED);
    }

    /**
     * Sets the customer ID associated with the bill.
     * @param customerId The customer ID to be set.
     */
    public void set_customerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Sets the date of the bill.
     * @param date The date to be set.
     */
    public void set_date(Date date) {
        this.date = date;
    }

    /**
     * Sets the status of the bill.
     * @param status The status to be set.
     */
    public void set_status(OrderStatus status) {
        this.status = status;
    }

    /**
     * Gets the bill number.
     * @return The bill number.
     */
    public int get_billNo() {
        return billNo;
    }

    /**
     * Gets the customer ID associated with the bill.
     * @return The customer ID.
     */
    public int get_customerId() {
        return customerId;
    }

    /**
     * Gets the date of the bill creation.
     * @return The date of the bill creation.
     */
    public Date get_date() {
        return date;
    }

    /**
     * Gets the status of the bill.
     * @return The status of the bill.
     */
    public OrderStatus get_status() {
        return status;
    }
}