import java.awt.*;
import java.applet.*;

public class HumanFace extends Applet {

   public void paint(Graphics g) {

      // Set background color
      setBackground(Color.white);

      // Draw face
      g.setColor(Color.yellow);
      g.fillOval(100, 50, 200, 200);

      // Draw eyes
      g.setColor(Color.black);
      g.fillOval(150, 100, 30, 30);
      g.fillOval(220, 100, 30, 30);

      // Draw mouth
      g.drawArc(150, 140, 100, 50, 0, -180);
   }
}