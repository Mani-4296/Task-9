package task9;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner rownum = new Scanner(System.in);
		System.out.println("Enter row numbers: ");
		int num = rownum.nextInt();
		rownum.close();
		
		int temp = 1;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
			
		}
		

	}

}
