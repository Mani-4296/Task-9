package task9;

import java.util.Scanner;

public class HotelTarrif {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter stay month in number: ");
		int month = value.nextInt();
		System.out.println("Enter room rent per day: ");
		double rent = value.nextDouble();
		System.out.println("Enter no of stay days: ");
		int days = value.nextInt();
		value.close();
		
		double total;
		
		switch(month) {
        case 4:
        case 5:
        case 6:
        case 11:
        case 12:
            total = rent * days * 1.20;
            break;
        default:
            total = rent * days;
    }
		String totalfinal = String.valueOf((double)Math.round(total * 100) / 100);
		System.out.println("Hotel tariff to be paid: " + totalfinal);
	}

}
