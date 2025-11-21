package lalal;

interface Printable {
	
	void print();

}

interface Scannable {
	void scan();
}

class MultiFuntionPrinter implements Printable, Scannable {
	
	@Override
	public void print() {
		System.out.println("문서를 출력합니다.");
	}
	
	@Override
	public void scan() {
		System.out.println("문서를 스캔합니다.");
	}
	
}