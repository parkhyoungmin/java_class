
public class B14_Array2 {

	// 배열 안에도 배열을 넣을 수 있다
	
	public static void main(String[] args) {
		
		// 참조형 변수 타입에는 null이 들어갈 수 있다
		// 배열 변수도 값을 저장하는 것이 아니라 배열의 시작 주소를 저장한다
		// 즉, 배열도 참조형 변수 타입이다.
		String str = null;
		int[] scores = null;
		
		int[][] arr2 = { // 배열들의 시작 주소들이 들어있다
				new int[5], // 비어있는 5개짜리 int[] 배열  
				null, // 아직 배열이 없음
				{1, 2, 3, 4, 5, 6, 7},
				new int[] {1, 2, 3},
				scores
		};
		
		System.out.println("arr2에 저장된 배열이 몇개인가요? " + arr2.length);
		System.out.println("arr2에 저장된 배열 중 0번째 배열의 길이 : " + arr2[0].length);
//		System.out.println(arr2[1].length); // null의 length는 없으므로 에러
		System.out.println("arr2에 저장된 배열 중 2번째 배열의 길이 : " + arr2[2].length);
		System.out.println("arr2에 저장된 배열 중 3번째 배열의 길이 : " + arr2[3].length);
		
		// 길이를 활용하여 n차원 배열은 n중 반복문으로 모두 탐색할 수 있다
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
		
		
		
		// 활용 예
		int[][] scores2 = {
				{80, 90, 70}, 
				{50, 45, 82}, 
				{20, 93, 100}, 
				{10, 25, 76}
		};
		
		// 1 : 동그라미
		// 2 : 네모
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
					System.out.print("ㅇ ");
					break;
				case 2:
					System.out.print("ㅁ ");
					break;
				case 3:
					System.out.print("ㅅ  ");
					break;
				default:
					System.out.print("★  ");
					break;
				}
			}
			System.out.println();
		}
		
		
		
		
		

	}
}















