
public class StringExample {

	public static void main(String[] args) {
		int num = 10;
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 =new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str1));
		
		

	}

}
