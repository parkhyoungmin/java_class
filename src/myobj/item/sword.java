package myobj.item;

import java.util.Scanner;

public class sword {

	// �ʵ�
	// - ���ݷ�
	// - ��ȭ��ġ
	// - ��ȭȮ�� (��޸��� ��ȭ Ȯ���� �ٸ�)
	int user_HP;
	int grade = 1;;
	int attack;
	int gold;
	double percent;
	
	int num = (int) (Math.random()*100 + 1);
	
	// �޼���
	// - ��ȭ�ϱ� (�������� ���� ���� ���а� �����)
	// - ���� (��󿡰� ���ݷ� ��ŭ�� �������� ����)
	// �� ������ ����� �Ǵ� ��ü�� HP�� �־�� �Ѵ�
	
	Scanner sc = new Scanner(System.in);
	
	public sword(int user_HP, int gold, int attack) {
		this.user_HP = user_HP;
		this.gold = gold;
		this.attack = attack;
	}


	public void enhance() {
		while (true) {
			System.out.println("���⸦ ��ȭ�Ͻðڽ��ϱ�?");
			System.out.println("1 -> ��ȭ 2 -> ��� ");
			System.out.print(" > ");
			int select = sc.nextInt();
			
			if (select == 2) {
				break;
			}
			
			switch (select) {
			case 1:
				if (grade >= 1 && grade <= 3) {
					if (gold < 350000) {
						System.out.println("��尡 �����մϴ�");
						break;
					}
					gold -= 350000;
					grade++;
					attack += 5;
					System.out.println("��ȭ����!");
					System.out.printf("���� ���: %d\n", grade);
					System.out.printf("���� ���: %d\n", gold);
					break;
				} 
				else if (grade >= 4 && grade <= 8) {
					if (gold < 500000) {
						System.out.println("��尡 �����մϴ�");
						break;
					}
					gold -= 500000;
					enhance_percent();
					System.out.printf("���� ���: %d\n", grade);
					System.out.printf("���� ���: %d\n", gold);
					break;
				} 
				else if (grade == 9) {
					if (gold < 1000000) {
						System.out.println("��尡 �����մϴ�");
						break;
					}
					gold -= 1000000;
					enhance_percent();
					System.out.printf("���� ���: %d\n", grade);
					System.out.printf("���� ���: %d\n", gold);
					break;
				}
			default:
				break;
			}
		}	
	}
	
	
	public void enhance_percent() {
		int percent = (int) (Math.random() * 70 + 1);
		
		switch (grade) {
		case(4) :
			if (10 <= percent) {
				System.out.println("��ȭ����!");
				grade++;
				attack += 5;
			} else {
				System.out.println("��ȭ����");
				grade--;
				attack -= 5;
			}
		break;
		case(5) :
			if (20 <= percent) {
				System.out.println("��ȭ����!");
				grade++;
				attack += 5;
			} else {
				System.out.println("��ȭ����");
				grade--;
				attack -= 5;
			}
		break;
		case(6) :
			if (30 <= percent) {
				System.out.println("��ȭ����!");
				grade++;
				attack += 5;
			} else {
				System.out.println("��ȭ����");
				grade--;
				attack -= 5;
			}
		break;
		case(7) :
			if (40 <= percent) {
				System.out.println("��ȭ����!");
				grade++;
				attack += 5;
			} else {
				System.out.println("��ȭ����");
				grade--;
				attack -= 5;
			}
		break;
		case(8) :
			if (50 <= percent) {
				System.out.println("��ȭ����!");
				grade++;
				attack += 5;
			} else {
				System.out.println("��ȭ����");
				grade--;
				attack -= 5;
			}
		break;
		case(9) :
			if (60 <= percent) {
				System.out.println("��ȭ����!");
				grade++;
				attack += 5;
			} else {
				System.out.println("��ȭ����");
				grade--;
				attack -= 5;
			}
		break;
		default:
			System.out.println("�ִ� ��ȭ ��ġ�Դϴ�.");
			break;
		}	
	} 
	
	
	public void Battle() {
		int monster_hp = (int) (Math.random() * 500 + 1);
		int monster_attack = (int) (Math.random() * 100 + 1);
		System.out.println("���� �εεյ���");
		System.out.println("============================");
		System.out.printf("���� HP : %d\n", monster_hp);
		System.out.printf("���� ���ݷ� : %d\n", monster_attack);		
		System.out.println("============================");
		System.out.printf("���� HP : %d\n", this.user_HP);
		System.out.printf("���� ���ݷ� : %d\n", this.attack);	
		System.out.println("============================");
		System.out.println("1 -> ���� 0 -> ����");
		System.out.println("�ൿ���� -> ");
		int select = sc.nextInt();
		
		if (select == 1) {
			while (true) {
				monster_hp -= attack;
				System.out.println("��������!");
				System.out.printf("����HP: %d ���� HP: %d\n", user_HP, monster_hp);
				user_HP -= monster_attack;
				System.out.println("���Ͱ���!");
				System.out.printf("����HP: %d ���� HP: %d\n", user_HP, monster_hp);
				if (user_HP <= 0 || monster_hp <= 0) {
					if (user_HP <= 0) {
						System.out.println("���� ���..����� �������� ��Ȱ");
					} else {
						System.out.println("�¸�!");
						gold += ((Math.random() * 100) + 1);
						System.out.printf("ȹ�� ��� : %d\n", gold);
					}
					break;
				}
			}
		} 
		else if (select == 0) {
			System.out.println("�����ƽ��ϴ�");
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}		
	}
	
	
	
	
	
	
	
	
	
	
} // �ǳ� 











