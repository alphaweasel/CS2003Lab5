package palindrome;

import java.util.Scanner;

public class Checker{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		System.out.println(isaPalindrome(word.toLowerCase()));
	}
	
	public static boolean isaPalindrome(String in) {
		if(in.length() == 1)
			return true;
		else if(in.charAt(0) == in.charAt(in.length()-1))
			return isaPalindrome(in.substring(1,in.length()-1));
		else
			return false;
	}
	
	
}