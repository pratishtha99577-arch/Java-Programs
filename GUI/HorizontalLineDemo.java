import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HorizontalLineDemo extends Frame {

    HorizontalLineDemo() {

        setTitle("Horizontal Line");
        setSize(400, 300);
        setVisible(true);

        // Close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Draw horizontal line
    public void paint(Graphics g) {

        g.drawLine(50, 150, 350, 150);
    }

    public static void main(String[] args) {

        new HorizontalLineDemo();
    }
}