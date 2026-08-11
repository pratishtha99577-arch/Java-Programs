import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class TextBoxFileDemo extends Frame implements ActionListener {

    TextField textBox1;
    TextField textBox2;
    TextField textBox3;

    Button saveButton;

    TextBoxFileDemo() {

        setTitle("Save Text Box Data");
        setSize(450, 300);
        setLayout(null);

        // First Text Box
        Label label1 = new Label("Name:");
        label1.setBounds(50, 50, 100, 30);
        add(label1);

        textBox1 = new TextField();
        textBox1.setBounds(160, 50, 220, 30);
        add(textBox1);

        // Second Text Box
        Label label2 = new Label("Email:");
        label2.setBounds(50, 100, 100, 30);
        add(label2);

        textBox2 = new TextField();
        textBox2.setBounds(160, 100, 220, 30);
        add(textBox2);

        // Third Text Box
        Label label3 = new Label("Course:");
        label3.setBounds(50, 150, 100, 30);
        add(label3);

        textBox3 = new TextField();
        textBox3.setBounds(160, 150, 220, 30);
        add(textBox3);

        // Save Button
        saveButton = new Button("Save");
        saveButton.setBounds(180, 200, 80, 35);
        saveButton.addActionListener(this);
        add(saveButton);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // Get values from text boxes
        String name = textBox1.getText();
        String email = textBox2.getText();
        String course = textBox3.getText();

        try {

            // Create/overwrite the file
            FileWriter writer = new FileWriter("data.txt");

            // Write values into file
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Course: " + course + "\n");

            writer.close();

            System.out.println("Data saved successfully in data.txt");

        } catch (IOException ex) {

            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {

        new TextBoxFileDemo();
    }
}