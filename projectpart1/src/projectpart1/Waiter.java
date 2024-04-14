package projectpart1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Waiter extends Stuff {
    private ArrayList<Order> orders;
    Scanner in = new Scanner(System.in);

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
        Order order = new Order(items, n);
        orders.add(order);
    }

    /**
     * This method is used to modify the order by adding or removing items from the order list
     * It asks the user to enter the order number they want to modify
     * Then it asks the user to enter the number of items they want to add
     * Then it asks the user to enter the items they want to add
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
        orders.get(n).orderedItems.addAll(items);
        System.out.println("Enter the number of items you want to remove");
        m = in.nextInt();
        items = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the item you want to remove");
            items.add(in.next());
        }
        orders.get(n).orderedItems.removeAll(items);
    }

    public void cancel_order() {
        System.out.println("Enter the order number you want to cancel");
        int n = in.nextInt();
        orders.remove(n);

    }

    public void addbill() {
        System.out.println("Enter the order number you want to add bill to and its cutomer id");
        int n = in.nextInt();
        int m = in.nextInt();
        Date date = new Date();
        orders.get(n).create_bill(m, date, orders.get(n).orderedItems);
    }

    public void deletebill() {
        System.out.println("Enter the order number you want to delete bill from");
        int n = in.nextInt();
        orders.get(n).bill = null;
    }

}
