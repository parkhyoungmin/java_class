package Dice_game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_FiveDice {

	/*
	 �������� 5���� �ֻ����� ���� ������ (�ֻ����� ���� 1 ~ 6)
	 
	 Ǯ�Ͽ콺 (���� ���ڰ� 2��/3��)
	 ���� ��Ʈ����Ʈ (1234/2345/3456)
	 ���� ��Ʈ����Ʈ (12345/23456)
	 4���̽� (���� ���ڰ� 4��)
	 ���� (���� ���ڰ� 5��)
	 
	 �� �����ϴ� Ŭ������ �ۼ��ϰ� �׽�Ʈ �غ�����
	 
	 �� �ٸ� ���Ͽ� �ۼ��ϰ� ���⼭�� ���� ���⸸ �Ұ�
	 */
	
	public static Object dice_game() {
		Random ran = new Random();
		
		Set<Integer> dice = new HashSet<Integer>();
		
		Collections.addAll(dice, 1, 2, 3, 4, 5, 6);
		Object[] dice_list = dice.toArray(); // �迭 ��ȯ
		
		return dice_list[ran.nextInt(6)]; //�迭 ���� ���
	}

	
	public static void main(String[] args) {
		System.out.println("�ֻ��� ���");
		for (int i = 1; i < 6; i++) {
			System.out.print(dice_game() + " ");
		}
		System.out.println();
	}


	static void dice_result() {
		
		
		
	}
	
	
	
	
	
}














