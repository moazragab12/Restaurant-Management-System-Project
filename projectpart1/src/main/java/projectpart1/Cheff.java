package projectpart1;

import org.example.projectpart1.Menu;

public class Cheff extends Person {
    private Menu menu;

    public Cheff(String name, String address, int contactNumber)
    {
        super(name, address, contactNumber);
        this.menu=new Menu();
    }

    public void additem(String type,String item,double price)
    {
        menu.additem(type,item,price);
    }

    public void removeitem(String item)
    {
        menu.removeitem(item);
    }

    public void viewOrders ()
    {
        Waiter.view_all_orders();
    }
}

