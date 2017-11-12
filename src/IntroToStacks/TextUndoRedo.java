package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	Stack<String> orange = new Stack<String>();
	Stack<String> deleted = new Stack<String>();
	String orangeString = "";
	String deletedString = "";
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();

	public static void main(String[] args) {

		TextUndoRedo text = new TextUndoRedo();
		text.setup();

	}

	void setup() {

		frame.setSize(500, 500);
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);

		frame.setVisible(true);
		panel.setVisible(true);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			deleted.push(orange.pop());
			//System.out.println(Arrays.toString(deleted.toArray()));

		}else if(e.getKeyCode() == KeyEvent.VK_SHIFT){
		
		//System.out.println(orangeString);
		if(!deleted.isEmpty()) {
			orange.push(deleted.pop());
		}
		label.setText(orangeString);
		}
		else {
			orange.push(Character.toString(e.getKeyChar()));
		}
		orangeString = "";
		for (int i = 0; i < orange.size(); i++) {
			orangeString += orange.get(i);
		}
		label.setText(orangeString);

		//if(e.getKeyCode() == KeyEvent.VK_TAB) {
		//	orangeString += deleted.pop();
		//	System.out.println(orangeString);
		//	label.setText(orangeString);
		//}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
