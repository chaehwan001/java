package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 세 정수를 입력받아 입력받은 수 중 짝수만 출력하세요
		 * 
		 * 실행예시)
		 * 입력 >> 3 2 7
		 * 결과>> 2
		 * 
		 * 입력 >> 2 1 4
		 * 결과 >> 2 4
		 * 
		 * 입력 >> 2 2 3
		 * 결과 >> 2 2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a%2 ==0) {
			System.out.println(a);
		}
		if(b%2 ==0) {
			System.out.println(b);
		}
		if(c%2==0) {
			System.out.println(c);
		}
	}
}
