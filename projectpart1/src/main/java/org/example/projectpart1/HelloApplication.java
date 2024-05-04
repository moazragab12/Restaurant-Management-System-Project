package org.example.projectpart1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import projectpart1.Menu;

import java.util.ArrayList;

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

        launch();
        System.out.println("EOF");
    }
}