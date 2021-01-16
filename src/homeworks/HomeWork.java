package homeworks;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		// HW-1: Write a Java program to print the sum of two numbers. Test Data: 84 +
		// 35 Expected Output : 119 *
		int number1 = 84;
		int number2 = 35;
		int total = number1 + number2;
		System.out.println("Total value is " + total);

		// HW-2: Write a Java program to divide two numbers and print on the screen.Test
		// Data : 50/3 Expected Output : 16 *

		int num1 = 50;
		int num2 = 3;
		int finalResult = num1 / num2;
		System.out.println("Division value is " + finalResult);

		// HW-3: Write a Java program that takes two numbers as input and display the
		// product of two numbers.
		// Test Data:Input first number: 25 Input second number: 5 Expected Output : 25
		// x 5 = 125 *

		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number");
		int input1 = sc.nextInt();
		System.out.println("Input second number");
		int input2 = sc.nextInt();
		System.out.println("Multiply of two number is " + input1 * input2);

		sc.close();

	}

}
