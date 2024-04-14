/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpart1;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Projectpart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person me = new Person("youssefsama", 11991);
       
       ////////////////////////
        System.out.println("\n"+"Alaa"+"\n");
       Resturant r=new Resturant("Zaqzuqa","2100482");
       r.setTablesNumber(5);
       Receptionist  s1 = new Receptionist (r.getTablesNumber());
       s1.reserve(10);
       s1.displaytab();
       s1.reserve(2); 
       s1.displaytab();
       s1.reserve(15);
       s1.displaytab();
       s1.reserve(3);
       s1.displaytab();
       System.out.println("after ");
       s1.removeReserve(4);
       s1.displaytab();
       s1.TableCanReserve();
         
         /////////////////////////////////////////////////////////
         ///////////////////////////////////////////////////////
         
         
         System.out.println("\n"+"Esraa"+"\n");
   
        ArrayList<String> menuList = new ArrayList<>();
        menuList.add("fish");
        menuList.add("meat");
        menuList.add("coffee");
 
        ArrayList<Double> priceList = new ArrayList<>();
        priceList.add(200.0);
        priceList.add(300.0);
        priceList.add(100.0);

        ArrayList<String> typeList = new ArrayList<>();
        typeList.add("dish");
        typeList.add("dish");
        typeList.add("drink");

        Menu item =new Menu(typeList,menuList,priceList);

        item.additem("dish","chicken",900);
        item.additem("dish", "pizza",150);
        item.additem("drink", "tea", 50);
        item.displayMenu();
        System.out.println("end");
   /////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////
         
    }
    
}
