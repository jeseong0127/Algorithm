package beakjoon;

import java.util.Scanner;

public class No11720 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//			System.out.println("숫자의 개수를 입력해주세요 (1 ≤ N ≤ 100)");
//			int a = scan.nextInt();
//			System.out.println(a + "개만큼 숫자를 입력해주세요");
//			int sum = 0;
//			for(int i =0; i<a; i++) {
//				int b = scan.nextInt();
//				sum += b;
//			}
//			System.out.println(sum);
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String inputs = sc.next();
		sc.close();
		
		int result = 0;
		for (int i = 0; i < n; ++i) {
			result += Character.getNumericValue(inputs.charAt(i));
			System.out.println(inputs.charAt(i));
		}
		System.out.println(result);
	}
}
