import java.awt.*;

class AnimationClass extends Frame implements Runnable{
    int x,y, tx,ty;
    AnimationClass(){
        x=100;
        y=100;
        tx=ty=1;

        Thread t=new Thread(this);
        t.start();
//        Thread t1 = new Thread(this);
//        t1.start();
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(x,y,50,50);

    }

    public void run()
    {
        while(true)
        {
            x+=tx;
            y+=ty;

            if(x<0 || x>450)
                tx=tx*-1;
            if(y< 30 || y>350)
                ty=ty*-1;
            repaint();

            try{Thread.sleep(5);}catch(Exception e){}
        }

    }
}
public class Animation {
    public static void main(String[] args) {
        AnimationClass ac = new AnimationClass();
        ac.setSize(500,400);
        ac.setVisible(true);
    }
}
