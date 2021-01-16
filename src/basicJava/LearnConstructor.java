package basicJava;

public class LearnConstructor {

	public LearnConstructor() {

		System.out.println("hi i am default constructor");

	}

	public LearnConstructor(String name) {

		System.out.println("Student name is " + name);

	}

	String stName;
	int stAge;

	public LearnConstructor(String stName, int stAge) {

		this.stName = stName;
		this.stAge = stAge;

		System.out.println("Student name is " + this.stName + " ." + " And student age is " + this.stAge);

	}

	public static void main(String[] args) {

		LearnConstructor lc = new LearnConstructor();
		LearnConstructor lc2 = new LearnConstructor("Alexa"); // arguement passing.
		LearnConstructor lc3 = new LearnConstructor("Alex", 27);

	}

}
