package human;

public class HumanMain {
	public static void main(String[] args) {
		Human human = new Human();
		human.name = "임채환";
		human.age = 25;
		human.address = "부산시 영도구";
		
		System.out.println("이름 : "+ human.name);
		System.out.println("나이 : "+ human.age);
		System.out.println("주소 :" + human.address);
	}
}
