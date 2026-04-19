/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming in Blue color plain font with font size 
 * of 32 using Jframe and Jlabel */

package fourA;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

// A simple Swing application
class SwingExample {

    SwingExample() {

        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Give the frame an initial size
        jfrm.setSize(500, 200);

        // Terminate program when window is closed
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel jlab = new JLabel("Hello! VI C , Welcome to Swing Programming!");

        // Set font and color
        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));
        jlab.setForeground(Color.BLUE);

        // Center the text
        jlab.setHorizontalAlignment(JLabel.CENTER);

        // Add label to frame
        jfrm.add(jlab);

        // Center frame on screen
        jfrm.setLocationRelativeTo(null);

        // Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {

        // Create GUI on Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}