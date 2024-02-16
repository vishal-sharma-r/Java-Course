import java.awt.*;

public class FirstApp {
    public static void main(String[] args) {
        Frame f = new Frame("App1");
//        f.setTitle("My first app");
        f.setLayout(new FlowLayout());
        // Creating a component
        Button b = new Button("Submit");
        Label lb = new Label("Enter your name ");
        TextField ta = new TextField(20);
        f.add(lb);
        f.add(ta);
        f.add(b);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
