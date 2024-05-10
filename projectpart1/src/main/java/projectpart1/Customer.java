
package projectpart1;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private static int idCounter = 1;
    private int id;
    private String name;
    private Scanner scanner;

    public Customer(String name) {
        this.id = idCounter++;
        this.name = name;
        this.scanner = new Scanner(System.in);
    }

    public void cancelRes(Receptionist receptionist)
    {
        System.out.println("Enter your table number: ");
        int tableNo = scanner.nextInt();
        receptionist.removeReserve(tableNo);
    }
    public void placeOrder(Waiter waiter) {
        waiter.make_order();
    }

    public void modifyOrder(Waiter waiter) {
        waiter.modify_order();
    }

    public void cancelOrder(Waiter waiter) {
        waiter.cancel_order();
    }


    public void payBill (Waiter waiter) {
        waiter.payBill();
    }

    public void makeReservation(Receptionist receptionist) {
        System.out.println("Enter the number of people for the reservation:");
        int numOfPeople = scanner.nextInt();
        if(receptionist.reserve(numOfPeople)>0);
    }

    public void giveFeedback(Manager manager) {
        manager.customerFeedback();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

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
