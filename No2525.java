package beakjoon;

import java.util.Scanner;

public class No2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int time = scan.nextInt();

		if (time > 60) {
			int resultHour = time / 60;
			int resultMinute = time % 60;
			hour += resultHour;
			minute += resultMinute;
			
			if (minute >= 60) {
				hour += minute / 60;
				minute = minute % 60;
			}
		} else {
			minute += time;
			if (minute >= 60) {
				hour += minute / 60;
				minute = minute % 60;
			}
		}
		
		if(hour >= 24) {
			hour = hour%24;
		}
		
		System.out.println(hour + " " + minute);
	}

	
	
}
