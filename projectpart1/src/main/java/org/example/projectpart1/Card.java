package org.example.projectpart1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.effect.DropShadow;
/**
 *
 * @author Moaz
 */


/**
 * Represents a card used in the application.
 */
public class Card {

    private String imgUrl;
    private String name;
    private Double price;
    private String status;

    /**
     * Constructs a new Card object.
     *
     * @param imgUrl The URL of the image associated with the card.
     * @param name   The name of the card.
     * @param price  The price of the card.
     * @param status The status of the card.
     */
    public Card(String imgUrl, String name, Double price, String status) {
        this.imgUrl = imgUrl;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    /**
     * Generates the graphical representation of the card.
     *
     * @return A Pane containing the visual representation of the card.
     */
    public Pane getCard() {
        Pane pane = new Pane();
        pane.getChildren().add(getRectangle());
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);

        vBox.getChildren().add(getImg());
        vBox.getChildren().add(getName());
        vBox.getChildren().add(getStatus());
        vBox.getChildren().add(getPrice());

        pane.getChildren().add(vBox);
        HBox.setMargin(pane, new Insets(0, 115, 0, 0));
        return pane;
    }

    /**
     * Retrieves the graphical representation of the price.
     *
     * @return An HBox containing the graphical representation of the price.
     */
    private HBox getPrice() {
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        Text priceText = new Text("Price: ");
        priceText.setFill(Color.WHITE);
        hBox.getChildren().add(priceText);

        Text price = new Text("$" + this.price.toString());
        price.setFill(Color.WHITE);
        price.setFont(new Font(15));
        hBox.getChildren().add(price);
        return hBox;
    }

    /**
     * Retrieves the graphical representation of the image.
     *
     * @return An ImageView containing the image of the card.
     */
    private ImageView getImg() {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/org/example/projectpart1/imgs/" + imgUrl)));
        imageView.setFitHeight(70);
        imageView.setFitWidth(70);
        return imageView;
    }

    /**
     * Retrieves the graphical representation of the status.
     *
     * @return A Text object containing the status of the card.
     */
    private Text getStatus() {
        Text status = new Text(this.status);
        status.setFill(Color.WHITE);
        status.setFont(new Font("Bauhaus 93", 16));
        return status;
    }

    /**
     * Retrieves the graphical representation of the background rectangle.
     *
     * @return A Rectangle object representing the background of the card.
     */
    private Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setArcWidth(25);
        rectangle.setArcHeight(25);
        if (name.equals("Shawarma")) {
            rectangle.setFill(Color.rgb(129, 65, 7));
        } else if (name.equals("Tahini")) {
            rectangle.setFill(Color.rgb(60, 40, 190));
        } else if (name.equals("Koshari")) {
            rectangle.setFill(Color.rgb(229, 150, 120));
        } else if (name.equals("Burger")) {
            rectangle.setFill(Color.rgb(229, 65, 7));
        } else if (name.equals("Sushi")) {
            rectangle.setFill(Color.rgb(30, 50, 200));
        }
        rectangle.setEffect(new DropShadow());
        rectangle.setWidth(120);
        rectangle.setHeight(180);
        return rectangle;
    }

    /**
     * Retrieves the graphical representation of the name.
     *
     * @return A Text object containing the name of the card.
     */
    private Text getName() {
        Text name = new Text(this.name);
        name.setFill(Color.WHITE);
        name.setFont(new Font("Bauhaus 93", 16));
        return name;
    }
}