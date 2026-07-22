import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends Frame {

    GridLayoutDemo() {

        // Set frame properties
        setTitle("GridLayout Demo");
        setSize(400, 300);

        // Set GridLayout (3 rows, 3 columns)
        setLayout(new GridLayout(3, 3, 10, 10));

        // Add buttons
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        add(new Button("Button 5"));
        add(new Button("Button 6"));
        add(new Button("Button 7"));
        add(new Button("Button 8"));
        add(new Button("Button 9"));

        // Close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new GridLayoutDemo();
    }
}