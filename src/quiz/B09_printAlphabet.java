package quiz;

public class B09_printAlphabet {

	public static void main(String[] args) {
		
		// 반복문을 이용하여 A부터 Z까지 출력해보세요
		
//		System.out.println((int) 'A'); // 65
//		System.out.println((int) 'Z'); // 90
		
		// 1. 반복문을 이용하여 A부터 Z까지 출력해보세요
		System.out.println("1. ");
		for (int big = 65; big < 91; big++) {
			System.out.print((char) big );
			System.out.print(" ");
		}
		System.out.println("\n");
		System.out.println("-------------------------------------------------------");
		
		// 2. 반복문을 이용하여 z부터 a까지 출력해보세요
		System.out.println("2. ");
//		System.out.println((int) 'a'); // 97
//		System.out.println((int) 'z'); // 122
		for (char small = 'z'; 'a' <= small; small--) {
				System.out.print(small);
				System.out.print(" ");
		}
		

	}

}












