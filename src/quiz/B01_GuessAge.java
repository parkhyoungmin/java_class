package quiz;

import java.util.Scanner;

public class B01_GuessAge {

	public static void main(String[] args) {
		
		/*
		 ����ڷκ��� ������ �⵵�� �¾ �⵵�� �Է¹�����
		 �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �⵵ �Է�: " );
		int year = sc.nextInt();
		System.out.print("�¾ �⵵ �Է�: ");
		int birth = sc.nextInt();

		int koreaAge = year - birth + 1;
		System.out.println("�� ����: " + koreaAge + "��");
		
		
		
		
	}

}









