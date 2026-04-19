/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, 
 * Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the
 *  capital of the countries on console whenever the countries are selected on the list. */
package fiveC;



import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryCapitalList extends JFrame {

    JList<String> countryList;

    public CountryCapitalList() {

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Capitals mapping
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "No single capital (continent)");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList
        countryList = new JList<>(countries);

        // Add selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    String selected = countryList.getSelectedValue();

                    if (selected != null) {
                        System.out.println("Country: " + selected +
                                           " → Capital: " + capitals.get(selected));
                    }
                }
            }
        });

        // Add to frame
        add(new JScrollPane(countryList));

        // Frame settings
        setTitle("Country Capital List");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}
