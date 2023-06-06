import java.awt.*;
import java.applet.*;

public class CircleApplet extends Applet {
   public void paint(Graphics g) {
      int x = 10, y = 10, diameter = 50;
      for (int i = 0; i < 5; i++) {
         g.drawOval(x, y, diameter, diameter);
         x += 10;
         y += 10;
         diameter += 10;
      }
   }
}