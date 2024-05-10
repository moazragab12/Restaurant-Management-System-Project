package projectpart1;

import org.example.projectpart1.Menu;

public class Cheff extends Stuff implements Employee {
    private Menu menu;

    public Cheff(String name, String address, int contactNumber,int salary, String roles, int dayoff)
    {
        super(name, address, contactNumber, salary, roles, dayoff);
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

    @Override
    public void addBonus(int salary) {
        this.setSalary(750+getSalary());
    }

    @Override
    public int getWorkingTime() {
        return 10;
    }
}

