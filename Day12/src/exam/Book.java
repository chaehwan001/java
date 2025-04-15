package exam;

public class Book {
	// Alt + Shift + s => get set 자동완성
	// @Getter
	// @Setter
	private String title;
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
