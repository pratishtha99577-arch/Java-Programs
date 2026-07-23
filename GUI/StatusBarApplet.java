/*
<applet code="StatusBarApplet.class" width="400" height="200">
</applet>
*/

import java.applet.Applet;
import java.awt.Graphics;

public class StatusBarApplet extends Applet {

    public void init() {

        // Display message in the status bar
        showStatus("Welcome to Java Applet Status Bar Demo");
    }

    public void paint(Graphics g) {

        g.drawString("Applet with Status Bar", 100, 80);
    }
}