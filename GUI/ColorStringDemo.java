import java.awt.*;
import java.awt.event.*;

public class ColorStringDemo extends Frame implements ItemListener {

    Choice colorChoice;
    Color textColor = Color.BLACK;

    ColorStringDemo() {

        setTitle("Change String Color");
        setSize(500, 300);
        setLayout(new FlowLayout());

        // Create Choice (Combo Box)
        colorChoice = new Choice();
        colorChoice.add("Black");
        colorChoice.add("Red");
        colorChoice.add("Blue");
        colorChoice.add("Green");
        colorChoice.add("Yellow");

        add(new Label("Choose Color:"));
        add(colorChoice);

        colorChoice.addItemListener(this);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Change color when user selects an item
    public void itemStateChanged(ItemEvent e) {

        String color = colorChoice.getSelectedItem();

        if (color.equals("Black"))
            textColor = Color.BLACK;
        else if (color.equals("Red"))
            textColor = Color.RED;
        else if (color.equals("Blue"))
            textColor = Color.BLUE;
        else if (color.equals("Green"))
            textColor = Color.GREEN;
        else if (color.equals("Yellow"))
            textColor = Color.YELLOW;

        repaint();
    }

    // Display string in selected color
    public void paint(Graphics g) {

        g.setColor(textColor);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Hello Java!", 150, 180);
    }

    public static void main(String[] args) {

        new ColorStringDemo();
    }
}