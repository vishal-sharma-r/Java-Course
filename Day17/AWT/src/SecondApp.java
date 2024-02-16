import java.awt.*;

class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;

    MyFrame() {
        super("MyApp2");
        setLayout( new FlowLayout());
        l = new Label("Name ");
        tf = new TextField(20);
        b = new Button("OK");
        add(l);
        add(tf);
        add(b);
    }
}

public class SecondApp {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
