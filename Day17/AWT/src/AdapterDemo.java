import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

public class AdapterDemo extends Frame {
    AdapterDemo() {
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter());
    }


    public static void main(String[] args) {
        AdapterDemo ad = new AdapterDemo();
        ad.setSize(500, 500);
        ad.setVisible(true);
    }
}
