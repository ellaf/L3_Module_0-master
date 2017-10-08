package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
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
	
	
	HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton("Add Entry");
	JButton buttonTwo = new JButton("Search by ID");
	JButton buttonThree = new JButton("View List");
	JButton buttonFour = new JButton("Remove Entry");
	
	public static void main(String[] args) {
		
	LogSearch logsearch = new LogSearch();
	logsearch.setup();
		
		
	}
	
	void setup(){
		
		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		panel.add(buttonFour);
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		buttonFour.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == buttonOne) {
			
			String id = JOptionPane.showInputDialog("Please enter an ID number.");
			int idInt = Integer.parseInt(id);
			String name = JOptionPane.showInputDialog("Please enter a name.");
			hashmap.put(idInt, name);
			
		}
		if(e.getSource() == buttonTwo) {
			
		String searchedId = JOptionPane.showInputDialog("Please enter the ID you want to search.");
		int searchedIdInt = Integer.parseInt(searchedId);
		if(hashmap.keySet().contains(searchedIdInt)) {
			
			JOptionPane.showMessageDialog(null, "That is the ID of: " + hashmap.get(searchedIdInt) + ".");
			
			
		}else{
			
			JOptionPane.showMessageDialog(null, "I'm sorry, that ID does not exist.");
			
		}
			
		}
		if(e.getSource() == buttonThree) {
			
			String idList = "";
			
			for (Integer i : hashmap.keySet()) {
				
				idList += "ID: " + i + "   Name: " + hashmap.get(i) + "\n";
				
			}
	
			JOptionPane.showMessageDialog(null, idList);
			
			
		}
		if(e.getSource() == buttonFour) {
			
			String removeEntry = JOptionPane.showInputDialog("Please enter the ID you'd like to remove.");
			int removeEntryInt = Integer.parseInt(removeEntry);
			if(hashmap.keySet().contains(removeEntryInt)){
				
			hashmap.remove(removeEntryInt);
			JOptionPane.showMessageDialog(null, "That ID has been removed.");
				
			}
			
			
		}
		
	}

	
}
