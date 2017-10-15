package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {

	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class

		Stack<Double> stack = new Stack<Double>();
		Random random = new Random();

		// 2. Use a loop to push 100 random doubles between 0 and 100 to the
		// Stack.

		for (int i = 0; i < 100; i++) {

			stack.push(random.nextDouble() * 100);

		}

		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.

		String numberOne = JOptionPane.showInputDialog("Enter in a number between 0 - 100");
		int numberOneInt = Integer.parseInt(numberOne);
		String numberTwo = JOptionPane.showInputDialog("Enter another number between 0 - 100");
		int numberTwoInt = Integer.parseInt(numberTwo);

		// int bigNumber;
		// int smallNumber;

		// if(numberOneInt >= numberTwoInt){
		// bigNumber = numberOneInt;
		// smallNumber = numberTwoInt;
		// }else if(numberOneInt <= numberTwoInt){
		// bigNumber = numberTwoInt;
		// smallNumber = numberOneInt;
		// }

		// 4. Pop all the elements off of the Stack. Every time a double is
		// popped that is
		// between the two numbers entered by the user, print it to the screen.

		for (int i = 0; i < 100; i++) {
			// stack.pop();

			Double popped = stack.pop();
			if (numberOneInt > numberTwoInt && popped > numberTwoInt && popped < numberOneInt) {
				String poppedList = popped + "";

				System.out.println("Number One: " + numberOneInt + "\n" + "Number Two: " + numberTwoInt + "\n" + "\n"
						+ "Elements between " + numberOneInt + " and " + numberTwoInt + ":");
				System.out.println(poppedList);

			} else if (numberOneInt < numberTwoInt && popped < numberTwoInt && popped > numberOneInt) {

				System.out.println(popped);

			} else {

			}
		}

		// else if (numberTwoInt > numberOneInt && stack.pop() > numberOneInt &&
		// stack.pop() < numberTwoInt) {

		// System.out.println("hello");

		// } else {

		// System.out.println("nope");

		// }

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
