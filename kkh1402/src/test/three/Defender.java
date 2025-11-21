package test.three;

public class Defender extends AbstractMonster{

	protected Defender(String name, int hp, int attack, int defense) {
		super(name = "Defenser", hp = 20, attack =13, defense = 25);
	
	}
	
	public int attack() {
		
		System.out.println("Defender - Attack");
		return attack;
		
	}

}
