import java.awt.*;
import java.awt.event.*;

public class AdapterClassDemo extends Frame {

    Label lbl;

    AdapterClassDemo() {

        setTitle("Adapter Class Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

        lbl = new Label("Click or move the mouse inside the window.");
        add(lbl);

        // MouseAdapter (Adapter Class)
        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                lbl.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseEntered(MouseEvent e) {
                lbl.setText("Mouse Entered the Window");
            }

            public void mouseExited(MouseEvent e) {
                lbl.setText("Mouse Exited the Window");
            }
        });

        // MouseMotionAdapter (Adapter Class)
        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseMoved(MouseEvent e) {
                lbl.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseDragged(MouseEvent e) {
                lbl.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // WindowAdapter (Adapter Class)
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new AdapterClassDemo();
    }
}