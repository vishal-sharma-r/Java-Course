package org.example.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SliderDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        TextArea ta = new TextArea();
        ta.setPrefRowCount(20);
        ta.setPrefColumnCount(100);
        Slider sl = new Slider(10, 50, 10);
        VBox vb = new VBox();
        sl.setMajorTickUnit(5);
        sl.setShowTickMarks(true);

        sl.valueProperty().addListener(e -> ta.setFont(Font.font(sl.getValue())));
        DatePicker dp = new DatePicker();
        dp.setShowWeekNumbers(true);
        dp.setOnAction(e -> ta.setText("Date: " + dp.getValue() + "\n" + ta.getText()));
        ColorPicker cp = new ColorPicker();
        cp.setOnAction(e -> {
            String previousText = ta.getText();
            String newColorText = "Selected Color: " + cp.getValue();

            // Remove the previous color text if it exists
            if (previousText.contains("Selected Color:")) {
                int startIndex = previousText.indexOf("Selected Color:");
                int endIndex = previousText.indexOf("\n", startIndex);
                if (endIndex == -1) {
                    endIndex = previousText.length();
                }
                previousText = previousText.substring(0, startIndex) + previousText.substring(endIndex);
            }
            ta.setStyle("-fx-text-fill:#" + cp.getValue().toString().substring(2, 8));
            ta.setText(newColorText + "\n" + previousText.trim());
        });
        Button b = new Button("Open file");
        b.setOnAction(e -> {
            FileChooser fc = new FileChooser();
            java.io.File file = fc.showOpenDialog(stage);
            try {
                Scanner sc = new Scanner(new FileInputStream(file));
                String str = "";
                while (sc.hasNext()) {
                    str = str + sc.nextLine() + "\n";
                }
                ta.setText(str);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });
        vb.setAlignment(Pos.TOP_CENTER);
        vb.getChildren().addAll(ta, sl, dp, cp, b);
        Scene sc = new Scene(vb, 500, 500);
        stage.setScene(sc);
        stage.show();
    }
}
