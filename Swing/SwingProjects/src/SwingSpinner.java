import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingSpinner extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {
    JComboBox cb;
    JList list;
    JSpinner sp1, sp2;
    JTextField tf;

    SwingSpinner() {
        super("Spinner");
        setLayout(new FlowLayout( ));
        String[] countries = {"India", "US", "UK", "Canada", "Australia"};

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        cb = new JComboBox(countries);
        list = new JList(months);
        list.setVisibleRowCount(5);
        tf = new JTextField(15);

        sp1= new JSpinner(new SpinnerNumberModel(1,1,31,1));

        sp2= new JSpinner(new SpinnerListModel(days));
        setLayout(new FlowLayout());
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tf);
        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);

    }


    public static void main(String[] args) {
        SwingSpinner sp = new SwingSpinner();
        sp.setSize(600, 600);
        sp.setVisible(true);
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText((String)cb.getSelectedItem());
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText((String)list.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == sp1)
            tf.setText(sp1.getValue()+"");
        else
            tf.setText(sp2.getValue()+"");
    }
}
