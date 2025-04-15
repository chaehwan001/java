package test1;

public class TestMain1 {
	public static void main(String[] args) {
		Test1 test = new Test1();
		
		// public 접근
		test.public_name = "홍길동";
		System.out.println(test.public_name);
		
		// protected 접근
		test.protected_name = "정 혁";
		System.out.println(test.protected_name);
		
		// default 접근
		test.default_name = "문경구";
		System.out.println(test.default_name);
		
		// private 접근 (같은 클래스내에서만 접근 가능)
		test.setPrivate_name("정@@혁");
		System.out.println(test.getPrivate_name());
	}
}
