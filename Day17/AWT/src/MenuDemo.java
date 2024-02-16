import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class MenuDemo extends Frame {
    Menu file, sub;
    TextField tf;
    MenuItem open, save, close, closeall;
    CheckboxMenuItem auto;

    MenuDemo() {
        super("Menu Demo");
        open = new MenuItem("open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeall = new MenuItem("CloseAll");
        auto = new CheckboxMenuItem("Auto Save");


        file = new Menu("File");
        sub = new Menu("Close");
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(closeall);
        sub.add(close);
        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);
        tf = new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent e) -> tf.setText("Open"));
        save.addActionListener((ActionEvent e) -> tf.setText("Save"));
        close.addActionListener((ActionEvent e) -> tf.setText("Close"));
        closeall.addActionListener((ActionEvent e) -> tf.setText("Close All"));

        auto.addItemListener((ItemEvent ie) -> {
            if (auto.getState()) tf.setText("Auto on");
            else tf.setText("Auto Off");
        });
    }

    public static void main(String[] args) {
        MenuDemo md = new MenuDemo();
        md.setSize(500, 500);
        md.setVisible(true);
    }
}
