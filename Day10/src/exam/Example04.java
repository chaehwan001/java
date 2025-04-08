package exam;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * 길이가 5인 배열을 입력받아 인덱스가 3번인곳은 출력하지 말고 나머지만 출력
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [5];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
}
