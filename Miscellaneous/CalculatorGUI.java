import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends Frame {

    TextField display;

    CalculatorGUI() {

        setTitle("Calculator");
        setSize(350, 450);
        setLayout(new BorderLayout(5, 5));

        // Display text field
        display = new TextField();
        display.setFont(new Font("Arial", Font.BOLD, 25));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Calculator buttons
        Panel buttonPanel = new Panel();

        // 5 rows and 4 columns
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "(", ")", "%"
        };

        // Add buttons to GridLayout
        for (String text : buttons) {
            Button button = new Button(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new CalculatorGUI();
    }
}