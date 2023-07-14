
public class NullExample {
	
	public static void main(String[] args) {
		int num = 100/0;
		
		System.out.println(num);
	}

	public static void main2(String[] args) {
		String str1 = "Hello";
		String str2 = "Hi";
		String str3 = null;
		
		str3 = "World";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		
		System.out.println("Program End ..");

	}

}
