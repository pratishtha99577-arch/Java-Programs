import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ColoredCircleRectangleDemo extends Frame {

    ColoredCircleRectangleDemo() {

        setTitle("Colored Circle Inside Rectangle");
        setSize(500, 400);
        setVisible(true);

        // Close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {

        // Fill Rectangle with Yellow color
        g.setColor(Color.YELLOW);
        g.fillRect(100, 80, 200, 200);

        // Draw Rectangle Border in Black
        g.setColor(Color.BLACK);
        g.drawRect(100, 80, 200, 200);

        // Fill Circle with Blue color
        g.setColor(Color.BLUE);
        g.fillOval(100, 80, 200, 200);

        // Draw Circle Border in Red
        g.setColor(Color.RED);
        g.drawOval(100, 80, 200, 200);
    }

    public static void main(String[] args) {

        new ColoredCircleRectangleDemo();
    }
}