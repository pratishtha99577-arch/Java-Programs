import java.awt.*;
import java.awt.event.*;

public class ButtonEventDemo extends Frame implements ActionListener {

    Button btn1, btn2;
    Label lbl;

    ButtonEventDemo() {

        setTitle("AWT Button Event Demo");
        setSize(400, 250);
        setLayout(new FlowLayout());

        // Create Buttons
        btn1 = new Button("Click Me");
        btn2 = new Button("Reset");

        // Create Label
        lbl = new Label("Press a button");

        // Add components
        add(btn1);
        add(btn2);
        add(lbl);

        // Register ActionListener
        btn1.addActionListener(this);
        btn2.addActionListener(this);

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

        if (e.getSource() == btn1) {
            lbl.setText("Button 'Click Me' was clicked.");
        }

        if (e.getSource() == btn2) {
            lbl.setText("Press a button");
        }
    }

    public static void main(String[] args) {

        new ButtonEventDemo();
    }
}