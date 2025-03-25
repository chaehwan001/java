package exam;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 중첩(if)
		 * - if문안에 또 다른 if문을 넣을 수 있다.
		 * 
		 * if(조건){
		 * 		if(조건) {
		 * 
		 * 		{ else {
		 * 
		 * 
		 * 		}
		 * 
		 * 	}
		 * }
		 */
		int score = 59;
		if(score >=90) {
			if(score >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (score >= 80) {
			if(score >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (score >= 70) {
			if(score >=75) {
				System.out.println("c+");
			} else {
				System.out.println("C");
			}
		} else if (score >= 60) {
			if (score >=65) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		}else {
			System.out.println("F학점....");
		}
	}
}
	
