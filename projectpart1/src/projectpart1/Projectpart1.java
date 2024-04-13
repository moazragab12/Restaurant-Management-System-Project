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
     Receptionist  s1 = new Receptionist ();
     
      System.out.println(s1.getID());
      s1.reserve(1);
        s1.reserve(5);
         s1.change_status(1);
         s1.reserve(5);
         
         /////////////////////////////////////////////////////////
         ///////////////////////////////////////////////////////
         
         
         System.out.println("\n"+"Esraa"+"\n");
         
         //     Menu item =new Menu();
      
//      item.additem("fish");
//      item.additem("meat");
//      item.additem("chicken");
//      
//      System.out.println( item.getMenuitems());
      
//      item.removeitem("meat");
//      System.out.println("After removing 'meat': " +item.getMenuitems()); 
//        
       ArrayList<String> menuList = new ArrayList<>();
        menuList.add("fish");
        menuList.add("meat");
        menuList.add("coffee");
//        item.setMenuitems(menuList);
//         System.out.println( item.getMenuitems());
         
         
         ArrayList<Double> priceList = new ArrayList<>();
        priceList.add(200.0);
        priceList.add(300.0);
        priceList.add(100.0);

 
//        item.setPrice_menuitems(priceList);
//         System.out.println( item.getPrice_menuitems());
        //changeprice("fish",200000);
        // item.displayMenu();
         
         ArrayList<String> typeList = new ArrayList<>();
        typeList.add("dish");
        typeList.add("dish");
        typeList.add("drink");
//        item.setType_menuitems(typeList);
         Menu item =new Menu(typeList,menuList,priceList);
//         System.out.println( item.getType_menuitems());
        // item.displayMenu();
         item.changeprice("meat", 500);
        //  item.displayMenu();
          item.removeitem("fish");
        //  item.displayMenu();
          item.additem("dish","chicken",900);
       //  item.displayMenu();
          item.additem("dish", "pizza",150);
          item.additem("drink", "tea", 50);
    item.displayMenu();
          
    
    
    System.out.println("end");
   /////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////
         
    }
    
}
