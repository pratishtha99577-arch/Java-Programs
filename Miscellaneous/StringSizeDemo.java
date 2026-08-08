import java.awt.*;
import java.awt.event.*;

public class StringSizeDemo extends Frame implements ItemListener {

    Choice sizeChoice;
    int fontSize = 20;

    StringSizeDemo() {

        setTitle("String Size Demo");
        setSize(500, 300);
        setLayout(new FlowLayout());

        // Create Combo Box
        sizeChoice = new Choice();

        sizeChoice.add("10");
        sizeChoice.add("15");
        sizeChoice.add("20");
        sizeChoice.add("25");
        sizeChoice.add("30");
        sizeChoice.add("40");
        sizeChoice.add("50");

        add(new Label("Choose String Size:"));
        add(sizeChoice);

        // Register ItemListener
        sizeChoice.addItemListener(this);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Handle combo box event
    public void itemStateChanged(ItemEvent e) {

        fontSize = Integer.parseInt(sizeChoice.getSelectedItem());

        repaint();
    }

    // Draw the string
    public void paint(Graphics g) {

        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, fontSize));

        g.drawString("Welcome to Java", 120, 180);
    }

    public static void main(String[] args) {

        new StringSizeDemo();
    }
}