package RPG;

abstract class Charactor {
	
	String name;
	int hp, atk, def;
	
	public Charactor(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	abstract void attack(Charactor target);
	
	boolean die_or_alive() {
		return hp > 0;
	}

	
	void damage(int dmg) {
		int realDammage = Math.max(0, dmg - def);
		hp -= realDammage;
		System.out.println(name + "이(가)" + realDammage + "피해를 입음 (HP: "+ hp + ")"); 
	}
	
	class Warrior extends Charactor {

		public Warrior(String name) {
			super(name, 120, 15, 5);
		}
		
		@Override
		void attack (Charactor target){
			System.out.println(name + "전사가 칼로 공격을 합니다. 으라차차~ ");
			target.damage(atk);
		}
		
		
	}

	class Mage extends Charactor {
		
		public Mage(String name) {
			super(name, 120, 15, 5);
		}
		
		@Override 
		void attack (Charactor target) {
			System.out.println(name + "마법사가 마법으로 공격합니다. 오잉크");
			target.damage(atk);
		}
	}
	
	class Archer extends Charactor {
		
		public Archer(String name) {
			super(name, 120, 15, 5);
		}
		
		@Override
		void attack (Charactor target) {
			System.out.println(name + "궁수가 활을 쏴서 공격을 합니다. 와라우");
			target.damage(atk);
		}
	}
	
	class Monster {
		String name;
		int hp;
		int atk;
		void attack(Charactor target) {
			
		}
	}
	
	void Monster(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	void attack1(Charactor c) {
		System.out.println(name + "이(가) 공격!");
		c.takeDamage(atk);
	}
	
	void takeDamage(int dmg) {
		hp -= dmg;
		System.out.println(name + "이(가)" + dmg + "피해를 입음!(HP : " + hp + ")");
	}
	
	boolean die_or_alive1() {
		return hp > 0;
	}
	
	class Fucking_strong_monster extends Monster {
		
		public Fucking_strong_monster(String name) {
			super();
		}
		
		@Override
		void attack (Charactor target) {
			System.out.println("존나 쌘 몬스터가 공격합니다. 와르르");
		}
	}
	
	class StickyStickySlime extends Monster {
		
		public StickyStickySlime(String name) {
			super();
		}
		
		@Override
		void attack (Charactor target) {
			System.out.println("끈적끈적 슬라임이 공격합니다. 와왕왕 와왕왕");
		}
	}
	
	class Very_greeny_pig extends Monster {
		
		public Very_greeny_pig (String name) {
			super();
		}
		
		@Override
		void attack (Charactor tarager) {
			System.out.println("매우 초록한 돼지가 공격합니다. 오잉ㅋ 오잉ㅋ");
		}
	}
	
	Monster[] monsters = { 
			new Fucking_strong_monster(), new d(), new Black_ye()
		};
	
}
