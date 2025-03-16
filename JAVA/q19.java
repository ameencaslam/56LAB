import java.applet.Applet;
import java.awt.*;

public class q19 extends Applet {
    int x, y, width, height;
    Color rectColor;

    public void init() {
        // Get parameters from HTML
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        width = Integer.parseInt(getParameter("width"));
        height = Integer.parseInt(getParameter("height"));

        // Get color parameter and parse it
        String colorParam = getParameter("color");
        if (colorParam != null) {
            rectColor = Color.decode(colorParam);  // Converts hex color to Color object
        } else {
            rectColor = Color.BLACK;  // Default color
        }
    }

    public void paint(Graphics g) {
        g.setColor(rectColor);
        g.fillRect(x, y, width, height);
    }
}
