/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.laynezcode.system;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("/org/laynezcode/view/Reproductor.fxml"));
     Scene scene = new Scene(root);
     primaryStage.setScene(scene);
     //primaryStage.initStyle(StageStyle.UNDECORATED);
     primaryStage.getIcons().add(new Image("/org/laynezcode/images/icono.png"));
     primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
