package exam1015;

public class BroccoliPizza {
	
	public String name;
	public int[] prices;
	public String size;
	public String toppings;
	
	public BroccoliPizza() {}
	public BroccoliPizza(String name, int[] prices, String size, String toppings) {
		this.name = name;
		this.prices = prices;
		this.size = size;
		this.toppings = toppings;

		
	}
	
	public void cook() {
		System.out.println(name + toppings + "을 추가합니다.");
		System.out.println(name + size + "를 조리합니다.");
		System.out.println(name + size + "이 완성되었습니다.");
		
	}
	
	public void serve() {
		int price;
		switch(size ) {
		case "S" : price = prices[0];
		case "M" : price = prices[1];
		default : price = prices[1];
		
		System.out.println(name + size + "입니다. 가격" + price);
		}
	}

}
