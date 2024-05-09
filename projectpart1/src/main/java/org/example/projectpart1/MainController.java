package org.example.projectpart1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import projectpart1.Waiter;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static com.sun.tools.javac.util.LayoutCharacters.CR;
import static org.example.projectpart1.HelloApplication.Mainmenu;

public class MainController implements Initializable {
    @FXML
    private HBox menu;
    private List<Integer> items;
    private List<String> items2;
    private List<Text> orders;

    ArrayList<String> MyOrder;
    ArrayList <Order> PendingOrders;
    int ind;
    Boolean flag = true;
    @FXML
    public ChoiceBox<String> choiceBox;
    private static final String DEFAULT = "Choose";
    ObservableList<String> observableList;
@FXML
TextField removalText;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ind=0;
        PendingOrders= Waiter.getAll_orders();
        MyOrder = new ArrayList<>();
        ArrayList<String> list = Mainmenu.getMenuitems();
        observableList = FXCollections.observableArrayList(list);
        observableList.add(DEFAULT);
        choiceBox.getItems().addAll(observableList);
        choiceBox.setValue(DEFAULT);
        orders = new ArrayList<>();
    }

    public void addOrder() {

        if (choiceBox.getValue().equals(DEFAULT)) {

            return;
        }

        MyOrder.add(choiceBox.getValue());


    }
    public void addCard() {
        if (!choiceBox.getValue().equals(DEFAULT)) {


            MyOrder.add(choiceBox.getValue());
            choiceBox.setValue(DEFAULT);
        }
        //doesnot care about table no and type
        Order order = new Order((ArrayList<String>) MyOrder, 3, OrderStatus.IN_PROGRESS);
        System.out.println(order.getStatus());

        for (int i = 0; i < MyOrder.size(); i++) {
            addToList(MyOrder.get(i) + ".jpg", MyOrder.get(i),Mainmenu.getprice(MyOrder.get(i)) ,order.getStatus());

        }
    PendingOrders.add(order);
        MyOrder=new ArrayList<>();
    }

    public void remove() {
        items = new ArrayList<>();
        int sum=0;

            if (!PendingOrders.isEmpty()) {
                try {
                    ArrayList<String> deleted_order = PendingOrders.get(ind).getOrderedItems();
                    for (int i = 0; i < ind; i++) {
                        sum += PendingOrders.get(i).getOrderedItems().size();
                    }
                    int size = deleted_order.size();
                    for (int i = sum; i < sum + size; i++) {
                        items.add(i);

                    }
                    items = items.reversed();
                    removeList(items);
                    PendingOrders.remove(ind);
                }
        catch (Exception e){
            System.out.println("No order to remove");
       }

            }




    }


    private void removeList(List<Integer> items) {



        List<Pane> cards = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            cards.add((Pane) menu.getChildren().get(items.get(i).intValue()));
        }

        menu.getChildren().removeAll(cards);
    }


    private void addToList(String url, String title, Double price, OrderStatus status) {
        menu.getChildren().add(new Card(url, title, price, status.toString())
                .getCard());
    }

    public void ChangeInd(KeyEvent keyEvent) {

        if (keyEvent.getCode().equals(KeyCode.ENTER))
        {String s=removalText.getText();
            System.out.println("ind is "+s  )  ;
            ind=Integer.parseInt(s);
            removalText.clear();
        }
    }
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void ChangeManager(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Manager.fxml"));

    }
}
