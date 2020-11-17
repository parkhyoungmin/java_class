
public class B10_innerLoop {

	public static void main(String[] args) {
		
		// # 반복문 내부에 반복문을 사용하기
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("=========================================바깥 반복문 %d\n", i);
			for (int j = 0; j < 5; j++) {
				System.out.printf("--------------------------------------------안깥 반복문 %d-%d\n", i, j);
//				for (int k = 0; k < 2; k++) {
//					System.out.printf("+++++++++++++++++++++++++++++++++++++++++++++++++제일 안쫀 반복문 %d-%d-%d\n", i, j, k);
//				}
			}
		}
		
		// # 다중 반복문 구구단 출력하기
		// - 2단 - 9단
		// - 각 단마다 x1 - x9
		for (int dan = 2; dan <= 9; dan++) {
			System.out.printf("&&& %d단 &&&", dan);
			for (int gop = 1; gop <=9; gop++) {
				System.out.printf("%d x %d = %d\n", dan, gop, dan*gop);
			}
		}

	}

}


















