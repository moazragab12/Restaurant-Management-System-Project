package org.example.projectpart1;


import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ImageView Firstimg;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView leftbot;
    @FXML
    private ImageView rightbot;
    @FXML
    private ImageView middleimg;
@FXML
        private ChoiceBox <String> choiceBox;

    TranslateTransition translate = new TranslateTransition();
    TranslateTransition translateleftbot = new TranslateTransition();
    TranslateTransition translateSecond = new TranslateTransition();
    RotateTransition rotate = new RotateTransition();
    TranslateTransition translaterightbot = new TranslateTransition();

    public void initialize(URL arg0, ResourceBundle arg1) {

        // top right img

        translate.setNode(Firstimg);
        translate.setDuration(Duration.millis(3000));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(100);
        translate.setByY(-100);
        translate.setAutoReverse(true);
        translate.play();

        //top left img

        translateSecond.setNode(img2);
        translateSecond.setDuration(Duration.millis(3000));
        translateSecond.setCycleCount(TranslateTransition.INDEFINITE);
        translateSecond.setByX(-100); // You can set different translation values for each image
        translateSecond.setByY(-100);   // You can set different translation values for each image
        translateSecond.setAutoReverse(true);
        translateSecond.play();
        // middle img

        rotate.setNode(middleimg);
        rotate.setDuration(Duration.millis(5000));
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.play();

        // left bot img

        translateleftbot.setNode(leftbot);
        translateleftbot.setDuration(Duration.millis(3000));
        translateleftbot.setCycleCount(TranslateTransition.INDEFINITE);
        translateleftbot.setByX(-100); // You can set different translation values for each image
        translateleftbot.setByY(100);   // You can set different translation values for each image
        translateleftbot.setAutoReverse(true);
        translateleftbot.play();
        // right  bot img

        translaterightbot.setNode(rightbot);
        translaterightbot.setDuration(Duration.millis(3000));
        translaterightbot.setCycleCount(TranslateTransition.INDEFINITE);
        translaterightbot.setByX(100); // You can set different translation values for each image
        translaterightbot.setByY(100);   // You can set different translation values for each image
        translaterightbot.setAutoReverse(true);
        translaterightbot.play();
    }
    /**********************Start of translation and scaling*****************************************************/
 /************************************************************************************/
    public void ScaleroutTopright()
    {
        ScaleTransition scale = new ScaleTransition();
        translate.play();
        translateleftbot.play();
        translateSecond.play();
        translaterightbot.play();
        rotate.play();
            scale.setNode(Firstimg);
            scale.setDuration(Duration.millis(1000));
            scale.setCycleCount(1);
            scale.setInterpolator(Interpolator.LINEAR);
            scale.setToX(1);
            scale.setToY(1);

            scale.play();



    }
    public void ScalerinTopright() {
        ScaleTransition scale = new ScaleTransition();
        translate.pause();
        translateleftbot.pause();
        translateSecond.pause();
        translaterightbot.pause();
        rotate.pause();
            scale.setNode(Firstimg);
            scale.setDuration(Duration.millis(1000));
            scale.setCycleCount(1);
            scale.setInterpolator(Interpolator.LINEAR);
            scale.setToX(1.5);
            scale.setToY(1.5);
            scale.play();
    }
/*middle img*/
public void ScaleroutMid()
{
    ScaleTransition scale = new ScaleTransition();

    translate.play();
    translateleftbot.play();
    translateSecond.play();
    translaterightbot.play();
    rotate.play();
    scale.setNode(middleimg);
    scale.setDuration(Duration.millis(1000));
    scale.setCycleCount(1);
    scale.setInterpolator(Interpolator.LINEAR);
    scale.setToX(1);
    scale.setToY(1);

    scale.play();



}
    public void ScalerinMid() {
        ScaleTransition scale = new ScaleTransition();
        translate.pause();
        translateleftbot.pause();
        translateSecond.pause();
        translaterightbot.pause();
        rotate.pause();
        scale.setNode(middleimg);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(1);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setToX(1.5);
        scale.setToY(1.5);
        scale.play();
    }

/* top left img*/
public void ScaleroutTopleft()
{
    ScaleTransition scale = new ScaleTransition();

    translate.play();
    translateleftbot.play();
    translateSecond.play();
    translaterightbot.play();
    rotate.play();
    scale.setNode(img2);
    scale.setDuration(Duration.millis(1000));
    scale.setCycleCount(1);
    scale.setInterpolator(Interpolator.LINEAR);
    scale.setToX(1);
    scale.setToY(1);

    scale.play();



}
    public void ScalerinTopleft() {
        ScaleTransition scale = new ScaleTransition();
        translate.pause();
        translateleftbot.pause();
        translateSecond.pause();
        translaterightbot.pause();
        rotate.pause();
        scale.setNode(img2);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(1);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setToX(1.5);
        scale.setToY(1.5);
        scale.play();
    }


    /* bottom left img*/
    public void ScaleroutBotLeft()
    {
        ScaleTransition scale = new ScaleTransition();

        translate.play();
        translateleftbot.play();
        translateSecond.play();
        translaterightbot.play();
        rotate.play();
        scale.setNode(leftbot);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(1);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setToX(1);
        scale.setToY(1);

        scale.play();



    }
    public void ScalerinBotLeft() {
        ScaleTransition scale = new ScaleTransition();
        translate.pause();
        translateleftbot.pause();
        translateSecond.pause();
        translaterightbot.pause();
        rotate.pause();
        scale.setNode(leftbot);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(1);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setToX(1.5);
        scale.setToY(1.5);
        scale.play();
    }


    /* bottom right img*/
    public void ScaleroutBotRight()
    {
        ScaleTransition scale = new ScaleTransition();

        translate.play();
        translateleftbot.play();
        translateSecond.play();
        translaterightbot.play();
        rotate.play();
        scale.setNode(rightbot);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(1);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setToX(1);
        scale.setToY(1);

        scale.play();



    }
    public void ScalerinBotRight() {
        ScaleTransition scale = new ScaleTransition();
        translate.pause();
        translateleftbot.pause();
        translateSecond.pause();
        translaterightbot.pause();
        rotate.pause();
        scale.setNode(rightbot);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(1);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setToX(1.5);
        scale.setToY(1.5);
        scale.play();
    }



/**********************end of translation and scaling*****************************************************/
    /************************************************************************/

    private Stage stage;
    private Scene scene;
    private Parent root;



    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}