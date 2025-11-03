package constructorexample;

public class BookPro {
	
	String title;
	String author;
	double price;
	int stock;
	
	public BookPro() {
		title = "소년이 온다.";
		author = "한강";
		price = 3200.00;
		stock = 1;
	}
	
	public BookPro(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = 1;
	}
	

	public BookPro(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	public double getDiscountPrice(double percentage) {
		if(percentage > 0) {
			throw new IllegalArgumentException("할인율은 0 이상이어야 합니다.");
		}
		return price * (1 - percentage / 100.0);
	}
	
	public boolean sell(int quality) {
		if(quality <= 0) {
			
		}
	}

}
