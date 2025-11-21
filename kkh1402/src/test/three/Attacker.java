package test.three;

public class Attacker extends AbstractMonster {

	protected Attacker(String name, int hp, int attack, int defense) {
		super(name = "Attacker", hp = 30, attack = 20, defense = 10);
		
	}

	public int attack() {
		
		System.out.println("Attacker - Very Strong Attack");
		return attack;
	}
	
}
