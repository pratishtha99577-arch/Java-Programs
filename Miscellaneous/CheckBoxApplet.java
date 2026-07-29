/*
<applet code="CheckBoxApplet.class" width="400" height="200">
</applet>
*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxApplet extends Applet implements ItemListener {

    Checkbox java, python, cpp;
    String message = "";

    public void init() {

        // Create Checkboxes
        java = new Checkbox("Java");
        python = new Checkbox("Python");
        cpp = new Checkbox("C++");

        // Add Checkboxes to Applet
        add(java);
        add(python);
        add(cpp);

        // Register ItemListener
        java.addItemListener(this);
        python.addItemListener(this);
        cpp.addItemListener(this);
    }

    // Handle Checkbox Events
    public void itemStateChanged(ItemEvent e) {

        message = "Selected: ";

        if (java.getState())
            message += "Java ";

        if (python.getState())
            message += "Python ";

        if (cpp.getState())
            message += "C++ ";

        repaint();
    }

    // Display Selected Checkboxes
    public void paint(Graphics g) {

        g.drawString(message, 20, 100);
    }
}