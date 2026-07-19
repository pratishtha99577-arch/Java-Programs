import java.applet.Applet;
import java.awt.Graphics;

public class ScrollingStringApplet extends Applet implements Runnable {

    String message = "Welcome to Java Applet Scrolling Text";
    Thread t;

    public void init() {

        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {

        g.drawString(message, 20, 50);
    }

    public void run() {

        while (true) {

            // Scroll the string by moving the first character to the end
            message = message.substring(1) + message.charAt(0);

            repaint();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}