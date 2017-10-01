package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks
	// the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked,
	// display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame frame = new JFrame("Guestbook");
	JPanel panel = new JPanel();
	JButton addNames = new JButton("Add Names");
	JButton viewNames = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {

		GuestBook book = new GuestBook();
		book.setup();

	}

	void setup() {

		frame.add(panel);
		addNames.addActionListener(this);
		viewNames.addActionListener(this);
		panel.add(addNames);
		panel.add(viewNames);
		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == addNames) {
			String newGuest = JOptionPane.showInputDialog("Who would you like to add to the guest list?");
			names.add(newGuest);
		}
		if (e.getSource() == viewNames) {
			for (int i = 0; i < names.size(); i++) {
				String s = names.get(i);
				System.out.println("Guest #" + (i + 1) + ": " + s);
			}

		}
	}

}
