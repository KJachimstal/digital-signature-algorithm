import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Signature Algorithm");
        Application application = new Application(frame);
        frame.setContentPane(application.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setSize(new Dimension(800, 800));
        frame.setVisible(true);

        Thread t = new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    application.dispose();
                    System.exit(0);
                }
            }
        });

        t.start();
    }
}
