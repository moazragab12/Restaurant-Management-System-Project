package org.example.projectpart1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


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
       item[1] = new Chair();
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
        ArrayList<String> type_menuitems = new ArrayList<>();
        ArrayList<String> menuitems = new ArrayList<>();
        ArrayList<Double> price_menuitems = new ArrayList<>();
        type_menuitems.add("Syrianmeal");
        type_menuitems.add("Koreanmeal");
        type_menuitems.add("Egyptianmeal");
        type_menuitems.add("Americanmeal");
        type_menuitems.add("Japanesemeal");
        menuitems.add("Shawarma");
        menuitems.add("Tahini");
        menuitems.add("Koshari");
        menuitems.add("Burger");
        menuitems.add("Sushi");
        price_menuitems.add(33.33);
        price_menuitems.add(5.33);
        price_menuitems.add(20.5);
        price_menuitems.add(33.33);
        price_menuitems.add(43.5);
        Mainmenu=new Menu(type_menuitems,menuitems,price_menuitems);
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
    }
}