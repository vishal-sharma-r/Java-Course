import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class SplitPane extends JFrame implements ListSelectionListener {
    JSplitPane sp;
    JList list;
    JLabel lbl;

    SplitPane() {
        super("Split Demo");
        String cols[] = {"RED", "GREEN", "YELLOW", "BLUE", "MAGENTA"};
        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(list);

        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);
        JScrollPane p2 = new JScrollPane(lbl);
        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
        sp.setDividerLocation(200);

        add(sp);

    }

    public static void main(String[] args) {
        SplitPane sp = new SplitPane();
        sp.setSize(600, 600);
        sp.setVisible(true);
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String str = (String) list.getSelectedValue();
        switch (str) {
            case "RED":
                lbl.setBackground(Color.red);
                break;
            case "GREEN":
                lbl.setBackground(Color.green);
                break;
            case "YELLOW":
                lbl.setBackground(Color.yellow);
                break;
            case "MAGENTA":
                lbl.setBackground(Color.magenta);
                break;
            case "BLUE":
                lbl.setBackground(Color.blue);
                break;
        }
    }
}
