import java.awt.*;
import java.awt.event.*;

public class FrameCloseDemo extends Frame implements WindowListener {

    FrameCloseDemo() {

        // Frame properties
        setTitle("Close Frame Example");
        setSize(400, 300);
        setVisible(true);

        // Adding window listener
        addWindowListener(this);
    }


    // Called when close button is clicked
    public void windowClosing(WindowEvent e) {

        System.exit(0);
    }


    // Other WindowListener methods
    public void windowOpened(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }


    public static void main(String[] args) {

        new FrameCloseDemo();
    }
}