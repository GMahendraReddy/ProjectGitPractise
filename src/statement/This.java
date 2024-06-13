package statement;

public class This {
	
	This(int a) {
		this(1,2);
		System.out.println(a);
		
	}

	This(int a, int b) {
		this(1,2,3);
		System.out.println(a+b);
		
	}
	This(int a, int b,int c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		

		new This(1);
		
	}

}
