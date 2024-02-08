package task9;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
        String word = scanner.nextLine();
scanner.close();
String revstring= "";
for(int i= word.length() -1; i>=0; i--) {
	revstring += word.charAt(i);
}
System.out.println("Revered String char: " + revstring);
	}

}
