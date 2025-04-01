package exam;

public class Example09 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <=100) {
			sum = sum + i;
			i++;
		}
		System.out.println("1~100까지 합계: "+sum);
	}
}
