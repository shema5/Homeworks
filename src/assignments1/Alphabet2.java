package assignments1;

import java.util.Scanner;

public class Alphabet2 {
	public static void main(String[] args) {
		System.out.println("Input the Alphabet:");
		Scanner input = new Scanner(System.in);
		String letter = input.next().toLowerCase();
		
		if(letter.length() >1) {
			System.out.println("Error! Please enter a letter.");
		}
		else if((letter.charAt(0) == 'a') || (letter.charAt(0) == 'e') || (letter.charAt(0) == 'i') 
				|| (letter.charAt(0) == 'o') || (letter.charAt(0) == 'u')){
			System.out.println("Input letter is Vowel.");
		}
		
		else {
			System.out.println("Input letter is Consonant.");
		}
		
	}

}
