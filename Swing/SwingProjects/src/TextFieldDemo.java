import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

class TextFieldDemoFrame extends JFrame {

    TextFieldDemoFrame() {
        JButton b;
        JTextField tf1 = new JTextField();
        DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField tf2 = new JFormattedTextField(df);
        setLayout(new FlowLayout());
        tf2.setColumns(15);
        tf2.setValue(0);
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        JFormattedTextField tf3 = new JFormattedTextField(nft);
        tf3.setColumns(15);

        add(tf1);
        add(tf2);
        add(tf3);
    }


}

public class TextFieldDemo {
    public static void main(String[] args) {
        TextFieldDemoFrame tf = new TextFieldDemoFrame();
        tf.setSize(500, 500);
        tf.setVisible(true);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
