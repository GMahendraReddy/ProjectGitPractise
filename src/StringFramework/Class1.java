package StringFramework;

public class Class1 {

	public static void main(String[] args) {
		
		String a = "  Mahi";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.indexOf('a'));
		System.out.println(a.substring(2));
		System.out.println(a.substring(1, 3));
		System.out.println("hi");
		for(int i =0 ; i<=5;i++) {
		char b = a.charAt(i);
		
		System.out.print(b);
		}
	}

}
