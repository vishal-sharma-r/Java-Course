import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InputForm extends Application {
    int count = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label l1 = new Label("Customer Id");
        Label l2 = new Label("Name ");
        Label l3 = new Label("Address ");
        ComboBox<Integer> cust = new ComboBox<>();
        TextField name = new TextField();
        TextField add = new TextField();
        name.setPrefColumnCount(15);
        add.setPrefColumnCount(20);

        Button save = new Button("Save");
        Button create = new Button("Create");

        HBox hb1 = new HBox();
        HBox hb2 = new HBox();
        HBox hb3 = new HBox();
        HBox hb4 = new HBox();

        hb1.getChildren().addAll(l1, cust);
        hb2.getChildren().addAll(l2,name);
        hb3.getChildren().addAll(l3,add);
        hb4.getChildren().addAll(create,save);
        VBox vb = new VBox();
        vb.getChildren().addAll(hb1,hb2,hb3,hb4);
        Scene sc =  new Scene(vb,500,500);
        stage.setScene(sc);
        stage.show();


    }
}
