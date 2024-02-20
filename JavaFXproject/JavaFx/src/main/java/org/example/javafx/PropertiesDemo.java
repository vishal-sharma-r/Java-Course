package org.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PropertiesDemo extends Application {
    @Override
    public  void start(Stage stage) throws Exception {
        Button b = new Button("Click _me");
        b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true);
        Tooltip tp = new Tooltip("Click this button to Save data");
        b.setTooltip(tp);
        b.setStyle("-fx-border-color:yellow;-fx-background-color:gray");
        Alert a = new Alert(Alert.AlertType.INFORMATION,"Button is Clicked");
        b.setOnAction(e->a.show());

        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp,400,400);
        stage.setScene(sc);
        stage.show();

    }
}
