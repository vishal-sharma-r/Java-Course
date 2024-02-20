package org.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventFX extends Application implements EventHandler<ActionEvent> {
    Button b;
    int count = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        b = new Button("OK");
        // Adding a action listener on the button by
        // implementing the interface
        b.setOnAction(this);
        // otherwise remove the implementing interface
        /*
        * b.setOnAction(new EventHandler<ActionEvent>(){
        * public void handle(ActionEvent ae) {
            count++;
            b.setText(""+count);
            }
        * });
        * */

        /*
        * Using lambda expression*/
        /*
        b.setOnAction(e->(count++;b.setText(""+count);));
        */
        b.setPrefSize(100, 30);
        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp, 400, 400);
        stage.setScene(sc);
        stage.show();

    }

    @Override
    public void handle(ActionEvent ae) {
        count++;
        b.setText(""+count);
    }
}
