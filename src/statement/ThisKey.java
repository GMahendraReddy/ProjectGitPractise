package statement;

public class ThisKey {
	
	int a;
	double b;
	String c;
	
	void main(int a,double b,String c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
		
	}

	public static void main(String[] args) {
		

		ThisKey t = new ThisKey();
		t.main(1, 1.1, "Mahi");
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		
	}

}
