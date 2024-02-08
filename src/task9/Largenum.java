package task9;

import java.util.Scanner;

public class Largenum {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = value.nextInt();
		System.out.println("Enter second number: ");
		int b = value.nextInt();
		System.out.println("Enter third number: ");
		int c = value.nextInt();
		value.close();
		
		int max =a;
				if(b>max) {
					max =b;
				}
				if(c>max) {
					max=c;
				}
System.out.println("The largest number among " + a + ", " + b + ", " +c +" is :" + max);
	}

}
