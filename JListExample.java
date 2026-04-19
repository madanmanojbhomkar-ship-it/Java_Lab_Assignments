/* 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, 
 * Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList
 *  and display them on console whenever the countries are selected on 
 *  the list.   */





package fiveA;



import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListExample extends JFrame {

    private JList<String> countryList;

    public JListExample() {

        // Create model and add elements
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");

        // Create JList
        countryList = new JList<>(listModel);

        // Add selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    List<String> selectedValuesList = countryList.getSelectedValuesList();
                    System.out.println(selectedValuesList);
                }
            }
        });

        // Add JList inside scroll pane
        add(new JScrollPane(countryList));

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JList Example");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListExample();
    }
}