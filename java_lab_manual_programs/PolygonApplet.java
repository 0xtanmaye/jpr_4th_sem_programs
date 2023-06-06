import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;

public class PolygonApplet extends Applet {
   public void paint(Graphics g) {
      int xPoints[] = {100, 200, 250, 200, 100, 50};
      int yPoints[] = {100, 100, 150, 200, 200, 150};
      int nPoints = 6;

      //Polygon polygon = new Polygon(xPoints, yPoints, nPoints);

      g.drawPolygon(xPoints,yPoints,nPoints);
   }
}