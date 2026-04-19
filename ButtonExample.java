/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or 
 * “India is pressed” depending upon the Jbutton either Srilanka or India is pressed
 *  by implementing the event handling mechanism with addActionListener( ). 
 
*/

package fourB;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonExample {

    JLabel l1;

    ButtonExample() {

        JFrame f = new JFrame("Button Example");

        // Create label
        l1 = new JLabel();
        l1.setBounds(50, 30, 700, 100);
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));

        // Create buttons
        JButton b1 = new JButton("India");
        JButton b2 = new JButton("Sri Lanka");

        // Set button positions
        b1.setBounds(100, 150, 120, 50);
        b2.setBounds(300, 150, 120, 50);

        // Action for button 1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("India is pressed");
            }
        });

        // Action for button 2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Sri Lanka is pressed");
            }
        });

        // Add components
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // Frame settings
        f.setSize(500, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}