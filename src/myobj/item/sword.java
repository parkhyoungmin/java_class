package myobj.item;

import java.util.Scanner;

public class sword {

	// 필드
	// - 공격력
	// - 강화수치
	// - 강화확률 (등급마다 강화 확률이 다름)
	int user_HP;
	int grade = 1;;
	int attack;
	int gold;
	double percent;
	
	int num = (int) (Math.random()*100 + 1);
	
	// 메서드
	// - 강화하기 (성공률에 따라 성공 실패가 적용됨)
	// - 공격 (대상에게 공격력 만큼의 데미지를 입힘)
	// ※ 공격의 대상이 되는 객체의 HP가 있어야 한다
	
	Scanner sc = new Scanner(System.in);
	
	public sword(int user_HP, int gold, int attack) {
		this.user_HP = user_HP;
		this.gold = gold;
		this.attack = attack;
	}


	public void enhance() {
		while (true) {
			System.out.println("무기를 강화하시겠습니까?");
			System.out.println("1 -> 강화 2 -> 취소 ");
			System.out.print(" > ");
			int select = sc.nextInt();
			
			if (select == 2) {
				break;
			}
			
			switch (select) {
			case 1:
				if (grade >= 1 && grade <= 3) {
					if (gold < 350000) {
						System.out.println("골드가 부족합니다");
						break;
					}
					gold -= 350000;
					grade++;
					attack += 5;
					System.out.println("강화성공!");
					System.out.printf("현재 등급: %d\n", grade);
					System.out.printf("남은 골드: %d\n", gold);
					break;
				} 
				else if (grade >= 4 && grade <= 8) {
					if (gold < 500000) {
						System.out.println("골드가 부족합니다");
						break;
					}
					gold -= 500000;
					enhance_percent();
					System.out.printf("현재 등급: %d\n", grade);
					System.out.printf("남은 골드: %d\n", gold);
					break;
				} 
				else if (grade == 9) {
					if (gold < 1000000) {
						System.out.println("골드가 부족합니다");
						break;
					}
					gold -= 1000000;
					enhance_percent();
					System.out.printf("현재 등급: %d\n", grade);
					System.out.printf("남은 골드: %d\n", gold);
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
				System.out.println("강화성공!");
				grade++;
				attack += 5;
			} else {
				System.out.println("강화실패");
				grade--;
				attack -= 5;
			}
		break;
		case(5) :
			if (20 <= percent) {
				System.out.println("강화성공!");
				grade++;
				attack += 5;
			} else {
				System.out.println("강화실패");
				grade--;
				attack -= 5;
			}
		break;
		case(6) :
			if (30 <= percent) {
				System.out.println("강화성공!");
				grade++;
				attack += 5;
			} else {
				System.out.println("강화실패");
				grade--;
				attack -= 5;
			}
		break;
		case(7) :
			if (40 <= percent) {
				System.out.println("강화성공!");
				grade++;
				attack += 5;
			} else {
				System.out.println("강화실패");
				grade--;
				attack -= 5;
			}
		break;
		case(8) :
			if (50 <= percent) {
				System.out.println("강화성공!");
				grade++;
				attack += 5;
			} else {
				System.out.println("강화실패");
				grade--;
				attack -= 5;
			}
		break;
		case(9) :
			if (60 <= percent) {
				System.out.println("강화성공!");
				grade++;
				attack += 5;
			} else {
				System.out.println("강화실패");
				grade--;
				attack -= 5;
			}
		break;
		default:
			System.out.println("최대 강화 수치입니다.");
			break;
		}	
	} 
	
	
	public void Battle() {
		int monster_hp = (int) (Math.random() * 500 + 1);
		int monster_attack = (int) (Math.random() * 100 + 1);
		System.out.println("몬스터 두두둥등장");
		System.out.println("============================");
		System.out.printf("몬스터 HP : %d\n", monster_hp);
		System.out.printf("몬스터 공격력 : %d\n", monster_attack);		
		System.out.println("============================");
		System.out.printf("유저 HP : %d\n", this.user_HP);
		System.out.printf("유저 공격력 : %d\n", this.attack);	
		System.out.println("============================");
		System.out.println("1 -> 공격 0 -> 도주");
		System.out.println("행동선택 -> ");
		int select = sc.nextInt();
		
		if (select == 1) {
			while (true) {
				monster_hp -= attack;
				System.out.println("유저공격!");
				System.out.printf("유저HP: %d 몬스터 HP: %d\n", user_HP, monster_hp);
				user_HP -= monster_attack;
				System.out.println("몬스터공격!");
				System.out.printf("유저HP: %d 몬스터 HP: %d\n", user_HP, monster_hp);
				if (user_HP <= 0 || monster_hp <= 0) {
					if (user_HP <= 0) {
						System.out.println("유저 사망..가까운 마을에서 부활");
					} else {
						System.out.println("승리!");
						gold += ((Math.random() * 100) + 1);
						System.out.printf("획득 골드 : %d\n", gold);
					}
					break;
				}
			}
		} 
		else if (select == 0) {
			System.out.println("도망쳤습니다");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}		
	}
	
	
	
	
	
	
	
	
	
	
} // 맨끝 











