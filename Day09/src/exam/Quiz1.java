package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * (int) (Math.random() * 6) + 1;
		 * 무한루프
		 * 
		 */
	
		int computer = (int) (Math.random()*100) +1;
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터가 1~100중 랜덤 숫자 하나를 정합니다. 이 숫자를 맞춰주세요.");
		int count = 0;
		while (true) {
			count++;
			System.out.println("1~100 숫자 입력: ");
			int user = sc.nextInt();
			if (user == computer) {
				System.out.println("정답입니다! "+count +"회 만에 맞췄어요. 정답은 : "+ computer);
				break;
			} else if (user > computer) {
				System.out.println("down");
			} else if (user < computer) {
				System.out.println("up");
			}
			
		}
	}
}
