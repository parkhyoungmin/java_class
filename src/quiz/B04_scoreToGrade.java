package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {

	public static void main(String[] args) {
		
		// ������ �Է� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����
		/*
		 90�̻� -> A
		 80�̻� -> B
		 70�̻� -> C
		 60�̻� -> D
		 �� �� -> F
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� > ");
		int score = sc.nextInt();
		
		if (score > 100 || score < 0) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			return;
			// return; // main()�� ������
//			System.exit(0); // ���α׷��� �����Ѵ�
		} else {
			if (score >= 90) {
				System.out.println("��� -> A");
			} else if (score >= 80) {
				System.out.println("��� -> B");
			} else if (score >= 70) {
				System.out.println("��� -> C");
			} else if (score >= 60) {
				System.out.println("��� -> D");
			} else {
				System.out.println("��� -> F");
			}
		}
		System.out.println("���α׷� ����");
	}
}















