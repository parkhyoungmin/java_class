package quiz;

public class B11_whileQuiz {

	public static void main(String[] args) {
		
		/*
		 while���� �̿��Ͽ�
		 
		 1.1���� 100������ 3�ǹ���� ������ ���غ�����
		 
		 2.200���� 1���� ����غ�����
		 
		 3.1���� 200������ ���� ��
		 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ������ ���غ����� 
		 */
	
		// 1.1���� 100������ 3�ǹ���� ������ ���غ�����
		System.out.println("1.");
		int num = 1, sum = 0;
		
		while (num < 100) {
			if (num % 3 == 0) {
				System.out.print(" " + num);
				sum += num;
			}
			num++;
		}
		System.out.println();
		System.out.printf("3�� ����� ����: %d\n", sum);
		
		
		
		// 2.200���� 1���� ����غ�����
		System.out.println("2. ");
		int num2 = 200;
		while (num2 >= 1) {
			System.out.println(num2);
			num2--;
		}
		
		
		
		// 3. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ������ ���غ����� 
		System.out.println("3. ");
		int num3 = 1, sum3 = 0;
		while (num3 <= 200) {
			if (num3 % 2 != 0 && num3 % 3 != 0) {
				System.out.print(" " + num3);
				sum3 += num3;
			}
			num3++;
		}
		System.out.println();
		System.out.printf("����: %d\n", sum3);
		
		
		
	}
}















