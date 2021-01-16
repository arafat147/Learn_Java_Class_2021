package basicJava;

public class Static {

	public static String stName = "Alex";
	static String stFatherName;

	String stAddress = "New York";
	int age;

	static void tvDisplay() {
		System.out.println("Tv is displaying 4k UHD Picture");
	}
	
	int num1 = 20;
	int num2 = 10;
	
	public static void main(String[] args) {
		Static.stName = "William";
		System.out.println(stName);
		Static.stFatherName = "Alex SR";

		Static obj = new Static();

		System.out.println(obj.stAddress);

		obj.age = 30;
		System.out.println(obj.age);
		tvDisplay();
		
		System.out.println(obj.num1+obj.num2);
		
		
	}

}
