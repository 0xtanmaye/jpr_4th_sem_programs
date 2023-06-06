import javax.swing.JApplet;
import javax.swing.JLabel;

public class MyFirstApplet extends JApplet {
    public void init() {
        JLabel label = new JLabel("Hello, world!");
        add(label);
    }
}