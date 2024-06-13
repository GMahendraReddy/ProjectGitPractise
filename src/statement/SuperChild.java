package statement;

class Parent{
	
	Parent(int a){
		System.out.println("Parent");
	}
}

public class SuperChild extends Parent{
	
	SuperChild(){
		super(1);
		
		System.out.println("child");
	}

	public static void main(String[] args) {

		System.out.println("Mainchild");
		new SuperChild();
		

	}

}
