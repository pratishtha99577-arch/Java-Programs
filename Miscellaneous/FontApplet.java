/*
<applet code="FontApplet.class" width="500" height="500">
</applet>
*/

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontApplet extends Applet {

    String[] fonts;

    public void init() {

        // Get all available fonts
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        fonts = ge.getAvailableFontFamilyNames();
    }

    public void paint(Graphics g) {

        int y = 20;

        g.drawString("Available Fonts:", 20, y);
        y += 20;

        // Display all fonts
        for (int i = 0; i < fonts.length; i++) {

            g.setFont(new Font(fonts[i], Font.PLAIN, 14));
            g.drawString(fonts[i], 20, y);

            y += 20;

            // Stop if applet window is full
            if (y > getHeight() - 20) {
                break;
            }
        }
    }
}