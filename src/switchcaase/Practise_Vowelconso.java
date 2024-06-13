package switchcaase;

import java.util.Scanner;

public class Practise_Vowelconso {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter");
		char S1 = s.next().charAt(0);
		
		if ((S1>= 'A' && S1<='Z') || (S1>= 'a' && S1<='z')){
		switch(S1){
			
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println("Vowel"); 
		break;
		default : System.out.println("consoonent");
		}
		}
		else {
			System.out.println("Not a alphabet");
		}
		

	}

}
