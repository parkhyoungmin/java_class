package quiz;

import java.util.Scanner;

public class B06_monthToSeason {

	public static void main(String[] args) {
		
		/*
		 switch-case���� �̿��Ͽ�
		 ����ڷκ��� ���� �Է� ������ �ش��ϴ� ������ ����غ�����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��(��)�� �Է����ּ��� > ");
		int month = sc.nextInt();
		
		switch (month) {
		case 4 : case 5:
			System.out.println("���� ����");
			break;
		case 6 : case 7 : case 8:
			System.out.println("�� ����");
			break;
		case 9: case 10 : 
			System.out.println("�ణ ���� ~ ���� �ܿ�");
			break;
		case 11 : case 12 : case 1 :case 2 : case 3:
			System.out.println("�� �ܿ�");
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} 
		
		
		
	}

}












