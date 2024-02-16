import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends Frame implements ActionListener {
    Label l;
    Button b;
    int count = 0;
    ButtonDemo(){
        super("Counter App");
        l = new Label("  "+count);
        b = new Button("Click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("  "+count);
    }

    public static void main(String[] args) {
        ButtonDemo bd = new ButtonDemo();
        bd.setSize(400,400);
        bd.setVisible(true);
    }


}
