package exam;

public class Example09 {
	public static void main(String[] args) {
		/*
		 * char(형)
		 *  - 문자그대로를 저장하는 것이 아닌, 유니코드라는 숫자로 값을 변환하여 저장
		 *  
		 * 유니코드란? 전 세계의 문자를 일관되게 표현할 수 있도록 설계된 표준 
		 * 
		 *
		 */
		char ga = '가';
		char na = '나';
		char a = 'A';
		char b = 'B';
		
		System.out.println(ga);
		System.out.println(na);
		System.out.println(a);
		System.out.println(b);
		
		int alphabet1 = 'A';
		int alphabet2 = 'B';
		int alphabet3 = 'a';
		int alphabet4 = 'b';
		System.out.println(alphabet1);
		System.out.println(alphabet2);
		System.out.println(alphabet3);
		System.out.println(alphabet4);
		
		char char1 = 65; System.out.println(char1);
		char char2 = 66; System.out.println(char2);
	}
}
