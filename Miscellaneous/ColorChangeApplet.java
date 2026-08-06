/*
<applet code="ColorChangeApplet.class" width="400" height="300">
</applet>
*/

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ColorChangeApplet extends Applet implements Runnable {

    Thread t;

    // Array of colors
    Color[] colors = {
        Color.RED,
        Color.GREEN,
        Color.BLUE,
        Color.YELLOW,
        Color.CYAN,
        Color.MAGENTA,
        Color.ORANGE,
        Color.PINK,
        Color.LIGHT_GRAY
    };

    int index = 0;

    public void init() {

        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        g.drawString("Background Color Changes Every Second", 60, 150);
    }

    public void run() {

        while (true) {

            // Change background color
            setBackground(colors[index]);

            index = (index + 1) % colors.length;

            repaint();

            try {
                Thread.sleep(1000);   // Wait for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}