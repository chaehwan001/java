package exam;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * x && y : x와 y가 모두 참이어야 참
		 * x || y : x와 y 둘중 하나가 참이면 참
		 * !x : 거짓이면 참
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = sc.nextInt();
		boolean card = true;
		
		if (money > 3000 || card ) {
			System.out.println("택시 타셈");
		} else {
			System.out.println("걸어가셈");
		}
		
		
	}
}
