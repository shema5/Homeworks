package assignments1;
import java.util.Scanner;
public class Alphabet1 {
	public static void main(String[] args) {
	System.out.println("Input the Alphabet: ");
		
	Scanner input = new Scanner(System.in);
	String letter = input.next().toLowerCase();
	
	if(letter.length()>1) {
		System.out.println("Error. Enter letter");
	}
	else if((letter.charAt(0)=='a') || (letter.charAt(0)=='e') || (letter.charAt(0)=='i')
			|| (letter.charAt(0)=='o') || (letter.charAt(0)=='u')){
		System.out.println("It is a vowel letter");
	}
	else {
		System.out.println("It is a Consonant.");
	}
	}

}
