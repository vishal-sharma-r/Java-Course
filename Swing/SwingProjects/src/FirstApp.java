import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe1 extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;
    Myframe1(){
        super("Swing Demo");
        setLayout(new FlowLayout());
        l = new JLabel("Clicked "+ count +" Times");
        b = new JButton("Click");
       JButton c=  new  JButton("Cancel");
        add(l);
        add(b);
        add(c);
        b.addActionListener(this);
        c.addActionListener((ActionEvent e)->{
            count--;
            l.setText("Clicked "+ count +" Times");

        });
        getRootPane().setDefaultButton(b);
        b.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\yogaImage.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked "+ count +" Times");
    }



}
public class FirstApp {
    public static void main(String[] args) {
    Myframe1 mf = new Myframe1();
    mf.setSize(500,500);
    mf.setVisible(true);
    mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
