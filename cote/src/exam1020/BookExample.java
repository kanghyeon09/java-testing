package exam1020;

public class BookExample {

	public static void main(String[] args) {
		
		Book[] books = new Book[3];
		books[0] = new Book("Java", "김자바", "123-456-789");
		books[1] = new Book("Pyton", "김이썬", "987-654-321");
		books[2] = new Book("C#", "김씨샵", "000-111-222");


	for(int i = 0; i < books.length; i++ ) {
		System.out.println("책 : " + (i + 1));
		System.out.println("제목 : " + books[i].getTitle());
		System.out.println("저자 : " + books[i].getAuthor());
		System.out.println("가격 : " + books[i].getPrice());
		System.out.println("ISBM : " + books[i].getIsbm());
		}
	}
}
