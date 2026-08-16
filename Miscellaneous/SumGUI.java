import java.awt.*;
import java.awt.event.*;

public class SumGUI extends Frame implements ActionListener {

    TextField num1Field;
    TextField num2Field;
    TextField resultField;
    Button addButton;

    SumGUI() {

        setTitle("Addition of Two Numbers");
        setSize(450, 250);
        setLayout(null);

        // First number
        Label label1 = new Label("Enter First Number:");
        label1.setBounds(50, 50, 130, 30);
        add(label1);

        num1Field = new TextField();
        num1Field.setBounds(200, 50, 150, 30);
        add(num1Field);

        // Second number
        Label label2 = new Label("Enter Second Number:");
        label2.setBounds(50, 90, 130, 30);
        add(label2);

        num2Field = new TextField();
        num2Field.setBounds(200, 90, 150, 30);
        add(num2Field);

        // Add button
        addButton = new Button("Add");
        addButton.setBounds(180, 130, 80, 30);
        addButton.addActionListener(this);
        add(addButton);

        // Result
        Label resultLabel = new Label("Sum:");
        resultLabel.setBounds(50, 175, 130, 30);
        add(resultLabel);

        resultField = new TextField();
        resultField.setBounds(200, 175, 150, 30);
        resultField.setEditable(false);
        add(resultField);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {

        try {

            // Get numbers from text fields
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            // Calculate sum
            double sum = num1 + num2;

            // Display result
            resultField.setText(String.valueOf(sum));

        } catch (NumberFormatException ex) {

            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {

        new SumGUI();
    }
}