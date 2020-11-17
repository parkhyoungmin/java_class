
public class B14_Array2 {

	// �迭 �ȿ��� �迭�� ���� �� �ִ�
	
	public static void main(String[] args) {
		
		// ������ ���� Ÿ�Կ��� null�� �� �� �ִ�
		// �迭 ������ ���� �����ϴ� ���� �ƴ϶� �迭�� ���� �ּҸ� �����Ѵ�
		// ��, �迭�� ������ ���� Ÿ���̴�.
		String str = null;
		int[] scores = null;
		
		int[][] arr2 = { // �迭���� ���� �ּҵ��� ����ִ�
				new int[5], // ����ִ� 5��¥�� int[] �迭  
				null, // ���� �迭�� ����
				{1, 2, 3, 4, 5, 6, 7},
				new int[] {1, 2, 3},
				scores
		};
		
		System.out.println("arr2�� ����� �迭�� ��ΰ���? " + arr2.length);
		System.out.println("arr2�� ����� �迭 �� 0��° �迭�� ���� : " + arr2[0].length);
//		System.out.println(arr2[1].length); // null�� length�� �����Ƿ� ����
		System.out.println("arr2�� ����� �迭 �� 2��° �迭�� ���� : " + arr2[2].length);
		System.out.println("arr2�� ����� �迭 �� 3��° �迭�� ���� : " + arr2[3].length);
		
		// ���̸� Ȱ���Ͽ� n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�
		for (int i = 0; i < arr2.length; i++) {
			int[] arr = arr2[i];
			
			if (arr != null) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr2[i][j] + ""); // arr2[i][j] = arr[j]]
//					System.out.print(arr[j] + ""); 
				}
			} else {
				System.out.print("null");
			}
			System.out.println();
		}
		
		
		
		// Ȱ�� ��
		int[][] scores2 = {
				{80, 90, 70}, 
				{50, 45, 82}, 
				{20, 93, 100}, 
				{10, 25, 76}
		};
		
		// 1 : ���׶��
		// 2 : �׸�
		// 3 : x
		int[][] map = {
				{ 2, 2, 1, 1, 1},
				{ 2, 2, 3, 3, 3},
				{ 2, 2, 2, 3, 3, 2, 4, 3, 2, 3},
				{ 2, 2, 2, 3, 3},
				{ 2, 2, 2, 2, 2},
				{ 2, 2, 2, 2, 2},
		};
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				switch (map[i][j]) {
				case 1:
					System.out.print("�� ");
					break;
				case 2:
					System.out.print("�� ");
					break;
				case 3:
					System.out.print("��  ");
					break;
				default:
					System.out.print("��  ");
					break;
				}
			}
			System.out.println();
		}
		
		
		
		
		

	}
}















