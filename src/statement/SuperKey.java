package statement;

class Parents{
	
	void mahi() {
		
		int b = 1;
		System.out.println(b);
		
	}
}

public class SuperKey extends Parents {
	
	void mahi() {
		char b = 'c';
		System.out.println(b);
		super.mahi();
	}
	
	
	public static void main(String[] args) {
		
		SuperKey s = new SuperKey();
		s.mahi();

	}

}
