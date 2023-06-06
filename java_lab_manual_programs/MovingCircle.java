import java.applet.*;
import java.awt.*;

public class MovingCircle extends Applet implements Runnable {
    int x = 0;
    int y = 50;
    int r = 20;
    Thread t;
    boolean flag;

    public void init() {
        setBackground(Color.white);
    }

    public void start() {
        flag = true;
        t = new Thread(this);
        t.start();
    }

    public void stop() {
        flag = false;
        t = null;
    }

    public void run() {
        while (flag) {
            x = (x + 5) % getWidth();
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
    }
}