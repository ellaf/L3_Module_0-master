package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings

		ArrayList<String> george = new ArrayList<String>();

		// Don't forget to import the ArrayList class

		// 2. Add five Strings to your list

		george.add("ramen");
		george.add("microwave popcorn");
		george.add("doughnuts");
		george.add("chick fil a");
		george.add("fried chicken");

		// 3. Print all the Strings using a standard for-loop

		for (int i = 0; i < 5; i++) {
			System.out.println(george.get(i));
		}
		System.out.println(" ");
		// 4. Print all the Strings using a for-each loop
		for (String i : george) {
			System.out.println(i);
		}
		System.out.println(" ");
		// 5. Print only the even numbered elements in the list.

		for (int i = 0; i < 5; i++) {
			String s = george.get(i);
			if (i % 2 == 0)
				System.out.println(s);
		}
		System.out.println(" ");
		// 6. Print all the Strings in reverse order.

		for (int i = 4; i > -1; i--) {

			String b = george.get(i);
			System.out.println(b);

		}
		System.out.println(" ");
		// 7. Print only the Strings that have the letter 'e' in them.

		for (int i = 0; i < 5; i++) {

			String b = george.get(i);
			if (b.contains("e")) {
				System.out.println(b);
			}

		}

	}
}
