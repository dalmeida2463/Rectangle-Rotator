/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglerotator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author dalmeida2463
 */
public class RectangleRotator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane stack = new StackPane();
        stack.setPrefSize(400,400);
        HBox hBox = new HBox();

        
        Rectangle rect = new Rectangle(0,0,120,60);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);
        
        Button btnRotateRight = new Button();
        Button btnRotateLeft = new Button();
        
        BorderPane centerPane = new BorderPane();
        
        btnRotateRight.setText("Rotate Right");
        btnRotateRight.setOnAction(e -> {
            rect.setRotate(rect.getRotate()+15);
        });
        btnRotateLeft.setText("Rotate Left");
        btnRotateLeft.setOnAction(e -> {
            rect.setRotate(rect.getRotate()-15);
        });
        hBox.setAlignment(Pos.BOTTOM_CENTER);        
        centerPane.setBottom(hBox);
        centerPane.setCenter(stack);
        stack.getChildren().add(rect);
        hBox.getChildren().add(btnRotateRight);
        hBox.getChildren().add(btnRotateLeft);
        
        Scene scene = new Scene(centerPane, 300, 250);
        
        primaryStage.setTitle("Rectangle Rotator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
