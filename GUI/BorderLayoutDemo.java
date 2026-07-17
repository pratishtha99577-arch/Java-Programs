import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends Frame {

    BorderLayoutDemo() {

        // Set Frame properties
        setTitle("BorderLayout Demo");
        setSize(400, 300);

        // Set BorderLayout
        setLayout(new BorderLayout());

        // Add buttons to different regions
        add(new Button("North"), BorderLayout.NORTH);
        add(new Button("South"), BorderLayout.SOUTH);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("West"), BorderLayout.WEST);
        add(new Button("Center"), BorderLayout.CENTER);

        // Close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new BorderLayoutDemo();
    }
}