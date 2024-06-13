package methodcontructoroverloading;

public class ParaandNonpara {
	
	static void add(int a) {
		
		System.out.println(a);
	}

	void sub (int a , int b) {
		
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		

		add(100);
		ParaandNonpara s1 = new ParaandNonpara();
		s1.sub(1, 2);
		
	}

}
