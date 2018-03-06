package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	Stack<String> key = new Stack<String>();
	Stack<String> lastValues = new Stack<String>();
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String last = "";
	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo();
		tur.panel.add(tur.label);
		tur.frame.add(tur.panel);
		tur.frame.setVisible(true);
		tur.frame.setSize(100, 50);
		tur.frame.addKeyListener(tur);
		tur.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tur.label.setText(""+tur.key);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		String temp = "";
		if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
			if (!key.isEmpty()) {
				last = key.pop();
				lastValues.push(last);
			}
		}
		else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			if (key.isEmpty()) {
				last = lastValues.pop();
				key.push(last);
				last = "";
			}
		}
		else {
			key.push(""+e.getKeyChar());
			System.out.println(e.getKeyChar());
		}
		for (String s: key) {
			temp += s;
		}
		label.setText(temp);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
