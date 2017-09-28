package palindrome;

import java.util.Scanner;

public class Checker{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		System.out.println(isaPalindrome(word.toLowerCase()));
	}
	
	public static boolean isaPalindrome(String in) {
		//base case for words with an odd length
		if(in.length() == 1)
			return true;
		//base case for words with an even length
		else if(in.length() == 2 && in.charAt(0) == in.charAt(1))
			return true;
		//recursion
		else if(in.charAt(0) == in.charAt(in.length()-1))
			return isaPalindrome(in.substring(1,in.length()-1));
		//false if the characters do not pass the equality test
		else
			return false;
	}
	
	
}