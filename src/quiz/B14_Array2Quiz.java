package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] numArr = {
				{10, 10, 10, 10},		
				{90, 50, 30, 70},		
				{800, 500},		
				{300, 300, 300},		
		};
		
		/*
		 1. numArr�� ���հ� ���(�Ҽ��� ��°�ڸ�)�� ���ؼ� ����غ�����
		
		 2. numArr�� �� ���� �հ� ���� ���� ��� ���ؼ� ����غ�����
				0���� �� : 10 + 10 + 10 + 10
				0���� �� : 10 + 90 + 800 + 300
		*/
		
		
		
		// # 1.
		int sum = 0;
		int item_count = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			item_count += numArr[i].length;
			for (int j = 0; j < numArr[i].length; j++) {
				sum += numArr[i][j];
			}
		}
		System.out.printf("�� : %d\n",sum);
		System.out.printf("��� : %.2f\n", sum / (double) item_count);
		
		
		
		// # ��� ���� ��
		int[] rowSum = new int[numArr.length];
		int[] colSum = new int[4];
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				rowSum[i] += numArr[i][j];
				colSum[j] += numArr[i][j];
			}
		}
		System.out.println("���� ��: " + Arrays.toString(rowSum));
		System.out.println("���� ��: " + Arrays.toString(colSum));
		
		
	}
}














