package org.example.projectpart1;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Application;
import static javafx.application.Application.launch;
import static org.example.projectpart1.HelloApplication.Mainmenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */




public class ManagerGui implements Initializable {



    public static String[] y = new String[7];



    //y[]="null";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

        for (int i = 0; i < y.length; i++) {
            y[i]="null"; // Prints "null"
        }
        
         Menu menu =Mainmenu;



        GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        //  pane.setStyle("-fx-border-color: black;-fx-background-color:  Burlywood;");
        Text text = new Text(50, 70, "Welcome to Zaqouqa");
        text.setFill(Color.BLACK);
        text.setFont(Font.font("Courier", FontWeight.BOLD,  FontPosture.ITALIC, 25));
        text.setOnMouseDragged(e -> {
            text.setX(e.getX());
            text.setY(e.getY());});
        TextField type = new TextField();
        TextField item = new TextField();
        TextField price = new TextField();
        TextField remove_item = new TextField();
        TextField Search_item = new TextField();
        TextField Change_price = new TextField();
        TextField item_Change_price = new TextField();

        // Place nodes in the pane
        pane.add(new Label("Search:"), 2, 3);
        pane.add(new Label("Add type:"), 2, 5);
        pane.add(new Label("Add item:"), 2, 6);
        pane.add(new Label("Add price:"), 2, 7);
        pane.add(new Label("Remove item:"), 2, 8);
        pane.add(new Label("item with change price"), 2, 9);
        pane.add(new Label("New item price"), 2, 10);
        pane.add(Search_item, 4, 3);
        pane.add(type, 4, 5);
        pane.add(item, 4, 6);
        pane.add(price, 4, 7);
        pane.add(remove_item, 4, 8);
        pane.add(item_Change_price, 4, 9);
        pane.add(Change_price, 4, 10);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(6.5);
        pane.setVgap(6.5);

        Button btNew = new Button("Add New Item");
        Button btrem = new Button("Remove Item");
        Button btsea = new Button("Search Item");
        Button btcha = new Button("Change Price");

        btcha.setOnAction((ActionEvent e) -> {
            System.out.println(Change_price.getText());
            y[5]= item_Change_price.getText();
            y[6]= Change_price.getText();
        });

        btNew.setOnAction((ActionEvent e) -> {
            System.out.println("type add : "+type.getText()+" item add : "+item.getText()+" price ; "+Double.valueOf(price.getText()));
            //menu.additem(type.getText(),item.getText(),Double.parseDouble(price.getText()) );
            y[0]= type.getText();
            y[1]= item.getText();
            y[2]= price.getText();
        });

        btrem.setOnAction((ActionEvent e) -> {
            System.out.println("item remove: "+remove_item.getText());
            y[3]= remove_item.getText();
        });


        btsea.setOnAction((ActionEvent e) -> {
            System.out.println("Search : "+Search_item.getText());
            //menu.additem(type.getText(),item.getText(),Double.parseDouble(price.getText()));
            y[4]= Search_item.getText();
        });
        btNew.setStyle("-fx-border-color: black;-fx-background-color:  Burlywood;");
        btrem.setStyle("-fx-border-color: black;-fx-background-color:  Burlywood;");
        btsea.setStyle("-fx-border-color: black;-fx-background-color:  Burlywood;");
        btcha.setStyle("-fx-border-color: black;-fx-background-color:  Burlywood;");
        pane.setStyle("-fx-border-color: black;-fx-background-color:   LIGHTYELLOW;");
        pane.add(text ,4,0 );
        pane.add(btNew,5, 7);
        pane.add(btrem,5, 8);
        pane.add(btsea,5, 3);
        pane.add(btcha,5, 10);
        Scene scene = new Scene(pane, 700, 600);
        Stage primaryStage = new Stage(); // Create a stage
        primaryStage.setTitle("Zaqouqa"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        try{
            if(!"null".equals(y[4]) ){
                menu.search(y[4]); }
            else{
                System.out.println("Do not search .");
            }

            if(!"null".equals(y[0]) && !"null".equals(y[1])&& !"null".equals(y[2]))
            {menu.additem(y[0], y[1],Double.parseDouble(y[2]));
                //  menu.displayMenu();
            }
            else{
                System.out.println("Do not add any item.");
            }
            if(!"null".equals(y[3]) ){
                menu.removeitem(y[3]);
                //   menu.displayMenu();
            }else{
                System.out.println("Do not remove any item.");
            }
            if(!"null".equals(y[5]) && !"null".equals(y[6]) )
            { menu.changeprice(y[5],Double.parseDouble(y[6]));
                //  menu.displayMenu();
            }
            else{
                System.out.println("Do not change price.");
            }

            menu.displayMenu();


        }
        catch(NumberFormatException ex){
            System.out.println("Finish");}
        catch(Exception ex){
            System.out.println("Finish");
        }
        //main(args);

    }



    }

