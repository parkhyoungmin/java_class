package quiz;

public class B13_count_random_fruit {

	public static void main(String[] args) {
		
	
//		 1. ũ�� 100�� �迭�� ���� ���� ���ڿ��� �����غ�����
//		 �� apple, banana, orange, peach, kiwi
//		 
//		 2. �� ������ ��� �����ߴµ� ��� ����ϰ� ����غ�����
		
		
		
//		int size = 100;
		
		String[] fruitNames = {"apple", "banana", "orange", "peach", "kiwi"};
		String[] fruitBox = new String[100];
			
		for (int i = 0; i < 100; i++) { // 100 - size
			fruitBox[i] = fruitNames[(int) (Math.random() * 5)];
		}

		
//		# Ǯ��
		int[] count = new int[5];
		// 0 ~ apple 1 ~ banana ... 4 ~ kiwi
		
		int fruit_kind = fruitNames.length;
		
		for (int i = 0; i < 100; i++) {	// 100 - size
			for (int j = 0; j < fruit_kind; j++) {
				if (fruitNames[j].equals(fruitBox[i])) {
					count[j] += 1;
					break;
				}
			}
		}
		
		// ���谡 ������ count�� ����ؾ��Ѵ�
		for (int i = 0; i < count.length; i++) {
			System.out.printf("%s : %d\n", fruitNames[i], count[i]);
		}
		
		// �ε����� �̸� �������
		// # enum ������������ �� ����, ���� �ٿ����� ��
		int orange = 2;
		
		System.out.println("�������� ��ȣ: " + orange);
		System.out.println("�������� ������� Ȯ���ϱ� " + count[orange]); 
		System.out.println("������ �̸�: " + fruitNames[orange]); 
		
		

	}
}












