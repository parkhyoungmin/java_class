import java.util.Random;

public class B12_random {

	public static void main(String[] args) {
		
		// # JAVA���� ������ ���� �����ϱ�
		
		// 1. Math.random()
		// - doubleŸ���� 0 <= x < 1�� ���� �Ҽ��� �����Ѵ�
		// - �� �Ҽ��� �̿��Ͽ� ���ϴ� ���ڸ� ���� ����� �� �ִ�
		
		// # ���ϴ� ���ڸ� ����� ���� (��) 80 ~ 100)
		// (1) ���ϴ� ������ ������ ���Ѵ� 
		//	   0 * 21 (0) <= x < 1 * 21 (21)
		//	   0 <= x < 21
		// (2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�
		//	   0 + 80 <= x < 21 + 80
		// (3) �Ҽ��� �Ʒ��� �����Ѵ�
		for (int i = 0; i < 100; i++) {
			System.out.print(" " + (int) (Math.random() * 21 + 80));
		}
		
		// ���� : 3000�̻� 5000������ ���� ������ 100�� �̰�
		// 		�� ���� ���Դ� ���� ū ���� ���� ���� ���� ����غ�����
		
		int max = 3000;
		int min = 5000;
		
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 2001 + 3000);
			System.out.println(num);
			if (max <= num) {
				max = num;
			} else if (num <= min) {
				min = num;
			}
		}
		System.out.printf("���� ū ��: %d\n", max);
		System.out.printf("���� ���� ��: %d\n", min);
		
		
		
		// 2. Random Ŭ������ �̿�
		// ������ �� ���ϴ� �õ��ȣ�� ������ �� �ִ�
		// - ���� �õ� ��ȣ�� �����ϸ� ���� ���� ���´�
		// - �õ� ��ȣ�� �������� ������ �������� �õ尡 ���õȴ�
		
		// # ���ο� ���� �õ� ����
		Random ran = new Random();
		
		// # Random.nextInt(bound)
		// - 0 ~ bound�̸��� ������ ��ȯ�Ѵ�
		// - bound�� �������� ������ int���� ��ü���� ���� ������ ���õȴ�
		System.out.println(ran.nextInt(30)); // 0 ~ 29 �� ����
		System.out.println(ran.nextInt()); // int��ü ���� �� ����
		System.out.println(ran.nextInt(21) + 80); // 80 ~ 100 �� ����
		
		
		
		// ó������ �񱳴���� �����Ƿ� �׳� ����
//		if (i == 0) {
//			max = num;
//			num = num;
//		} else {              # 3���� ���
			// ���� ����� ������ �� ũ�� max���� ����
//			1.max = max < num ? num : max?;
//			2.max = Math.max(max, num);
//			3. if (max < num) {
//				max = num;
//			}
			// ���� ����� ������ �� ������ min���� ����
//			1. min = min > num ? num : min?;
//			2. min = Math.min(max, min);
//			3. if (num < min) {
//				min = num;
//			}
//		}
		
		
		
		
	}
}















