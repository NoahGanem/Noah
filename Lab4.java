/*-------------------------------------------------------------
// AUTHOR: Noah Ganem
// FILENAME: Lab4.java
// SPECIFICATION: utilizes switch and loops do complete 3 different operations
// FOR: CSE 110- Lab #4
// TIME SPENT: 25 min
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab4 {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String args[]) {
		do {
			displayMenu();
			int operation = keyboard.nextInt();
			switch (operation) {
			case 1:
				summation();
				break;
			case 2:
				factorial();
				break;
			case 3:
				leftmost();
				break;
			case 4:
				keyboard.close();
				System.out.println("Bye");
				System.exit(0);
				break;
			}
		} while (1 > 2);
	}

	public static void displayMenu() {
		System.out.println("Please choose one option from the following menu:");
		System.out.println("1) Calculate the sum of integers from 1 to m");
		System.out.println("2) Calculate the factorial of a given numbe");
		System.out.println("3) Display the leftmost digit of a given number");
		System.out.println("4) Quit ");
	}

	public static void summation() {
		System.out.print("Enter a number: ");
		int m = keyboard.nextInt();
		int j = 0;
		for (int i = 1; i < (m + 1); i++) {
			j = j + i;
		}
		System.out.println("The sum of 1 to " + m + " is " + j);
		System.out.println("");
	}

	public static void factorial() {
		System.out.print("Enter a number: ");
		int m = keyboard.nextInt();
		int j = 1;
		for (int i = 0; i < (m); i++) {
			j = (m - i) * j;
		}
		System.out.println("The factorial of " + m + " is " + j);
		System.out.println("");
	}

	public static void leftmost() {
		System.out.println("Enter a number: ");
		int m = keyboard.nextInt();
		String mString = Integer.toString(m);
		String mArray[] = mString.split("");
		System.out.println("The leftmost digit of " + m + " is " + mArray[0]);
		System.out.println("");
	}
}
