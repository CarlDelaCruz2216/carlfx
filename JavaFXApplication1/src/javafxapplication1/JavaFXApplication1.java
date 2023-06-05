/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Dela Cruz
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      try{
        Parent root=FXMLLoader.load(getClass().getResource("sushi.fxml"));
          Scene scene=new Scene(root,400,400);
          scene.getStylesheets().add(getClass().getResource("sushi.css").toExternalForm());
          primaryStage.setTitle("Carl's Sushi Restaurant");
          
          primaryStage.setScene(scene);
          primaryStage.show();
          
      }catch(Exception e){
          e.printStackTrace();
          
      }
    }
          
          
          
          
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
