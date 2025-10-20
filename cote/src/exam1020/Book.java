package exam1020;

public class Book {
	
	private String title;
	private String author;
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getIsbm() {
		return isbm;
	}


	public void setIsbm(String isbm) {
		this.isbm = isbm;
	}


	private int price;
	private String isbm;
	

	public Book(String title, String author, String isbm) {
		this(title, author, isbm, 0);
	}
	

	public Book(String title, String author, String isbm, int price) {
		this.title = title;
		this.author = author;
		this.isbm = isbm;
		this.price = price;
			
	}

}
