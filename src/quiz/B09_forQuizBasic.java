package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	public static void main(String[] args) {
		
		/*
		 ����ڰ� ���ڸ� �Է����� ��
		 1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
		 2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ�
		 �� �� �ִ����� ����غ�����
		 */
		
		// 1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. ");
		System.out.print("���ڸ� �Է��ϼ��� >");
		int num1 = sc.nextInt();
		int sum = 0;
			
		if (10 <= num1) {
			for (int i = 10; i <= num1; i++) {
				sum += i;
			}
			System.out.printf("10���� %d������ �� > %d\n", num1, sum);
		} else if (num1 < 10) {
			for (int i = 10; num1 <= i; i--) {
				sum += i;
			}
			System.out.printf("10���� %d������ �� > %d\n", num1, sum);
		}
		
//		int end = user # user�� ������ ����
//		if (start > end) {
//			int temp = start; 10 10
//			start = end; -1 -1
//			end = temp; 10 10         start -1 end 10 temp 10
//		}
		
		System.out.println("-------------------------------------------------------");
		//2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ� �� �� �ִ����� ����غ�����
		System.out.println("2. ");
		
		System.out.print("���ڸ� �Է��ϼ��� >");
		int num2 = sc.nextInt();
		
		int cnt = 0;
		
		if (0 <= num2) {
			for (int i = 0; i <= num2; i++) {
				if (i % 3 != 0)
					continue;
				cnt++;
				System.out.printf("%5d", i);
			}
			System.out.println("");
			System.out.printf("3�� ��� ����: %d��\n", cnt);
		} else if (num2 <= 0) {
			for (int i = 0; num2 <= i; i--) {
				if (i % 3 != 0)
					continue;
				cnt++;
				System.out.printf("%5d", i);
			}
			System.out.println("");
			System.out.printf("3�� ��� ����: %d��\n", cnt);
		}
		
		System.out.println("------------------------------------------------------");
		
		
		
		
		
	}

}










