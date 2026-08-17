import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ReferenceEventApplet extends Applet implements KeyListener {

    Button button;
    TextField textField;

    public void init() {

        setLayout(new FlowLayout());

        // Create Button
        button = new Button("Type Here");

        // Create TextField
        textField = new TextField(25);

        add(button);
        add(textField);

        // Register keyboard listener
        button.addKeyListener(this);

        // Give focus to the button
        button.requestFocus();
    }

    // Key pressed event
    public void keyPressed(KeyEvent e) {

        char ch = e.getKeyChar();

        if (!Character.isISOControl(ch)) {
            textField.setText(textField.getText() + ch);
        }
    }

    // Required KeyListener methods
    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
}