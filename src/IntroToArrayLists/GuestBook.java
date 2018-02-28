package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addButton = new JButton();
	JButton viewButton = new JButton();
	ArrayList<String> name = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.frame.setVisible(true);
		gb.frame.setSize(300, 100);
		gb.panel.add(gb.addButton);
		gb.panel.add(gb.viewButton);
		gb.viewButton.setText("View");
		gb.addButton.setText("Add");
		gb.viewButton.addActionListener(gb);
		gb.addButton.addActionListener(gb);
		gb.frame.add(gb.panel);
		gb.name.add("Bob Banders");
		gb.name.add("Sandy Summers");
		gb.name.add("Greg Ganders");
		gb.name.add("Donny Doners");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addButton) {
			System.out.println("Add button pressed");
			String newName = JOptionPane.showInputDialog("Enter a name:");
			name.add(newName);
		}
		else if (e.getSource() == viewButton) {
			String output = "";
			System.out.println("View button pressed");
			for (String n_name: name) {
				output += "Guest #" + name.indexOf(n_name) + ": " +n_name;
				output += "\n";
			}
			JOptionPane.showMessageDialog(null, output);
		}
	}
}
