package projectpart1;

import java.util.ArrayList;
import java.util.Date;

public class Bill {
    static int bill_increamental = 1;
    static int billNo;
    private int customerId;
    private Double totalPrice;
    ArrayList<String> items;
    Date date;
    Status status;

    public Bill() {
        billNo = bill_increamental;
        bill_increamental++;
        set_status(Status.PENDING);
    }

    public Bill(int customerId, Date date,ArrayList<String> items) {
        this();
        this.customerId = customerId;
        this.date = date;
        this.items= items;

    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setTotalPrice(ArrayList<String> menu, ArrayList<Double> prices) {

        int ind;
        for (int i = 0; i < items.size(); i++) {
            ind = menu.indexOf(items.get(i));

            this.totalPrice += (double) prices.get(ind);
        }
    }

    public Double get_Total_Price() {
        return totalPrice;
    }

    public void print_bill(int billNo, int customerId, Double totalPrice, Date date, Status status) {
        System.out.println("Bill No: " + billNo + "Customer ID: " + customerId + "Total Price: " + totalPrice + "Date: " + date
                + "Status: " + status);
    }

    public void pay(int billNo) {
        System.out.println("Bill No: " + billNo + " is paid successfully.");
        set_status(Status.PAID);
    }

    public void set_customerId(int customerId) {
        this.customerId = customerId;
    }

    public void set_date(Date date) {
        this.date = date;
    }

    public void set_status(Status status) {
        this.status = status;
    }

    public int get_billNo() {
        return billNo;
    }

    public int get_customerId() {
        return customerId;
    }

    public Date get_date() {
        return date;
    }

    public Status get_status() {
        return status;
    }

}
