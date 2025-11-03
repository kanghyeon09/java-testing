package constructorexample;

public class Book {
	
	String title;
	String author;
	double price;
	
	public Book() {
		this.title = "어린 왕자";
		this.author = "젠슨 황";
		this.price = 0.0;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.price = 0.0;
	}
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void PrintInfo() {
		System.out.println("제목 : " + title + "저자 : " + author + "가격 : " + price);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.PrintInfo();
		
		Book b2 = new Book("자바 정복", "김자바");
		b2.PrintInfo();
		
		Book b3 = new Book("파이썬 정복", "이파이", 30000.0);
		b3.PrintInfo();
		
	}

}
