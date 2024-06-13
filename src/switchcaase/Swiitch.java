package switchcaase;

import java.util.Scanner;

public class Swiitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter value");
		String s1 = s.next();	
		
		
		switch(s1){
		
		case "ab" : System.out.println("Male");
		break;
		case "ab1" : System.out.println("Female");
		break;
		default: System.out.println("def");
			
			
		}

	}

}
