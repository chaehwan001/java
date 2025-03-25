package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 연산기호에 따라(덧셈(+) 뺄셈(-) 곱셈(*) 나눗셈(/))
		 * 하는 사칙연산을 하는 프로그램을 작성하세요
		 * 
		 * 숫자입력 >> 3
		 * 기호입력 >> +
		 * 숫자입력 >> 3
		 * 결과 >> 6
		 * 
		 * 숫자입력 >> 10
		 * 기호입력 >> %
		 * 숫자입력 >> 5
		 * 기호를 잘못입력하였습니다
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * char a = sc.next().charAt(0);
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력 >> ");
//		int num = sc.nextInt();
//		System.out.println("기호 입력 >>" );
//		String mt =sc.next();
//		sc.nextLine();
//		System.out.println("숫자 입력 >> ");
//		int num2 = sc.nextInt();
//		
//		if (mt.equals("+")) {
//			System.out.println("결과 >> "+(num + num2));
//			
//		} else if(mt.equals("-")){
//			System.out.println("결과 >> "+(num - num2));
//		} else if(mt.equals("*")) {
//			System.out.println("결과 >> "+(num * num2));
//		} else if(mt.equals("/")) {
//			System.out.println("결과 >> "+(num / num2));
//		} else {
//			System.out.println("기호를 잘못입력하였습니다");
//		}
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		System.out.println("기호 입력 >>" );
		char op = sc.next().charAt(0);
		System.out.println("숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		switch(op) {
		case '+':
			System.out.println(num+num2);
			break;
		case '-':
			System.out.println(num - num2);
			break;
		case '*':
			System.out.println(num * num2);
			break;
		case '/':
			System.out.println(num / num2);
			break;
		default:
			System.out.println("기호를 잘못입력하였습니다");
		}
		 
	}
}
