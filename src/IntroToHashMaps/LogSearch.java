package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton search = new JButton();
	JButton view = new JButton();
	JButton remove = new JButton();
	String output;
	HashMap<Integer, String> idHash = new HashMap<Integer, String>();
	public static void main(String[] args) {
		LogSearch ls = new LogSearch();
		ls.createGui();
	}
	void createGui() {
		panel.add(add);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(100, 200);
		add.setText("Add");
		add.addActionListener(this);
		search.setText("Search");
		search.addActionListener(this);
		view.setText("View");
		view.addActionListener(this);
		remove.setText("Remove");
		remove.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		output = "";
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			String id = JOptionPane.showInputDialog("Enter a id: ");
			String name = JOptionPane.showInputDialog("Enter a name: ");
			idHash.put(Integer.parseInt(id), name);
		}
		else if (e.getSource() == view) {
			for (String name: idHash.values()) {
				output += name;
				output += "\n";
			}
			JOptionPane.showMessageDialog(null, output);
		}
		else if (e.getSource() == search) {
			String id = JOptionPane.showInputDialog("Enter an id: ");
			for (int f_id: idHash.keySet()) {
				if (f_id == Integer.parseInt(id)) {
					JOptionPane.showMessageDialog(null, idHash.get(f_id));
				}
				else {
					JOptionPane.showMessageDialog(null, "That id doesn't exist");
				}
			}
		}
		else if (e.getSource() == remove) {
			String id = JOptionPane.showInputDialog("Enter and id to remove: ");
			idHash.remove(Integer.parseInt(id));
		}
	}
		
}
