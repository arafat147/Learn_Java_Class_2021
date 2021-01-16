package basicJava;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter your name");
		String name = input.nextLine();
		System.out.println("your name is " + name);
		
		
		System.out.println("Enter your age ");
		int age = input.nextInt();
		System.out.println("Your age is " + age);
		
		input.close();
		

	}

}
