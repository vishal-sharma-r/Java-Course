import java.awt.*;

public class GridLayoutDemo extends Frame {
    Button b1,b2,b3,b4,b5;
    GridLayoutDemo(){
        super("Grid Layout Demo");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");

        GridLayout gd = new GridLayout(2,3);
        gd.setHgap(2);
        gd.setVgap(2);
        setLayout(gd);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(new Button("6"));
        add(new Button("7"));
        add(new Button("8"));


    }
    public static void main(String[] args) {
        GridLayoutDemo gl = new GridLayoutDemo();
        gl.setSize(500,500);
        gl.setVisible(true);
    }
}
