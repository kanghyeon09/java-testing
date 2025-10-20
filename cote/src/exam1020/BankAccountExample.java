package exam1020;

public class BankAccountExample {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount("김자바", "111234567");
		System.out.println(b.getBalance());
		
		int currentBalance = b.deposit(10000);
		System.out.println(currentBalance);
		System.out.println(b.getBalance());
		
		int finalAccount = b.withdrawal(5000);
		System.out.println(finalAccount);
		
		finalAccount = b.withdrawal(7000);
		System.out.println(finalAccount);
		System.out.println(b.getBalance());
		
		System.out.println(BankAccount.getCount());
		BankAccount b2 = new BankAccount("김파이", "123456789000");
		System.out.println(BankAccount.getCount());
		
		
	}

}
