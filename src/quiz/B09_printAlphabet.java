package quiz;

public class B09_printAlphabet {

	public static void main(String[] args) {
		
		// �ݺ����� �̿��Ͽ� A���� Z���� ����غ�����
		
//		System.out.println((int) 'A'); // 65
//		System.out.println((int) 'Z'); // 90
		
		// 1. �ݺ����� �̿��Ͽ� A���� Z���� ����غ�����
		System.out.println("1. ");
		for (int big = 65; big < 91; big++) {
			System.out.print((char) big );
			System.out.print(" ");
		}
		System.out.println("\n");
		System.out.println("-------------------------------------------------------");
		
		// 2. �ݺ����� �̿��Ͽ� z���� a���� ����غ�����
		System.out.println("2. ");
//		System.out.println((int) 'a'); // 97
//		System.out.println((int) 'z'); // 122
		for (char small = 'z'; 'a' <= small; small--) {
				System.out.print(small);
				System.out.print(" ");
		}
		

	}

}












