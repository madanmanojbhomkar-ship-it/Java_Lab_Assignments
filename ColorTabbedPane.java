/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is
 *  selected in the Pan */

package fiveD;



import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorTabbedPane extends JFrame {

    JLabel label;

    public ColorTabbedPane() {

        // Create label to display selected color
        label = new JLabel("Select a tab", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Create panels
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.add("Cyan", cyanPanel);
        tabbedPane.add("Magenta", magentaPanel);
        tabbedPane.add("Yellow", yellowPanel);

        // Event handling
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();
                String color = tabbedPane.getTitleAt(index);

                label.setText("Selected Color: " + color);
            }
        });

        // Layout setup
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        // Frame settings
        setTitle("Tabbed Pane Colors");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}