package quiz;

import java.util.Scanner;

public class B10_GCD {

	public static void main(String[] args) {
		
		/*
		 �� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����
		 �� �ִ����� : �� ������ ����� �� ���� ū �����
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ΰ� �Է� -> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
			
		// num1�� �� ũ�� ���� �ٲ۴�
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int gcd = 1;
		for (int i = num1; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.printf("%d�� %d�� �ִ������� %d�Դϴ�", num1, num2, gcd);
		
		
		
		/*
		 1.������ �� �ڿ��� a, b�� �־�������. ���� ū ���� a��� �����غ��ڽ��ϴ�.
		 2.a�� b�� ���� �������� n �̶�� �ϸ� (a%b = n)
		 n�� 0�϶�, b�� �ִ� �����(GCD)�Դϴ�.
		 3.���� n�� 0�� �ƴ϶��, a�� b���� �ٽ� �ְ� b�� n�� ���� �� �� �ٽ� ���� 2.�� ������ �ݺ�
		 */
		//��Ŭ���� ȣ����
//		int a = 100;
//		int b = 50;
//		
//		if (a < b) {
//			int temp = a;
//			a = b;
//			b = temp;
//		}
//		
//		int n = -1;
//		for (; n != 0;) {
//			n = a % b;
//			a = b;
//			b = n;
//		}
//		System.out.println("�ִ� ������� " + a + "�Դϴ�.");
		
		
		
		
		
		
		
		
	}
	
}














