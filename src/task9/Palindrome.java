package task9;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
        String word = scanner.nextLine();
scanner.close();
boolean isPalindrome = true;
int len = word.length();
for(int i=0; i<len/2; i++) {
	if (word.charAt(i) != word.charAt(len - 1 - i)) {
        isPalindrome = false;
        break;
	
}
	}
if (isPalindrome) {
    System.out.println(word + " is a palindrome.");
} else {
    System.out.println(word + " is not a palindrome.");
}

}
}
