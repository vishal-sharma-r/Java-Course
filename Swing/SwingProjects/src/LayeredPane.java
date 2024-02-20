import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MYInternalFrame extends JInternalFrame{
    JTextArea ta;
    JScrollPane sp;
    static int count = 0;
    MYInternalFrame(){
        super("Document" + (++count),true,true,true,true);
        ta = new JTextArea();
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);
        setSize(300,300);
        setLocation(50,50);
        setVisible(true);

    }
}
public class LayeredPane extends JFrame implements ActionListener {
    JDesktopPane jp;
    LayeredPane(){
        super("Internal Frame Demo");
        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1= new JMenuItem("New");
        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);

        m1.addActionListener(this);
    }

    public static void main(String[] args) {
        LayeredPane f = new LayeredPane();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MYInternalFrame mi = new MYInternalFrame();
        jp.add(mi);
    }
}
