import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LineDrawingDemo extends Frame {

    LineDrawingDemo() {

        setTitle("Perpendicular and Parallel Lines");
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

        // Draw perpendicular lines
        g.drawLine(100, 50, 100, 250);   // Vertical line
        g.drawLine(30, 150, 170, 150);   // Horizontal line

        // Draw parallel lines
        g.drawLine(250, 80, 450, 80);    // First horizontal line
        g.drawLine(250, 130, 450, 130);  // Second horizontal line
    }

    public static void main(String[] args) {

        new LineDrawingDemo();
    }
}