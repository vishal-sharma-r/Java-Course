import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;

class ListBoxDemo extends Frame implements ItemListener, EventListener {
    List l;
    TextArea ta;
    Choice c;
    ListBoxDemo(){
        l = new List(4,true);
        ta = new TextArea(20,30);
        c = new Choice();
        setLayout(new FlowLayout());

        l.add("Java");
        l.add("Python");
        l.add("C++");
        l.add("C#");
        c.add("Html");
        c.add("JS");
        c.add("CSS");
        add(l);
        add(c);
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == l)
        {
            ta.setText(l.getSelectedItem());
        }
        else{
            ta.setText(c.getSelectedItem());
        }
    }
    public void actionPerformed(ActionEvent e){
        String list[] = l.getSelectedItems();
        String text = "";
        for(String txt: list)
        {
            text += txt + "\n";
        }
        ta.setText(text);
    }
}
public class TextFieldDemo {
    public static void main(String[] args) {
        ListBoxDemo lbd = new ListBoxDemo();
        lbd.setSize(400,500);
        lbd.setVisible(true);
    }
}
