package exam1105;

public class MemoExample {

	public static void main(String[] args) {
		MemoRepository repository;
		
		repository = new LocalRepository();
		
		repository.addMemo("1", "hello");
		
		repository = new NetworkRepositoty();
		
		repository.addMemo("1", "hello");

	}

}
