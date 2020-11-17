package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	public static void main(String[] args) {
		
		/*
		  1���� 45������ �ߺ����� ���� ���� 6���� �̷����
		  �迭�� �����غ�����
		  
		  �� �ߺ��� ������ �ٽ� �̱�
		  �� �̾Ҵ� ���ڴ� ����صα�
		  �� 1 ~45�� ���ڸ� ������ ������� 6�� �̱�
		 */		
		
		// 1. �ߺ��� ������ �ٽ� �̱�
		int[] lotto = new int[6];
		int i = 0;
		while (i != 6) {
			boolean duple = false;
			lotto[i] = (int) (Math.random() * 45 + 1);
			// 3���� �̾��� �� 0, 1, 2�� �񱳸� �ؼ�
			// �Ȱ��� ���� �ִٸ� i�� ������Ű�� �ʴ´�
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					duple = true;
					break;
				}
			}
			if (!duple) {
				i++;
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		
		
		// 2. �̾Ҵ� ���ڴ� ����صα�
//		Random ran = new Random();
//		
//		int[] lotto = new int[6];
//		int[] number = new int[45];
//		
//		for (int i = 0; i < number.length; i++) {
//			number[i] = i + 1;
//		}
//		
//		int i = 0;
//		
//		while (i != 6) { // ���� �̾Ҵ� �ڸ� ó���Ѵ�
//			int random_index = ran.nextInt(45);
//			
//			if (number[random_index] != -1) {
//				lotto[i] = number[random_index];
//				number[random_index] = -1;
//				i++;
//			}
//		}
//		System.out.println("���ڻ���: " + Arrays.toString(number));
		
		
		
		//3. 1 ~45�� ���ڸ� ������ ������� 6�� �̱�
//		Random ran = new Random();
//		
//		int[] lotto = new int[6];
//		int[] number = new int[45];
//		
//		for (int i = 0; i < number.length; i++) {
//			number[i] = i + 1;
//		}
//		
//		for (int i = 0; i < 5000; i++) {
//			int random_index = ran.nextInt(44) + 1;
//			
//			int temp = number[0];
//			number[0] = number[random_index];
//			number[random_index] = temp;
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.println(i + number[i]);
//		}
//		
		
		
	}	
}












