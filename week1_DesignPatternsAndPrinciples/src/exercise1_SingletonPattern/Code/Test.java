package exercise1_SingletonPattern.Code;

public class Test {

	public static void main(String[] args) {
		Logger obj1 = Logger.getInstance();
		System.out.println(obj1);
		Logger obj2 = Logger.getInstance();
		System.out.println(obj2);
	}
}
