import java.awt.*;
import java.awt.event.*;

public class BackgroundColorDemo extends Frame implements ItemListener {

    Choice colorChoice;

    BackgroundColorDemo() {

        setTitle("Background Color Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Create Combo Box (Choice)
        colorChoice = new Choice();
        colorChoice.add("White");
        colorChoice.add("Red");
        colorChoice.add("Green");
        colorChoice.add("Blue");
        colorChoice.add("Yellow");
        colorChoice.add("Gray");

        add(new Label("Select Background Color:"));
        add(colorChoice);

        // Register ItemListener
        colorChoice.addItemListener(this);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Change background color based on selected item
    public void itemStateChanged(ItemEvent e) {

        String color = colorChoice.getSelectedItem();

        if (color.equals("White"))
            setBackground(Color.WHITE);
        else if (color.equals("Red"))
            setBackground(Color.RED);
        else if (color.equals("Green"))
            setBackground(Color.GREEN);
        else if (color.equals("Blue"))
            setBackground(Color.BLUE);
        else if (color.equals("Yellow"))
            setBackground(Color.YELLOW);
        else if (color.equals("Gray"))
            setBackground(Color.GRAY);

        repaint();
    }

    public static void main(String[] args) {

        new BackgroundColorDemo();
    }
}