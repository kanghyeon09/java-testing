package exam1029;

public class Sandisk implements Usb {

	long size;
	long currentSize;
	
	public Sandisk() {
		this(8);
	}
	
	public Sandisk(int giga) {
		size = giga * 1073741824;
		currentSize = 0;
	}
	
	
	@Override
	public String read() {
		return currentSize + " 사용 ";
	}

	@Override
	public void write(String data) {
		int len = data.length();
		if(size - currentSize >= len) {
		currentSize += data.length();
	}
}
}
