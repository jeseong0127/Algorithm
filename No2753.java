package beakjoon;

import java.util.Scanner;

public class No2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		while (4000 >= year && year >= 1) {
			if (year % 4 == 0 && year % 100 == 0) {
				System.out.println("1");
				break;
			} else {
				System.out.println("0");
				break;
			}
		}  
	}

}
