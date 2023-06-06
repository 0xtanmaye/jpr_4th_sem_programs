import javax.swing.*;
public class MyFrame extends JFrame {
    
    public MyFrame() {
        setTitle("My Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello, world!");
        add(label);
        setVisible(true);
    }
	
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}