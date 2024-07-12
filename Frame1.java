package frames;
import java.awt.*;

public class Frame1 {

    public static void main(String[] args) {
        // Create a new Frame object
        Frame f = new Frame();

        // Set the visibility of the frame to true
        f.setVisible(true);

        // Set the size of the frame
        f.setSize(500, 300);

        // Set the title of the frame
        f.setTitle("My Frame");

        // Don't forget to handle closing the frame properly
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
