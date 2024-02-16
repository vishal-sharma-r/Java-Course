import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventDemo extends Frame implements WindowListener {
    Label l,l2;
    WindowEventDemo(){
        super("Window Event Demo");
        l=new Label("No Message from Window");

        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);
    }
    public void windowOpened(WindowEvent we)
    {
        l.setText("Window Opened");

    }

    public void windowClosing(WindowEvent e)
    {
        l.setText("Window Closing");
        System.exit(0);
    }

    public void windowClosed(WindowEvent e)
    {
        l.setText("Window Closed");
    }

    public void windowIconified(WindowEvent e)
    {
        l.setText("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e)
    {
        l.setText("Window Deiconified");
    }

    public void windowActivated(WindowEvent e)
    {
        l.setText("Window Activated");
    }

    public void windowDeactivated(WindowEvent e)
    {
        l.setText("Window DeActivated");
    }

    public static void main(String[] args) {
        WindowEventDemo f=new WindowEventDemo();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
