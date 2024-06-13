package methodcontructoroverloading;

public class MethodConstructor {
	
	static void add(int a) {
		System.out.println(a);
	}
	void add(String a, int b) {
		System.out.println(a);
	}
	MethodConstructor(char a){
		System.out.println(a);

}
	MethodConstructor(int a){
		int c= a+10;
		System.out.println(c);
	}
	

	public static void main(String[] args) {

		add(40);
		MethodConstructor mc = new MethodConstructor('s');
		mc.add("Mahi",1);
		new MethodConstructor(1);

	}

}
