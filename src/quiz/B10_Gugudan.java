package quiz;

public class B10_Gugudan {

	public static void main(String[] args) {
		
		// 1. 备备窜 啊肺
		System.out.println("1. 备备窜 啊肺");
		for (int dan = 2; dan <= 9; dan++) {
			System.out.printf("%d窜 : ", dan);
			for (int gop = 1; gop <= 9; gop++) {
				System.out.printf("%d x %d = %d\t", dan, gop, dan * gop);
			}
			System.out.println("");
		}
		

		// 2. 备备窜 技肺
		System.out.println("2. 备备窜 技肺");
		for (int dan2 = 1; dan2 <= 9; dan2++) {
			for (int gop2 = 2; gop2 <= 9 ; gop2++) {
				System.out.printf("%d x %d = %d\t", gop2, dan2, gop2 * dan2);
			}
			System.out.println("");
		}
		
		
		
		System.out.println("2. 备备窜 技肺");
		for (int gop = 0; gop <= 9; ++gop) {
			for (int dan = 2; dan <= 9 ; ++dan) {
				if (gop == 0) {
					System.out.printf("%d窜\t\t", dan);
				}else {
					System.out.printf("%d x %d = %d\t", dan, gop, dan * gop);
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}


















