package myobj.monster;

import myobj.sword.Sword;

public class Monster {
	public String name;
	public int hp;
	
	public Monster() {
		name = "¯������";
		hp = 99999;
	}
	
	public void attacked(Sword sword) {
		int dmg = sword.damage();
		hp -= dmg;
		System.out.printf("%s���� %d�� ������!\n", name, dmg);
		System.out.printf("%s�� ���� ü�� : %d\n", name, hp);
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
		System.out.printf("%s�� ������ �մϴ�\n", name);
	}
	
}


class Green_slime extends Slime {
	
	public Green_slime() {
		
	}
	
	public void green_body() {
		System.out.printf("%s�� �ʷϻ� ���� ����ֽ��ϴ�.\n", this.name);
	}
	
}


class Zombie extends Monster {
	
	public void alive() {
		System.out.printf("%s�� ���� ���� �����մϴ�.\n", name);
	}
	
}


class Gobline extends Monster {
	
	public void hunt() {
		System.out.printf("%s�� ����� �����մϴ�.\n", name);
	}
	
}


class Gobline_jr extends Gobline {
	
	public void sayHi() {
		System.out.printf("�ȳ��ϼ���. %s�Դϴ�.\n", name);
	} 
	
}







