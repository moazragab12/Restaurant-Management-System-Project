package projectpart1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

enum Type {
    DELIVERY, TAKEAWAY, DINEIN
}

enum Status {PENDING, DELIVERED, DONE, PAID}


public class Order implements Comparable<Order> {
    private int orderId;
    static int orderLastNo = 1;
    Bill bill;
    ArrayList<String> orderedItems;
    Status status;


    public Order() {
        orderId = orderLastNo++;
        status = Status.PENDING;
    }

    public Order(ArrayList<String> orderedItems) {
        this();
        this.orderedItems = orderedItems;

    }
    public Order(ArrayList<String> orderedItems,Bill bill) {
       this(orderedItems);
         this.bill = bill;

    }

    public static int getOrderlastNo() {
        return orderLastNo;
    }

    public void add_item(String item) {
        orderedItems.add(item);
    }

    public void remove_item(String item) {
        orderedItems.remove(item);
    }

    public void create_bill(int customerId, Date date, ArrayList<String> orderedItems) {
        bill = new Bill(customerId, date, orderedItems);
    }
    public Bill getBill() {
        return bill;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int compareTo(Order o) {
        if(this.orderId == o.orderId)
            return 0;
        else if(this.orderId < o.orderId)
            return 1;
        else
            return -1;
    }
}
