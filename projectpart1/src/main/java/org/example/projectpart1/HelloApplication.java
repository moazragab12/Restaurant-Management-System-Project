package org.example.projectpart1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import projectpart1.*;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.example.projectpart1.ManagerGui.y;
import static org.example.projectpart1.Menu.priceMenuItems;

public class HelloApplication extends Application {
   public static Menu Mainmenu ;
    @Override
    public void start(Stage stage) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/org/example/projectpart1/imgs/restauranticon.jpg")));
            stage.setTitle("ZAQZOUQA RESTAURANT & Cafe");


            stage.show();


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Start of file");

        /******************TEST PROGRAM ******************************************/


       Items []item = new Items[2];
       item[0] = new Menu();
      item[1] = new Drink(60.0,"V7");
        priceMenuItems.add(33.33);
       priceMenuItems.add(5.33);
      priceMenuItems.add(20.5);
       priceMenuItems.add(284.5);
       priceMenuItems.add(33.33);

       item[0].getHeighestPrice((Menu)item[0]);
       Arrays.sort(item);
     for(int i=0;i<2;i++)
      {
        System.out.println(item[i].getprice());

      }


        /*
         we will show some features of the program by creating some objects and calling some methods
          Showing  Polymorphism by creating objects of the parent class and the child class
          Showing  Inheritance by creating objects of the parent class and the child class
          Showing  Encapsulation by creating private variables and using setter and getter methods
          Showing  Abstraction by creating abstract methods and classes
          Showing  Interface by implementing an interface to  reduce reduntant code
          Showing  Exception Handling by using try and catch blocks
         */








/********************GUI INFO ******************************************/
//       Menu menu = new Menu();
//     ArrayList<String> type_menuitems = new ArrayList<>();
//     ArrayList<String> menuitems = new ArrayList<>();
//     ArrayList<Double> price_menuitems = new ArrayList<>();
//     type_menuitems.add("Syrianmeal");
//     type_menuitems.add("Koreanmeal");
//     type_menuitems.add("Egyptianmeal");
//     type_menuitems.add("Americanmeal");
//     type_menuitems.add("Japanesemeal");
//     menuitems.add("Shawarma");
//     menuitems.add("Tahini");
//     menuitems.add("Koshari");
//     menuitems.add("Burger");
//     menuitems.add("Sushi");
//     price_menuitems.add(33.33);
//     price_menuitems.add(5.33);
//     price_menuitems.add(20.5);
//     price_menuitems.add(33.33);
//     price_menuitems.add(43.5);
//     menu.setType_menuitems(type_menuitems);
//     menu.setPrice_menuitems(price_menuitems);
//     menu.setMenuitems(menuitems);
  /****************************Start of GUI ******************************************/
        launch();
        try{
            if(!"null".equals(y[4]) ){
                Mainmenu.search(y[4]); }
            else{
                System.out.println("Do not search .");
            }

            if(!"null".equals(y[0]) && !"null".equals(y[1])&& !"null".equals(y[2]))
            {Mainmenu.additem(y[0], y[1],Double.parseDouble(y[2]));
                //  menu.displayMenu();
            }
            else{
                System.out.println("Do not add any item.");
            }
            if(!"null".equals(y[3]) ){
                Mainmenu.removeitem(y[3]);
                //   menu.displayMenu();
            }else{
                System.out.println("Do not remove any item.");
            }
            if(!"null".equals(y[5]) && !"null".equals(y[6]) )
            { Mainmenu.changeprice(y[5],Double.parseDouble(y[6]));
                //  menu.displayMenu();
            }
            else{
                System.out.println("Do not change price.");
            }

            Mainmenu.displayMenu();


        }
        catch(NumberFormatException ex){
            System.out.println("Finish");}
        catch(Exception ex){
            System.out.println("Finish");
        }
        System.out.println("EOF");

       
       	          ///////////////////////////////////////////////////////////////////
     //                              testing mannager                               //
     Cheff cheff = new Cheff("Adel","cairo",1552648,7000,"Chef",2);
     Receptionist receptionist = new Receptionist("Hany","Cairo", 1235255,7000, "recieptionist", 2,10);
       ArrayList <Stuff> stuff= new ArrayList<>();
       Waiter waiter1 = new Waiter("Ahmed", "cairo", 55864256 ,5000, "Waiter" ,2);
       Waiter waiter2 = new Waiter("mohamed","cairo",123,5000,"waiter",2);
       Waiter waiter3 = new Waiter("ali","cairo",112,5000,"waiter",2);
       Waiter waiter4 = new Waiter("hany","cairo",133,5000,"waiter",2);
       
       stuff.add(waiter1);
       stuff.add(waiter2);
       stuff.add(waiter3);
       stuff.add(waiter4);
       stuff.add(receptionist);
       stuff.add(cheff);
       
       Manager manager = new Manager(stuff,"Ahmed adel","Cairo",225648);
       
       manager.add_employee(new Stuff("Hoda","cairo",555,5000,"waiter",2));
       manager.printEmplooys();
       manager.remove_employee(4);//hany will be removed
       manager.printEmplooys();
       manager.changePrice(menuitems, price_menuitems,"Koshari",50);
        ////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////testing cheff class///////////////////////////
       cheff.additem("Egyptianmeal", "kofta", 90.0);
       menu.displayMenu();
       manager.changePrice(menuitems, price_menuitems,"Koshari",20.5);
       cheff.removeitem("kofta");//removing all the changes
       menu.displayMenu();
       ////////////////////////////////////////////////////////////////////////////////////
       //////////////////////////////////testing costumer class///////////////////////////
       
       
       
       Customer custom1= new Customer("Ali");// table 1 is occupied 
       Customer custom2= new Customer("Ahmed");// table 3 is occ
       Customer custom3= new Customer("Ahmed");// table 5 to be reserved 
       
       System.out.println("first Customer's name is : "+ custom1.getName());
       System.out.println("first Customer's id is : "+ custom1.getId());
       
       System.out.println("----------------------------------------------------------------------------");
       System.out.println("----------------------------------------------------------------------------");

       System.out.println("second Customer's name is : "+ custom2.getName());
       System.out.println("second Customer's id is : "+ custom2.getId());
       
       System.out.println("----------------------------------------------------------------------------");
       System.out.println("----------------------------------------------------------------------------");

       //////////////////////////////reservation ////////////////////////////////
       custom1.makeReservation(receptionist); 
       receptionist.displaytab();
       System.out.println("----------------------------------------------------------------------------");
       custom1.placeOrder(waiter1);
       System.out.println("----------------------------------------------------------------------------");
       custom1.payBill(waiter1);
       System.out.println("----------------------------------------------------------------------------");
       custom1.giveFeedback(manager);
       System.out.println("----------------------------------------------------------------------------");
       custom2.makeReservation(receptionist);
       System.out.println("----------------------------------------------------------------------------");
       custom2.placeOrder(waiter1);
       System.out.println("----------------------------------------------------------------------------");
       custom2.payBill(waiter1);
       System.out.println("----------------------------------------------------------------------------");
       manager.printFeedback();
       System.out.println("----------------------------------------------------------------------------");
       cheff.viewOrders();
       custom1.cancelRes(receptionist);
       receptionist.displaytab();

    }
   
}
