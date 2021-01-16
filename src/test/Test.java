package test;

import basicJava.Static;

public class Test {

	public static void main(String[] args) {
		
		Static.stName="Alex";//re assigning variable value.
		// we are able to call this variable using the class name cz the variable has public and static keywords in Static class. 
		// meaning, if a variable has public and static keywords ; it can be accessible from other packages as well.
		
		//but if the variable was only static keyword, we can access it from other packages of the project. it can be accessible from the same package classes.
		
		

	}

}
