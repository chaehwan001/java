package exam;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 랜덤 함수를 이용해 10개의 수를 추출하여 (1~30까지 랜덤숫자)
		 * list에 저장한 후 저장된 값들 중 최대값과 최소값을 구하는 코드 작성
		 */
		List<Integer> randomList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int temp = (int)(Math.random() * 30) + 1;
			randomList.add(temp);
		}
		System.out.println(randomList);
		int max = Collections.max(randomList);
		int min = Collections.min(randomList);
		
		System.out.println("최대값 " + max);
		System.out.println("최소값 " + min);
	}
}
