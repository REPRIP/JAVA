import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class AppletLifeCycle extends Applet {

    // Initialization method, called once when the applet is loaded
    public void init() {
        System.out.println("Applet initialized.");
        setBackground(Color.WHITE); // Set the background color to white
    }

    // Start method, called after init() and when the applet is restarted
    public void start() {
        System.out.println("Applet started.");
    }

    // Paint method, called to render the applet's graphics
    public void paint(Graphics g) {
        System.out.println("Applet painted.");
        g.drawString("Hello, World!", 50, 25); // Draw a string on the applet
    }

    // Stop method, called when the applet is stopped (e.g., when the browser is minimized)
    public void stop() {
        System.out.println("Applet stopped.");
    }

    // Destroy method, called when the applet is about to be removed from memory
    public void destroy() {
        System.out.println("Applet destroyed.");
    }
}