import java.awt.*;
import java.awt.event.*;

public class ColorClassDemo extends Frame {

    ColorClassDemo() {

        setTitle("Color Class Demo");
        setSize(500, 350);

        // Set background color
        setBackground(Color.LIGHT_GRAY);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g) {

        // Red text
        g.setColor(Color.RED);
        g.drawString("This is Red Color", 50, 70);

        // Blue rectangle
        g.setColor(Color.BLUE);
        g.fillRect(50, 90, 100, 50);

        // Green circle
        g.setColor(Color.GREEN);
        g.fillOval(200, 90, 100, 100);

        // Yellow line
        g.setColor(Color.YELLOW);
        g.drawLine(50, 240, 300, 240);

        // Magenta text
        g.setColor(Color.MAGENTA);
        g.drawString("Java AWT Color Class", 50, 280);
    }

    public static void main(String[] args) {

        new ColorClassDemo();
    }
}