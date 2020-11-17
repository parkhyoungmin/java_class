package myobj.monster;

import myobj.sword.Sword;

public class Monster {
	public String name;
	public int hp;
	
	public Monster() {
		name = "짱센몬스터";
		hp = 99999;
	}
	
	public void attacked(Sword sword) {
		int dmg = sword.damage();
		hp -= dmg;
		System.out.printf("%s에게 %d의 데미지!\n", name, dmg);
		System.out.printf("%s의 남은 체력 : %d\n", name, hp);
	}
	
	public static void main(String[] args) {
		Sword steel_sword = new Sword(30);
		
		Monster mon = new Monster();
		
		mon.attacked(steel_sword);
		
		for (int i = 0; i < 10; ++i) {
			steel_sword.upgrade_weapon();
		}
		mon.attacked(steel_sword);
		
		
		
	}
}


class Slime extends Monster {
	
	public Slime() {
		
	}
	
	public void jump() {
		System.out.printf("%s가 점프를 합니다\n", name);
	}
	
}


class Green_slime extends Slime {
	
	public Green_slime() {
		
	}
	
	public void green_body() {
		System.out.printf("%s는 초록색 빛을 띄고있습니다.\n", this.name);
	}
	
}


class Zombie extends Monster {
	
	public void alive() {
		System.out.printf("%s는 썩은 몸을 유지합니다.\n", name);
	}
	
}


class Gobline extends Monster {
	
	public void hunt() {
		System.out.printf("%s가 사냥을 시작합니다.\n", name);
	}
	
}


class Gobline_jr extends Gobline {
	
	public void sayHi() {
		System.out.printf("안녕하세요. %s입니다.\n", name);
	} 
	
}







