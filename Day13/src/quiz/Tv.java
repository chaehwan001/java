package quiz;

public class Tv {
	public String name;
	public int year;
	public int size;
	
	public Tv(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}
		
	public void show() {
		System.out.println(this.name + "에서 만든 " + this.year +"년형 "+ this.size + "인지 TV" );
		
	}
   
}
