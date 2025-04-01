package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 수를 입력받아 그 수의 구구단을 출력
		 * 
		 * 입력 >> 5
		 * 출력)
		 * 5 x 1 = 5
		 * 5 x 2 = 10
		 * 5 x 3 = 15
		 * ......
		 * 5 x 9 = 45
		 * 
		 * 입력 >> 7
		 * 7 x 1 = 7
		 * 7 x 2 = 14
		 * ........
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int i= sc.nextInt();
		
		for (int k=0; k <=9; k++) {
			System.out.println(i +"x"+ k +"=" +(i*k) );				
			}
		}
		
	
}
