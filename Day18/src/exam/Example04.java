package exam;

public class Example04 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//각 문서열 변수가 있는 위치값을 출력
		System.out.println("Str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("Str2 hashCode : " + System.identityHashCode(str2));
		System.out.println("Str3 hashCode : " + System.identityHashCode(str3));
		
	}
}
