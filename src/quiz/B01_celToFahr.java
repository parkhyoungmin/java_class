package quiz;

import java.util.Scanner;

public class B01_celToFahr {

	public static void main(String[] args) {
	
		/*
		 ����ڷκ��� ���� �µ��� �Է¹�����
		 ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
		 ��ȯ������ �˾Ƽ� �˻�, ����� �Ҽ� ù° �ڸ�����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �µ� �Է�: ");
		double celsius = sc.nextDouble();
		System.out.printf("���� �µ�: %.1f��\n", celsius);
		
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.printf("ȭ�� �µ�: %.1f��\n", fahrenheit);
		
		// sc�� �ٽ� ������� ���� �����̱� ������ ���� �������� �ʴ´�
//		System.out.print("������ �µ� > ");
//		int cel = new Scanner(System.in).nextInt();
//		double fahr = (new Scanner(System.in).nextDouble() * 1.8) + 32;
		
		

	}

}















