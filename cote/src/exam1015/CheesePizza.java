package exam1015;

public class CheesePizza {
	
	public String name;
	public String size;
	int[] prices = {10000, 150000, 20000};
	
	
	public CheesePizza() {
		size = "M";
	}
		
	public CheesePizza(String size) {
		this.size = size;
	}
	
	public void cook() {
		System.out.println(name + size + "를 조리합니다.");
		System.out.println(name + size + "이 완성되었습니다.");
		
	}
	
	public void serve() {
		int price;
		switch(size ) {
		case "S" : price = prices[0];
		case "L" : price = prices[1];
		default : price = prices[1];
		
		/* int price = prices[0];
		 * if(size == "M") price = prices[0];
		 * else if(size = "L") price = prices[1];
		 * 
		 */
		
		System.out.println(name + size + "입니다. 가격" + price);
		}
	}
}