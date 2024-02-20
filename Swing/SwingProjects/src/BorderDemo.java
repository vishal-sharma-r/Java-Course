import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

class BorderDemo1 extends JFrame{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;
    BorderDemo1(){
        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("OK");
        p = new JPanel();
        p.add(l);
        p.add(tf);
        p.add(b);

        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"LOGIN", TitledBorder.CENTER,TitledBorder.LEFT);
        p.setBorder(br);
        setLayout(new FlowLayout());
        add(p);

    }
}

public class BorderDemo {
    public static void main(String[] args) {
        BorderDemo1  d= new BorderDemo1();
        d.setSize(500,500);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
