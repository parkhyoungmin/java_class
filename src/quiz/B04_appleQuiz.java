package quiz;

import java.util.Scanner;

public class B04_appleQuiz {

	public static void main(String[] args) {
		
		/* 
		 ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�
		 ����ڰ� ����� ������ �Է��ϸ� ����� ��� ������� �ʿ���
		 �ٱ����� ������ ����غ�����
		*/
		
		// ���� �տ� final : ������ �Ұ����� ������ �ȴ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ���� �Է� > " );
		int apple = sc.nextInt();
		
		if (apple > 0) {
			if (apple % 10 == 0) {
				int A_basket = apple / 10;
				System.out.printf("%d���� �ٱ��ϰ� �ʿ��մϴ�.", A_basket);
			} else if (apple % 10 != 0) {
				int B_basket = (apple / 10) + 1;
				System.out.printf("%d���� �ٱ��ϰ� �ʿ��մϴ�.", B_basket);
			}
			// (int) Math.ceil(������� / �ٱ���)
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		
		sc.close();
	}

}













