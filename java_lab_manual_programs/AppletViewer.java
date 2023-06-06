import java.applet.Applet;
import java.io.File;
import java.net.URL;
import javax.swing.*;

public class AppletViewer extends JFrame {
    public AppletViewer(String appletFilename) {
        setTitle("Applet Viewer");
        setSize(500, 500);
        File appletFile = new File(appletFilename);

        try {
            URL appletURL = appletFile.toURI().toURL();
            Applet applet = (Applet) Class.forName("AppletClassName").newInstance();
            applet.setCodeBase(appletURL);
            applet.setDocumentBase(appletURL);
            add(applet);
            applet.init();
            applet.start();
            setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java AppletViewer <applet filename>");
            System.exit(1);
        }
        AppletViewer viewer = new AppletViewer(args[0]);
    }
}