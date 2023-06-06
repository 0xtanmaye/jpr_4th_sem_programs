import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AnimatedShapes extends Applet implements Runnable {
    private int x, y, width, height;
    private Thread animatorThread;
    private boolean stopFlag;

    public void init() {
        x = 0;
        y = 0;
        width = 100;
        height = 100;
        stopFlag = false;
    }

    public void start() {
        if (animatorThread == null) {
            animatorThread = new Thread(this);
            animatorThread.start();
        }
    }

    public void run() {
        while (!stopFlag) {
            x++;
            y++;
            width -= 2;
            height -= 2;

            if (width <= 0 || height <= 0) {
                width = 100;
                height = 100;
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void stop() {
        stopFlag = true;
        animatorThread = null;
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, width, height);
    }
}