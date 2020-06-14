package org.laynezcode.Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ReproductorController implements Initializable{
    double x,y;
    @FXML private AnchorPane menu;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        menu.setTranslateX(-200);
    }
    
    @FXML
    @SuppressWarnings("empty-statement")
    private void show (MouseEvent event){
        TranslateTransition slider = new TranslateTransition();
        slider.setDuration(javafx.util.Duration.seconds(0.4));
        slider.setNode(menu);
        slider.setToX(0);
        slider.play();
        menu.setTranslateX(200);
    }
    
    @FXML
    @SuppressWarnings("empty-statement")
    private void hide (MouseEvent event){
        TranslateTransition slider = new TranslateTransition();
        slider.setDuration(javafx.util.Duration.seconds(0.4));
        slider.setNode(menu);
        slider.setToX(-200);
        slider.play();
        menu.setTranslateX(0);
    }
}
