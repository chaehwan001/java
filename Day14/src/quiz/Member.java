package quiz;

class Mem{
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	private String name;
	private int point;
	

	
}

public class Member {
	public static void main(String[] args) {
		/*
		 * 회원(Member) 클래스는 회원 아이디를 나타내는 id(문자열)과 
		 * 회원 이름을 나타내는 name(문자열), 회원의 point를 나타내는 point 필드를 가지고 있다
		 * 메소드는 각 회원의 필드의 값들을 변경 혹은 입력하는 set 메소드와 get 메소드를 가지고 있다
		 * 
		 * 모든 필드는 외부에서 직접 접근하여 값을 변경하거나 
		 * 얻지 못하도록 private
		 * 으로 접근 제한을 막으세요
		 * 
		 * 실행결과)
		 * 아이디 : eeee
		 * 이름 : 윤준형
		 * 포인트 : 20000
		 */
		Mem member = new Mem();
		member.setId("eeee");
		member.setName("윤준형");
		member.setPoint(20000);
		
		System.out.println("실행결과)");
		System.out.println("아이디: "+ member.getId());
		System.out.println("이름 : " + member.getName());
		System.out.println("포인트 : " +member.getPoint());
	}
}

