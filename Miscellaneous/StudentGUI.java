import java.awt.*;
import java.awt.event.*;

public class StudentGUI extends Frame {

    TextField rollNoField;
    TextField nameField;
    TextField classField;
    TextField addressField;

    StudentGUI() {

        setTitle("STUDENT");
        setSize(500, 350);
        setLayout(null);

        // Roll No.
        Label rollNoLabel = new Label("Roll No.:");
        rollNoLabel.setBounds(60, 60, 100, 30);
        add(rollNoLabel);

        rollNoField = new TextField();
        rollNoField.setBounds(180, 60, 250, 30);
        add(rollNoField);

        // Name
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(60, 110, 100, 30);
        add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(180, 110, 250, 30);
        add(nameField);

        // Class
        Label classLabel = new Label("Class:");
        classLabel.setBounds(60, 160, 100, 30);
        add(classLabel);

        classField = new TextField();
        classField.setBounds(180, 160, 250, 30);
        add(classField);

        // Address
        Label addressLabel = new Label("Address:");
        addressLabel.setBounds(60, 210, 100, 30);
        add(addressLabel);

        addressField = new TextField();
        addressField.setBounds(180, 210, 250, 30);
        add(addressField);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentGUI();
    }
}