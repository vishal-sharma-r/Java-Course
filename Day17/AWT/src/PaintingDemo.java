import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowClose extends WindowAdapter{
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
public class PaintingDemo extends Frame {
    int x,y;
    PaintingDemo(){
        super("Painting");
        addWindowListener(new MyWindowAdapter());
        addMouseMotionListener(new MouseAdapter(){
          public  void mouseMoved(MouseEvent me){
              x = me.getX();
              y = me.getY();
              repaint();
          }

        });

    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.draw3DRect(x,y,30,40,true);

    }
    public static void main(String[] args) {
        PaintingDemo pd = new PaintingDemo();
        pd.setSize(500,500);
        pd.setVisible(true);
    }
}
