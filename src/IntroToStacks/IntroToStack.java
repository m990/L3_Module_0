package IntroToStacks;

import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		Stack<Double> d = new Stack<Double>();
		//   Don't forget to import the Stack class
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i=0;i < 99; i++) {
			d.push((double) i);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String d1 = JOptionPane.showInputDialog("Enter a number between 1 and 100: ");
		String d2 = JOptionPane.showInputDialog("Enter a 2nd number between 1 and 100: ");
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
