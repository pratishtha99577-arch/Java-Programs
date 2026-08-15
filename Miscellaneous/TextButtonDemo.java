import java.awt.*;
import java.awt.event.*;

public class TextButtonDemo extends Frame implements ActionListener {

    TextField textField;
    Button button1, button2, button3;

    TextButtonDemo() {

        setTitle("Text Field and Buttons");
        setSize(500, 250);
        setLayout(new FlowLayout());

        // Create Text Field
        textField = new TextField(30);
        add(textField);

        // Create three buttons
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");
        button3 = new Button("Button 3");

        add(button1);
        add(button2);
        add(button3);

        // Add event listeners
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Handle button events
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            textField.setText("Hello! You pressed Button 1.");
        }

        else if (e.getSource() == button2) {
            textField.setText("Welcome to Java Programming!");
        }

        else if (e.getSource() == button3) {
            textField.setText("You pressed Button 3.");
        }
    }

    public static void main(String[] args) {
        new TextButtonDemo();
    }
}