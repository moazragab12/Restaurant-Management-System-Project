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
        menuList.add("chicken");
        menuList.add("coffee");
        menuList.add("tea");
    
         
        ArrayList<Double> priceList = new ArrayList<>();
        priceList.add(400.0);
        priceList.add(700.0);
        priceList.add(300.0);
        priceList.add(100.0);
        priceList.add(50.0);
       
        
        ArrayList<String> typeList = new ArrayList<>();
        typeList.add("dish");
        typeList.add("dish");
        typeList.add("dish");
        typeList.add("drink");
        typeList.add("drink");

        Menu item =new Menu(typeList,menuList,priceList);
         
        
        //test function add
          item.additem("dish", "pizza",150);
          item.additem("drink", "tea", 50);
          item.additem("dessert", "cakes", 350);
        
        // test function search
          item.displayMenu();
          item.search("tea");
          item.search("k");
   
          
          
   /*........................Exception_Handling....................*/       
          
//    boolean check =true;
//    Scanner scanner= new Scanner (System.in);
//    System.out.println("Enter type of new item in menu");
//    String type=scanner.next();
//    System.out.println("Enter name of new item in menu");
//    String Name=scanner.next();
//    
//     do{
//    try{
//    System.out.println("Enter Number");
//    float price= scanner.nextFloat();
//    //System.out.println(price);
//    item.additem(type, Name,price);
//    check=false;
//    }
//    catch(java.util.InputMismatchException ex){
//    System.out.println("Incorrect , Try again ");
//    scanner.nextLine();
//    
//    } }while(check);
//          
//          
//      item.displayMenu();  
/*........................end..................*/
  


   // test sort function
        item.displayMenu();
        System.out.println("\n");
        item.Sortprice(item);

    }
    }