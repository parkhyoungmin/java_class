package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	public static void main(String[] args) {
		
		/*
		 # 31������ ��������
		  1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����Ѵ� (1, 2, 3)
		  2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
		  3. �������� 31�� �θ��� ��� Ȥ�� ��ǻ�Ͱ� �й��Ѵ�
		  ��) ��ǻ�� > 2
		  		������� : 2
		     ��� > 3
		  		������� : 5
		 */

		Scanner user = new Scanner(System.in); // �ʱ�ȭ �κ�
		Random ran = new Random();
		
		int game_num = 0;
		
		boolean computer_turn = ran.nextBoolean();
		
		System.out.printf("<%s>�� �����Դϴ�!\n", computer_turn ? "��ǻ��" : "���");
		
		while (true) {
			// �Է� �κ�
			int num;
			if (computer_turn) {
				num = ran.nextInt(3) + 1;
				System.out.println("��ǻ�� > " + num);
			} else { // ����ڰ�
				System.out.print("��� >");
				num = user.nextInt();
				if (num > 3 || num < 1) {
					System.out.println("1 ~ 3�� �Է��ϼž� �մϴ�.");
					continue;
				}
			}
			// ó�� �κ�
			game_num += num;
			// ��� �κ�
			if (game_num >= 31) {
				break;
			}
			System.out.println("\t���� ��Ȳ: " + game_num);			
			computer_turn = !computer_turn;
		}
		System.out.printf("<%s>�� �¸�!\n", computer_turn ? "�ΰ�" : "��ǻ��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



















