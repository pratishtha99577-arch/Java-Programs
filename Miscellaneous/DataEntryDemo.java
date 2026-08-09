import java.awt.*;
import java.awt.event.*;

public class DataEntryDemo extends Frame implements ActionListener {

    TextField nameField, rollField, courseField;
    TextArea addressArea;
    Checkbox male, female;
    Button submitButton, clearButton;
    Label resultLabel;

    DataEntryDemo() {

        setTitle("Student Data Entry Form");
        setSize(500, 450);
        setLayout(null);

        // Name
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 60, 100, 30);
        add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(170, 60, 250, 30);
        add(nameField);

        // Roll Number
        Label rollLabel = new Label("Roll Number:");
        rollLabel.setBounds(50, 110, 100, 30);
        add(rollLabel);

        rollField = new TextField();
        rollField.setBounds(170, 110, 250, 30);
        add(rollField);

        // Course
        Label courseLabel = new Label("Course:");
        courseLabel.setBounds(50, 160, 100, 30);
        add(courseLabel);

        courseField = new TextField();
        courseField.setBounds(170, 160, 250, 30);
        add(courseField);

        // Gender
        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 210, 100, 30);
        add(genderLabel);

        male = new Checkbox("Male");
        male.setBounds(170, 210, 70, 30);
        add(male);

        female = new Checkbox("Female");
        female.setBounds(250, 210, 80, 30);
        add(female);

        // Address
        Label addressLabel = new Label("Address:");
        addressLabel.setBounds(50, 260, 100, 30);
        add(addressLabel);

        addressArea = new TextArea();
        addressArea.setBounds(170, 260, 250, 70);
        add(addressArea);

        // Submit Button
        submitButton = new Button("Submit");
        submitButton.setBounds(150, 350, 90, 35);
        submitButton.addActionListener(this);
        add(submitButton);

        // Clear Button
        clearButton = new Button("Clear");
        clearButton.setBounds(260, 350, 90, 35);
        clearButton.addActionListener(this);
        add(clearButton);

        // Result Label
        resultLabel = new Label("");
        resultLabel.setBounds(50, 395, 400, 30);
        add(resultLabel);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {

            String name = nameField.getText();
            String roll = rollField.getText();
            String course = courseField.getText();

            String gender = "";

            if (male.getState()) {
                gender = "Male";
            } else if (female.getState()) {
                gender = "Female";
            }

            if (name.isEmpty() || roll.isEmpty() || course.isEmpty()) {
                resultLabel.setText("Please enter all required details.");
            } else {
                resultLabel.setText("Data submitted successfully!");
                
                System.out.println("----- Student Details -----");
                System.out.println("Name    : " + name);
                System.out.println("Roll No : " + roll);
                System.out.println("Course  : " + course);
                System.out.println("Gender  : " + gender);
                System.out.println("Address : " + addressArea.getText());
            }

        } else if (e.getSource() == clearButton) {

            nameField.setText("");
            rollField.setText("");
            courseField.setText("");
            addressArea.setText("");

            male.setState(false);
            female.setState(false);

            resultLabel.setText("Form cleared.");
        }
    }

    public static void main(String[] args) {

        new DataEntryDemo();
    }
}