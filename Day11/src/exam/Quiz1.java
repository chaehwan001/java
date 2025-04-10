package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int score[] = null;
		int total = 0;
		double avg = 0;
		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("| 1.학생수 | 2.점수입력 | 3.점수확인 | 4.분석 | 5.종료 |");
			System.out.println("---------------------------------------------------");
			System.out.printf(">> " );
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.printf("학생 수: ");
				int num = sc.nextInt();
				score = new int [num];
				} else if (menu == 2) {
					System.out.println("[ 학생들의 점수 입력 ]");
					for (int i = 0; i < score.length; i++ ) {
						System.out.printf(i+1+")학생들의 점수: ");
						score[i] = sc.nextInt();
					}	
				} else if (menu == 3) {
					for (int i = 0; i < score.length; i++ ) {
						System.out.println(i+1+")학생들의 점수:"+score[i]);
					}
				} else if (menu == 4) {
					int max = 0;
					int min = 0; // score [0]
						for (int i = 0; i < score.length; i++) {
							// 루프를 돌면서 max값과 요소에 저장되어 있는 값을 비교한다
							// 만약 요소에 저장되어 있는 값이 크다면 
							if (max < score[i]) {
								max = score[i]; // max 변수에 요소에 있는 값을 저장
							}
							if ( min > score[i]) {
								min = score[i];
							} else if (min == 0) {
								min = score[i];
								
							}
							total = total + score[i];
							avg = total/score.length;
							}
					System.out.println("학생들의 최고점수: " + max);
					System.out.println("학생들의 최소점수: " + min);
					System.out.println("학생들의 평균 점수: "+ avg);
						
				} else if (menu== 5) {
					break;
				}
			
	
	}
  }
}

/*
 * 	for (int i = 0; i < arr1.length; i++ ) {
						System.out.printf("학생들의 점수: ");
						int stsc = sc.nextInt();
						arr1 [i] = stsc;
					}
					for (int i = 0; i < arr1.length; i++ ) {
						System.out.println(i+")번 학생 점수"+arr1[i]);
					}	
 */

