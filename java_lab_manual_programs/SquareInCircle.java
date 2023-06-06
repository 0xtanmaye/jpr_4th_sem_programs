import java.awt.*;
import java.applet.*;

public class SquareInCircle extends Applet {
  public void paint(Graphics g) {
    // Set circle parameters
    int x = 50;
    int y = 50;
    int diameter = 100;
    
    // Draw circle
    g.setColor(Color.blue);
    g.drawOval(x, y, diameter, diameter);
    
    // Draw square inside the circle
    int squareSize = (int) (diameter / Math.sqrt(2));
    int squareX = x + (diameter - squareSize) / 2;
    int squareY = y + (diameter - squareSize) / 2;
    g.drawRect(squareX, squareY, squareSize, squareSize);
  }
}