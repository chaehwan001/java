package exam;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		int sum = 0;
		while(true) {
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔금 |4.종료 |");
		System.out.println("-----------------------------");
		System.out.println("메뉴입력");
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();

		if (key==1) {
			System.out.println("예금액:>>");
			int in = sc.nextInt();
			sum = sum + in;
		} else if (key == 2){
			System.out.println("출금액:");
			int ex = sc.nextInt();
			if (sum > ex) {
				sum = sum - ex;
			System.out.println("잔고: "+(sum));
			} else if (sum < ex) {
				System.out.println("잔액이 부족합니다.");
			}
		} else if (key == 3) {
			System.out.println("잔금 >> "+ sum);
		} else if (key == 4) {
			System.out.println("프로그램을 종료");
			break;
		}
			
			
		}
	}
}
