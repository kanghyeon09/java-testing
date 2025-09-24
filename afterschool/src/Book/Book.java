package Book;

public class Book {
	
	String title;
	String author;
	
	public Book(String title) {
		this(title, "작가미상");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void printinfo() {
		System.out.println("제목: ", + title +", 저자" + author);
	}

}
