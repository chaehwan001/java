package exam;

public class Example2 {
	public static void main(String[] args) {
		// 실수 표현
		double a = 1.1;
		System.out.printf("%f\n",a);
		
		// 원하는 소수점 자리까지 출력가능
		System.out.printf("%.1f\n",3.141592);
		System.out.printf("%.2f\n",3.141592);
		System.out.println();
		System.out.printf("%.3f",3.141592);
		System.out.println();
		
		// 문자열
		String str = "Hello Java";
		System.out.printf("%s\n",str);
		//문자
		char c = 'A';
		System.out.printf("%c",c);
	}

}
