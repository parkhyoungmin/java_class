package quiz;

import java.util.Scanner;

public class C01_BlackJack {
	

	// 다른 함수에서도 변수를 사용할 수 있도록 함수 밖에 변수를 선언할 수 있다
	public static int[] deck;
	public static int[] player;
	public static int[] dealer;

	public static int[] game_index; // {0, 0, 0}
	//public static int DEALER = 0;
	//public static int PLAYER = 1;;
	//public static int DECK = 2;;

		
	public static int[] shuffle() {
		int[] deck = new int[52];
		
		// 52 % 13 : 0부터 12 스페이드, 13 - 25 하트, ... (int형 방식)
		// "CA", "C2", ... "CK" / "SA", "S2", .. (문자열 방식)
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < 200; i++) {
			int ran = (int) (Math.random() * 51 + 1);
			
			int temp = deck[0];
			deck[0] = deck[ran];
			deck[ran] = temp;
		}
		return deck;
	}
		


	public static void draw(int drawer) {
		switch (drawer) {
		case 0:
			dealer[game_index[0]++] = deck[game_index[2]++]; 
			break;
		case 1:
			player[game_index[1]++] = deck[game_index[2]++]; 
			break;
		}
	}


	 public static String prettyCard(int card) {
		 char[] shape= {'♥', '♠', '♣', '◆'};
		 String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9",
				 "10", "J", "Q", "K"};
		 
		int s_index = card / 13;
		int v_index = card % 13;
		
		return shape[s_index] + value[v_index];
	}


	public static void print_game(int mode) {
		
		System.out.print("딜러의 카드 : ");
		for (int i = 0; i < game_index[0]; i++) {
			if (mode == 0 && i == 0) {
				System.out.print("X ");
			} else {
				System.out.print(prettyCard(dealer[i]) + " ");
			}
		}
		if (mode == 0) {
			 System.out.println();
		} else {
			System.out.printf("(%d)\n", check_value(0));
		}

		System.out.println("플레이어의 카드 : ");
		for (int i = 0; i < game_index[1]; i++) {
			System.out.print(prettyCard(player[i]) + " ");
		}
		System.out.printf("(%d)\n", check_value(1));
	}


	public static int getSum(int[] values) {
		int sum = 0;
		int ace = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 0) {
				sum += 11;
			} else if (values[i] >= 10) {
				sum += 10;
			} else {
				sum += values[i] + 1;
			}
		}
		// A가 1개 이상 존재하면서 합이 21을 넘겼을 때 A를 1로 변경
		while (sum > 21 && ace > 0) {
			sum -= 10;
			ace -= 1;
		}
		return sum;
	}


	public static int check_value(int user) { // 내가 가진 카드들의 상태를 확인하는
		int[] values = new int[game_index[user]];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = user == 0 ? dealer[i] % 13 : player[i] % 13;
		}
		return getSum(values);
	}


	public static int start() {
		// 1. 무작위 순서의 덱을 하나 생성한다
		deck = shuffle();
		
		// 진행에 필요한 변수들을 초기화 한다
		player = new int[20];
		dealer = new int[20];
		game_index = new int[3];
		
		// 2. 만들어진 덱으로 게임을 진행한다
//		System.out.println(Arrays.toString(deck));
		
		// # 카드 뽑기 (딜러 두번, 플레이어 두번)
		draw(0);
		draw(0);
		draw(1);
		draw(1);
		
//		System.out.println("딜러 : " + Arrays.toString(dealer));
//		System.out.println("플레이어 : " + Arrays.toString(player));
		
		Scanner console = new Scanner(System.in);
		int player_value = check_value(1);
		// # 플레이어의 선택
		while ((player_value = check_value(1)) < 21) {
			// # 게임 정보 출력
			print_game(0);
			
			System.out.print("1.hit\t2.stand\n->");
			int select = console.nextInt();
			
			if (select == 2) {
				break;
			} else if (select == 1) {
				draw(1);
			}	
		}
		
		// 딜러가 마저 뽑고 모든 정보를 출력한 후 결과를 리턴
		print_game(1);
		int dealer_value;
		while ((dealer_value = check_value(0))<= 16) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			draw(0);
			print_game(1);
			dealer_value = check_value(0);
		}
		
		// 올바른 결과를 산출
		return check_game(dealer_value, player_value);
	}	


	public static int check_game(int d, int p) {
		if (d > 21 && p > 21) {
			return 0;
		} else if (d == p) {
			return 0;
		} else if (p <= 21 && d > 21) {
			return p == 21 ? 2 : 1;
		} else if (p <= 21 && p > d) {
			return p == 21 ? 2 : 1;
		} else if (p == 21 && p > d) {
			return 2;
		} else {
			return -1;
		}
	}

	
	public static void main(String[] args) {	
		/*
		 # 블랙잭 만들기
		 * 게임순서
		 1. 딜러(컴퓨터)가 카드를 뽑는다
		 	(컴퓨터는 뽑은 카드 합이 16이하일때 무조건 뽑고, 17이상이면 무조건 멈춘다)
		 2. 사용자는 카드를 더 뽑을지(hit) 멈출지(stand)를 결정한다
		 3. 사용자가 멈추면 딜러가 가려져있던 카드를 뒤집은 뒤 규칙에 따라 카드를 뽑는다
		 	(뽑은 카드 합이 16이하일때 무조건 뽑고, 17이상이면 무조건 멈춘다)
		 4. 컴퓨터보다 합이 높거나 정확하게 21이라면 승리 (배팅만큼 돈오름)
		    컴퓨터보다 합이 낮거나 21이 넘으면 패배 (배팅만큼 돈 떨어짐)
		    딜러와 카드합이 같다면 무승부
		    
		 ※ 처음에는 두장을 뽑는다
		 ※ A는 합이 21이 넘을떄는 1로 사용하고 21이하 일때는 11로 사용한다
		 ※ J, Q, K는 10에 해당한다
		 ※ 각 카드는 문양별로 한 장씩 존재한다
		 */
		
		int money = 10000;
		
		while (money > 0) {
			int betting = 500;
			money -= betting;
			
			int result = start();
			
			System.out.println("========================================================");
			StringBuilder msg = new StringBuilder("게임 결과: ");
			
			switch(result) {
				case 0:
					msg.append("무승부\n");
					break;
				case 1:
					money += betting;
					msg.append("승리\n");
					break;
				case 2:
					money += betting;
					msg.append("블랙잭 승리\n");
					break;
				default:
					money -= betting;
					msg.append("패배\n");
					break;
				}
			
			msg.append("현재 잔액 = " + money);
			System.out.println(msg);
			System.out.println("========================================================");
			}
		
				
			
		
				
		}
}

















