package exam;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 3자리 정수를 입력받아 백의 자리 이하를 버리는 코드를 작성하시오
		 * 예를 들어 입력받은 값이 456이라면 400이 되고 111이라면 100이 됩니다 
		 */
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("3자리 정수를 입력하세요: ");
		int num = sc.nextInt();
		System.out.println("값은: "+ num/100*100);
		
		/*
		 * 원화를 입력받아 달러로 바꾸는 프로그램을 작성하세요
		 * $1 = 1100원으로 가정하세요 !!
		 * 원을 입력하세요 >> 3300
		 * 3300원은 $3.0 입니다.
		 */
		
		System.out.println("원을 입력하세요 >> ");
		int money = sc.nextInt();
		double dollar = money / 1100;
		System.out.printf("%d원은 $%.1f 입니다.",money, dollar);
		
	}
}
