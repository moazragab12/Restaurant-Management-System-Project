package projectpart1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 * @author Moaz
 */
enum Type {
    DELIVERY, TAKEAWAY, DINEIN
}

enum Status {PENDING, DELIVERED, DONE, PAID}

/**
 * Represents an order made by a customer in a restaurant.
 */
//public class Order implements Comparable<Order> {
public class Order {
    /**
     * The number of the table where the order is placed.
     */
    private int tableNo;


    /**
     * The unique identifier of the order.
     */
    private int orderId;

    /**
     * The last order number generated.
     */
    static int orderLastNo = 1;

    /**
     * The bill associated with the order.
     */
    Bill bill;

    /**
     * The list of items ordered.
     */
    ArrayList<String> orderedItems;

    /**
     * The status of the order.
     */
    Status status;

    /**
     * Constructs an order with a pending status and assigns it a unique order ID.
     */
    public Order() {
        orderId = orderLastNo++;
        status = Status.PENDING;
    }

    /**
     * Constructs an order with the specified items and table number.
     *
     * @param orderedItems The list of items ordered.
     * @param tableNo      The number of the table where the order is placed.
     */
    public Order(ArrayList<String> orderedItems, int tableNo) {
        this();
        this.orderedItems = orderedItems;
        this.tableNo = tableNo;
    }

    /**
     * Constructs an order with the specified items, bill, and table number.
     *
     * @param orderedItems The list of items ordered.
     * @param bill         The bill associated with the order.
     * @param tableNo      The number of the table where the order is placed.
     */
    public Order(ArrayList<String> orderedItems, Bill bill, int tableNo) {
        this(orderedItems, tableNo);
        this.bill = bill;
    }

    /**
     * Gets the last order number generated.
     *
     * @return The last order number generated.
     */
    public static int getOrderlastNo() {
        return orderLastNo;
    }

    /**
     * Gets the Table number.
     *
     * @return The Table number of the order.
     */

    public int getTableNo() {
        return tableNo;
    }

    /**
     * Adds an item to the order.
     *
     * @param item The item to be added.
     */
    public void add_item(String item) {
        orderedItems.add(item);
    }

    /**
     * Removes an item from the order.
     *
     * @param item The item to be removed.
     */
    public void remove_item(String item) {
        orderedItems.remove(item);
    }

    /**
     * Creates a bill for the order.
     *
     * @param customerId   The ID of the customer associated with the bill.
     * @param date         The date of the bill creation.
     * @param orderedItems The list of items included in the bill.
     */
    public void create_bill(int customerId, Date date, ArrayList<String> orderedItems) {
        bill = new Bill(customerId, date, orderedItems);
    }

    /**
     * Gets the bill associated with the order.
     *
     * @return The bill associated with the order.
     */
    public Bill getBill() {
        return bill;
    }

    /**
     * Gets the status of the order.
     *
     * @return The status of the order.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the order.
     *
     * @param status The status to be set.
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Compares this order with the specified order based on their IDs.
     * @param o The order to be compared.
     * @return 0 if the orders have the same ID, 1 if this order's ID is greater, -1 otherwise.
     */
//    @Override
//    public int compareTo(Order o) {
//        if(this.orderId == o.orderId)
//            return 0;
//        else if(this.orderId < o.orderId)
//            return 1;
//        else
//            return -1;
//    }
}
