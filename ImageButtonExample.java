/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” 
 * or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour 
 * Glass is pressed by implementing the event handling mechanism with addActionListener( ). 
 
*/
package fourC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {

    JLabel label;

    ImageButtonExample() {

        JFrame frame = new JFrame("Image Button Example");

        // Label to display message
        label = new JLabel("Click a button");
        label.setBounds(100, 20, 400, 30);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Load images (make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("images/Watch.png");
        ImageIcon hourGlassIcon = new ImageIcon("images/Hourglass.png");

        // Create buttons with images
        JButton btnClock = new JButton(clockIcon);
        JButton btnHourGlass = new JButton(hourGlassIcon);

        btnClock.setBounds(50, 80, 150, 150);
        btnHourGlass.setBounds(250, 80, 150, 150);

        // Action for Digital Clock button
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Action for Hour Glass button
        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        frame.add(label);
        frame.add(btnClock);
        frame.add(btnHourGlass);

        // Frame settings
        frame.setSize(450, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}