package quiz;

import java.util.Scanner;

public class B10_NextPrime {

	public static void main(String[] args) {
		
		/*
		 ����ڷκ��� ���ڸ� �Է¹�����
		 �Է¹��� ������ �� ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ����غ�����
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� > ");
		int num = sc.nextInt();
		
		for (int i = num; ; i++) { 
			int cnt = 0;
			for (int j = 1; j <= i; j++) { 
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i);
				break;
			}
		}
		
		
		

		
	}
}



