import java.awt.*;
import java.awt.event.*;

public class KeyboardEventDemo extends Frame implements KeyListener {

    Label lbl;

    KeyboardEventDemo() {

        setTitle("Keyboard Events Demo");
        setSize(500, 300);
        setLayout(new FlowLayout());

        lbl = new Label("Press any key...");
        add(lbl);

        // Register KeyListener
        addKeyListener(this);

        // Make frame focusable
        setFocusable(true);
        requestFocus();

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Invoked when a key is pressed
    public void keyPressed(KeyEvent e) {

        lbl.setText("Key Pressed : " + e.getKeyChar() +
                " (Code: " + e.getKeyCode() + ")");
    }

    // Invoked when a key is released
    public void keyReleased(KeyEvent e) {

        lbl.setText("Key Released : " + e.getKeyChar() +
                " (Code: " + e.getKeyCode() + ")");
    }

    // Invoked when a key is typed
    public void keyTyped(KeyEvent e) {

        lbl.setText("Key Typed : " + e.getKeyChar());
    }

    public static void main(String[] args) {

        new KeyboardEventDemo();
    }
}