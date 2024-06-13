package Scanner;

import java.util.Scanner;

public class Scaddsubmuldiv {
	
	static void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter value a");
		int a = s.nextInt();
		System.out.println("enter value b");
		int b = s.nextInt();
		System.out.println("The Result is");
		System.out.println(a+b);
	}
static void sub() {
	
	Scanner s1 = new Scanner(System.in);
	System.out.println("enter value a");
	int a = s1.nextInt();
	System.out.println("enter value b");
	int b = s1.nextInt();
	System.out.println("The Result is");
	System.out.println(a-b);
		
	}
static void mul() {
	
	Scanner s2 = new Scanner(System.in);
	System.out.println("enter value a");
	int a = s2.nextInt();
	System.out.println("enter value b");
	int b = s2.nextInt();
	System.out.println("The Result is");
	System.out.println(a*b);
	
}
static void div() {
	Scanner s3 = new Scanner(System.in);
	System.out.println("enter value a");
	int a = s3.nextInt();
	System.out.println("enter value b");
	int b = s3.nextInt();
	System.out.println("The Result is");
	System.out.println(a/b);
	
}

	public static void main(String[] args) {
		System.out.println("add");
		add();
		System.out.println("sub");
		sub();
		System.out.println("mul");
		mul();
		System.out.println("div");
		div();
		
		
	}

}
