package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C12_inputRightThing {

	public static void main(String[] args) {
		
		/*
		 ����ڷκ��� intŸ���� �����͸� ����غ�����
		 �߸��� Ÿ���� �����Ͱ� �������� ���α׷��� ������� �ʾƾ� �մϴ�.
		 (�ùٸ��� int�� �Էµ� ��� ���α׷��� ����˴ϴ�.
		 */

		Scanner sc = new Scanner(System.in);
		
		
		
		while (true) {
			System.out.print("�Է� > ");
			try {
				int num = sc.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("���� : " + e.getMessage());
				System.out.print("�Է� > ");
				
			} catch(ArithmeticException e) {
				System.out.println("���� : " + e.getMessage());
				System.out.print("�Է� > ");
				
			}
		}
		
		// InputMismatchException -> int �ƴҋ�
		// ArithmeticException -> 0���� ������
		
		
		
	}
}




