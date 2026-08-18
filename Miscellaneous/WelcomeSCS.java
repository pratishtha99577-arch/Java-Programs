import java.awt.*;
import java.awt.event.*;

public class WelcomeSCS extends Frame implements ActionListener {

    Button welcomeButton;
    Button colorButton;

    String message = "";
    Color messageColor = Color.BLUE;

    WelcomeSCS() {

        setTitle("Welcome to SCS");
        setSize(500, 300);
        setLayout(new FlowLayout());

        // Create first button
        welcomeButton = new Button("Display Message");
        add(welcomeButton);

        // Create second button
        colorButton = new Button("Change Color");
        add(colorButton);

        // Add event listeners
        welcomeButton.addActionListener(this);
        colorButton.addActionListener(this);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // First button displays the message
        if (e.getSource() == welcomeButton) {

            message = "Welcome to SCS";
            repaint();
        }

        // Second button toggles the message color
        if (e.getSource() == colorButton) {

            if (messageColor == Color.BLUE) {
                messageColor = Color.RED;
            } else {
                messageColor = Color.BLUE;
            }

            repaint();
        }
    }

    // Display message on the window
    public void paint(Graphics g) {

        super.paint(g);

        g.setColor(messageColor);
        g.setFont(new Font("Arial", Font.BOLD, 25));

        g.drawString(message, 150, 180);
    }

    public static void main(String[] args) {

        new WelcomeSCS();
    }
}