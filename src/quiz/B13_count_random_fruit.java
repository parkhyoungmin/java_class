package quiz;

public class B13_count_random_fruit {

	public static void main(String[] args) {
		
	
//		 1. 크기 100의 배열에 랜덤 과일 문자열을 저장해보세요
//		 ※ apple, banana, orange, peach, kiwi
//		 
//		 2. 각 과일이 몇번 등장했는디 모두 기록하고 출력해보세요
		
		
		
//		int size = 100;
		
		String[] fruitNames = {"apple", "banana", "orange", "peach", "kiwi"};
		String[] fruitBox = new String[100];
			
		for (int i = 0; i < 100; i++) { // 100 - size
			fruitBox[i] = fruitNames[(int) (Math.random() * 5)];
		}

		
//		# 풀이
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
		
		// 집계가 끝난후 count를 출력해야한다
		for (int i = 0; i < count.length; i++) {
			System.out.printf("%s : %d\n", fruitNames[i], count[i]);
		}
		
		// 인덱스에 이름 지어놔야
		// # enum 열거형데이터 의 시초, 값을 붙여놓는 것
		int orange = 2;
		
		System.out.println("오렌지의 번호: " + orange);
		System.out.println("오렌지가 몇번인지 확인하기 " + count[orange]); 
		System.out.println("오렌지 이름: " + fruitNames[orange]); 
		
		

	}
}












