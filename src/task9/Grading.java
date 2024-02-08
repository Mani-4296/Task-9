package task9;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Mark: ");
        int mark = scanner.nextInt();	
        scanner.close();
        char Grade = 0;

        if(mark> 100) {
	        System.out.println("Invalid Input");
	        return;
	        }
        else if(mark== 100) {
		Grade = 'S';
        }
		else if(mark>=90) {
			Grade = 'A';
}		else if(mark >=80) {
			Grade = 'B';
}		else if(mark >=70) {
			Grade = 'C';
}		else if(mark >=60) {
			Grade = 'D';
}		else if(mark >=50) {
			Grade = 'E';
}		else if(mark <50) {
			Grade = 'F';
}	  
        System.out.println("Your Grade is: " + Grade);

}
	}
