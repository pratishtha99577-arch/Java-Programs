import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {

    Label lbl;

    MouseEventDemo() {

        setTitle("Mouse Events Demo");
        setSize(500, 400);
        setLayout(new FlowLayout());

        lbl = new Label("Perform mouse actions inside the window.");
        add(lbl);

        // Register mouse listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // MouseListener methods

    public void mouseClicked(MouseEvent e) {
        lbl.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        lbl.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        lbl.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        lbl.setText("Mouse Entered the Window");
    }

    public void mouseExited(MouseEvent e) {
        lbl.setText("Mouse Exited the Window");
    }

    // MouseMotionListener methods

    public void mouseDragged(MouseEvent e) {
        lbl.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        lbl.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {

        new MouseEventDemo();
    }
}