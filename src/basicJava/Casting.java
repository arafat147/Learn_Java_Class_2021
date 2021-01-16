package basicJava;

public class Casting {

	public static void main(String[] args) {
		
		double price = 1299.99;
		//desired datatype = (desired converting datatype) variableName;
		int newPrice = (int) price;
		System.out.println(newPrice);
		
		int age = 25;
		double newAge = (double) age;
		System.out.println(newAge);
		
		String ssn = "123456";
		int newSsn = Integer.parseInt(ssn);
		System.out.println(newSsn);
		int newSsn2 = Integer.valueOf(ssn);
		System.out.println(newSsn2);
		
		int salary = 25000;
		String s = String.valueOf(salary);
		System.out.println(s);
		
		
	}

}
