package quiz;

import java.util.Scanner;

public class B01_wonToDollar {

	public static void main(String[] args) {
		
		/*
		 �ѱ� ���� �Է��ϸ�
		 �޷� ���Ž� �󸶸� �ް� �Ǵ��� ������ִ� ���α׷��� ��������
		 ȯ���� �˻�, �Ҽ� �Ѥ� �ڸ����� ���, ȯ�� ������ 1.75%
		 */
		
//		int won = new Scanner(System.in).nextInt();50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޷� ȯ��(������ 1.75%����)");
		System.out.print("�ݾ� �Է�: ");
		int won = sc.nextInt();
		System.out.printf("%d��\n", won);
		double realWon = won - ((won/100) * 1.75);
		double doller = (realWon * 0.00088);
		System.out.printf("%.2f���� ȯ�� �Ϸ�\n", doller);

	}

}




