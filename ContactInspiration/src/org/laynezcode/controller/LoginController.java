package org.laynezcode.controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController implements Initializable {
    @FXML private AnchorPane register;
    @FXML private ImageView more;
    private TranslateTransition preShow;
    private TranslateTransition preHide;
    private double x,y;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    public void preShow () {
        preShow = new TranslateTransition();
        preShow.setDuration(javafx.util.Duration.seconds(0.4));
        preShow.setNode(register);
        preShow.setToX(-570);
        preShow.play();
        register.setTranslateX(0);
        
        FadeTransition fade =  new  FadeTransition ();  
        fade.setDuration (javafx.util.Duration.seconds(0.4)); 
        fade.setToValue (0);  
        fade.setAutoReverse(true);
        fade.setNode(more);
        fade.play ();  
    }
    
    public void postHide () {
        preHide = new TranslateTransition();
        preHide.setDuration(javafx.util.Duration.seconds(0.4));
        preHide.setNode(register);
        preHide.setToX(0);
        preHide.play();
        register.setTranslateX(-30);
        
        FadeTransition fade =  new  FadeTransition ();  
        fade.setDuration (javafx.util.Duration.seconds(0.4));
        fade.setFromValue (0.1);  
        fade.setToValue (10);  
        fade.setNode(more);
        fade.play (); 
    }
    
    public void close(){
        System.exit(0);
    }
    
    @FXML
    public void pressed(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }
    
    @FXML
    public void dragged(MouseEvent event) {
     Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
     stage.setX(event.getScreenX() -x);
     stage.setY(event.getScreenY() -y);
    }
   
    }

