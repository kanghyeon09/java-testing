package test.three;

public  abstract class AbstractMonster {
	
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	protected AbstractMonster(String name, int hp, int attack, int defense) {
		
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		
	}
	
	public boolean defense(int attack) {
        if (defense >= attack) {
            
            return true;
        } else {
            
            int damage = attack - defense;
            hp -= damage;
            return false;
        }
    }
	
	public int attack() {
		
		
		return attack;
		
	}
		
}
