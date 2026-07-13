import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CircleInRectangleDemo extends Frame {

    CircleInRectangleDemo() {

        setTitle("Circle Within Rectangle");
        setSize(500, 400);
        setVisible(true);

        // Close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Draw rectangle and circle
    public void paint(Graphics g) {

        // Draw Rectangle
        g.drawRect(100, 80, 200, 200);

        // Draw Circle inside Rectangle
        g.drawOval(100, 80, 200, 200);
    }

    public static void main(String[] args) {

        new CircleInRectangleDemo();
    }
}