
package projectpart1;
import org.example.projectpart1.Bill;
import org.example.projectpart1.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Stuff implements Employee {
    private  ArrayList<Integer> excellentCount = new ArrayList<>();
    private  ArrayList<Integer> goodCount = new ArrayList<>();
    private  ArrayList<Integer> badCount = new ArrayList<>();
    private ArrayList<Stuff> stuff = new ArrayList<>();
    Scanner scanner = new Scanner (System.in);

    public Manager() {}
    public Manager(ArrayList<Stuff> stuff)
    {
        this.stuff=stuff;
        for(int i=0;i<stuff.size();i++)
        {
            excellentCount.add(0);
            goodCount.add(0);
            badCount.add(0);
        }
    }
    public void customerFeedback ()
    {
        System.out.println("Enter the ID of the employee");
        int stuffId = scanner.nextInt();
        System.out.println("Enter your feedbcak from the following : 5 (EXCELLENT) / 3 (GOOD) / 0 (BAD) :)");
        int feedback = scanner.nextInt();
        switch(feedback)
        {

            case 5:
                excellentCount.set(stuffId-1,(excellentCount.get(stuffId-1))+1);
                break;
            case 3:
                goodCount.set(stuffId-1,(goodCount.get(stuffId-1))+1);
                break;
            case 0:
                badCount.set(stuffId-1,(badCount.get(stuffId-1))+1);
                break;

        }
    }

    public void raiseSallary (int stuffId)
    {
        if (excellentCount.get(stuffId-1)>3)
        {
            int newSalary= (stuff.get(stuffId-1).getSalary()) + 1000;
            stuff.get(stuffId-1).setSalary(newSalary);
        }
        else if (badCount.get(stuffId-1)>3)
        {
            int newSalary= (stuff.get(stuffId-1).getSalary()) - 1000;
            stuff.get(stuffId-1).setSalary(newSalary);
        }
    }
    public void printFeedback()
    {
        System.out.println("enter the StuffId : ");
        int stuffId=scanner.nextInt();
        System.out.println("Excellent Count : "+excellentCount.get(stuffId-1));
        System.out.println("Good Count : "+goodCount.get(stuffId-1));
        System.out.println("Bad Count : "+badCount.get(stuffId-1));
    }
    public double profit(Bill bill)
    {
        double total_salary=0;
        for (int i=0;i<stuff.size();i++)
        {
            total_salary+=(stuff.get(i)).getSalary();
        }
        return (bill.get_Total_Price())-total_salary;
    }

    public void add_employee(Stuff newemp)
    {
        stuff.add(newemp);
    }

    public void remove_employee(int ID)
    {
        stuff.remove(ID-1);
    }

    public static void  changePrice (ArrayList<String> menuitems, ArrayList<Double> price_menuitems, String item, double new_price)
    { Menu menu = new Menu();
        menu.changeprice( item, new_price);
    }

    @Override
    public void addBonus(int salary) {
        this.setSalary(1000+getSalary());
    }

    @Override
    public int getWorkingTime() {
        return 12;
    }
}
