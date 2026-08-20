import java.awt.*;
import java.awt.event.*;

public class FeesReceiptGUI extends Frame {

    TextField nameField;
    TextField classField;
    TextField dateField;
    TextField amountField;

    Checkbox javaCourse;
    Checkbox pythonCourse;
    Checkbox cppCourse;

    Checkbox male;
    Checkbox female;

    FeesReceiptGUI() {

        setTitle("FEES RECEIPT");
        setSize(600, 500);
        setLayout(null);

        // Heading
        Label heading = new Label("FEES RECEIPT", Label.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 22));
        heading.setBounds(180, 40, 240, 35);
        add(heading);

        // Name
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(60, 100, 120, 30);
        add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(200, 100, 300, 30);
        add(nameField);

        // Class
        Label classLabel = new Label("Class:");
        classLabel.setBounds(60, 145, 120, 30);
        add(classLabel);

        classField = new TextField();
        classField.setBounds(200, 145, 300, 30);
        add(classField);

        // Date
        Label dateLabel = new Label("Date:");
        dateLabel.setBounds(60, 190, 120, 30);
        add(dateLabel);

        dateField = new TextField();
        dateField.setBounds(200, 190, 300, 30);
        add(dateField);

        // Amount Paid
        Label amountLabel = new Label("Amount Paid:");
        amountLabel.setBounds(60, 235, 120, 30);
        add(amountLabel);

        amountField = new TextField();
        amountField.setBounds(200, 235, 300, 30);
        add(amountField);

        // Course
        Label courseLabel = new Label("Select Course:");
        courseLabel.setBounds(60, 280, 120, 30);
        add(courseLabel);

        javaCourse = new Checkbox("Java");
        javaCourse.setBounds(200, 280, 70, 30);
        add(javaCourse);

        pythonCourse = new Checkbox("Python");
        pythonCourse.setBounds(280, 280, 80, 30);
        add(pythonCourse);

        cppCourse = new Checkbox("C++");
        cppCourse.setBounds(370, 280, 70, 30);
        add(cppCourse);

        // Gender
        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(60, 325, 120, 30);
        add(genderLabel);

        // Radio buttons using CheckboxGroup
        CheckboxGroup genderGroup = new CheckboxGroup();

        male = new Checkbox("Male", genderGroup, false);
        male.setBounds(200, 325, 70, 30);
        add(male);

        female = new Checkbox("Female", genderGroup, false);
        female.setBounds(280, 325, 80, 30);
        add(female);

        // Close button
        Button closeButton = new Button("Close");
        closeButton.setBounds(250, 385, 80, 35);
        add(closeButton);

        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Close window using X button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FeesReceiptGUI();
    }
}