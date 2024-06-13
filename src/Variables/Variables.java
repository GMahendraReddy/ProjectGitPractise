package Variables;

public class Variables {
	
	int a = 10;
	static int c = 50;
	
	void add(int h) {
		
		System.out.println(h);
	}
	
	public static void main(String[] args) {
		
		int a = 100;
		
		int b = 40;
		
		System.out.println(a);
		System.out.println(b);
		Variables f = new Variables();
		System.out.println(f.a);
		System.out.println(c);
		f.add(100);
		
		
		
	}

}
