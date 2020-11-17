package quiz;

import java.util.Arrays;

public class C01_functionQuiz2 {

	// 1.최소값과 최소값을 매개변수로 받고, 그 사이의 모든 값을 포함하는
	//	 int배열을 생성하여 반환하는 range함수를 만들어보세요
	public static void range(int a, int b) { // 4, 2
		int ab_range = Math.abs(a-b) + 1; // 2
		int[] num = new int[ab_range]; // num[2] 0 ~ 1
		if (a > b) {
			for (int i = 0; i < ab_range; i++) { 
					num[i] = b;
					b++;
			}
			System.out.println(Arrays.toString(num));
		} 
		else if (a < b) {
			for (int j = 0; j < ab_range; j++) { 
				num[j] = a; 
				a++;
			}
			System.out.println(Arrays.toString(num));
		} 
		else {
			System.out.println(a);
		}
	}
	//1.
	public static int[] range1_1(int min, int max) {
		int[] arr = new int[max - min];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + i;
		}
		return arr;
	}
	
	
	// 2. 최대값을 매개변수로 전달받으면, 0부터 최대값 미만의 모든 값을 포함하는
	//	 range2 함수를 만들어보세요
	public static void range2(int a, int b) {
		if (a == b || a > b) {
			int num[] = new int[a];
			for (int i = 0; i < a; i++) {
				num[i] = i; 
			}
			System.out.println(Arrays.toString(num));
		} 
		else if (a < b) { // 2, 5
			int num[] = new int[b]; // 5
			for (int j = 0; j < b; j++) {
				num[j] = j; 
			}
			System.out.println(Arrays.toString(num));
		}
	}
	//2.
	public static int[] range1_1(int max) { // range1_1과 같은이름 사용가능 - (함수오버로딩)
		int[] arr = new int[max];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	
	// 3. 문자열 배열을 전달받으면, 해당 배열을 모두 "/"를 붙여 이어붙이는
	//	 join 함수를 만들어보세요
	//	 ex : {"apple", "banana", "orange"}
	//	 -> "apple/banana/orange"
	public static void join(String[] fruits) {
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i]+"/");
		}
	}
	//3.
	public static String join1_1(String[] arr) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				result.append(arr[i]); // 첫번째 과일부터 뽑아두고
			} else {
				result.append("/"+ arr[i]);
			}
		}
		return result.toString();
	}
	
	
	// 4. 문자열 타입의 숫자(num), 원래 진법(base_from), 바꾸려는 진법(base_to)
	//	 를 전달받으면 base_from의 진법이었던 num을
	//	 base_to 진법의 문자열로 반환하여 반환하는 함수를 만들어 보세요
	//	 ※ 만약, 진법이 잘못된 경우 null을 반환합니다.
	//	 ※ 변환할 수 있는 최대 진법은 36진법이고, 최소 진법은 2입니다.
	
	public static char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public static char getSymbol(int value) { // digits 문자자리수 return
		return digits[value];
	}
	
	public static int getValue(char digit) {
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == digit) { // 0 ~ Z 에서 찾아서 리턴
				return i;
			}
		}
		return -1;
	}
	
	public static String convert_base(String num, int base_from, int base_to) {
		num = num.toUpperCase();
		
		if (base_from < 2 || base_from > 36 || base_to < 2 || base_to > 36) { // 범위에러 확인
			System.err.println("RadixError : 사용가능한 진법은 2부터 36입니다.");
			return null;
		}
		
		int pow = num.length() - 1;
		long real_value = 0;
		
		for (int i = pow; i > -1; i--) { // 맨 앞자리부터 1의자리까지 for문
			
			char digit = num.charAt(pow - i); // num의 0번째부터 ~
			int value = getValue(digit); // num의 0번째에 있던 단어를 탐색해서 for문 'i'번째 i의 숫자로 저장
			
			// 예를 들어 8진법인데 8이상의 숫자가 있으면 에러니깐
			if (value >= base_from) {
				System.err.println("base_from 이상의 값을 지닌 문자가 있습니다");
				return null;
			}
			
			System.out.println(digit); // 3
			System.out.println("실제값: " + value); // 예를들어 1010 이면 2의1승 곱하기 1 해서 더하게 하려고
			System.out.println(Math.pow(base_from, i) + "의 자리"); 
			
			real_value += value * Math.pow(base_from, i); // 1*8의자리 + 1*2의자리
		}
		
		System.out.println(base_from + "진법 문자열 " + num + "의 값은 실제로" + real_value + "입니다.");
		
		StringBuilder result = new StringBuilder();
		
		// 123456을 10진수 123456으로 변환하는 방법
		
		while (real_value > 0) {
			result.append(getSymbol((int)(real_value % base_to))); 
			real_value /= base_to; 
		}
		return result.reverse().toString();
	}
		
			
	public static void main(String[] args) {
		
		/*
		 1. 최소값과 최소값을 매개변수로 받고, 그 사이의 모든 값을 포함하는
		 int배열을 생성하여 반환하는 range함수를 만들어보세요
		 
		 2. 최대값을 매개변수로 전달받으면, 0부터 최대값 미만의 모든 값을 포함하는
		 range2 함수를 만들어보세요
		 
		 3. 문자열 배열을 전달받으면, 해당 배열을 모두 이어붙이는
		 join 함수를 만들어보세요
		 ex : {"apple", "banana", "orange"}
		 -> "apple/banana/orange"
		 
		 4. 문자열 타입의 숫자(num), 원래 진법(base_from), 바꾸려는 진법(base_to)
		 를 전달받으면 base_from의 진법이었던 num을
		 base_to 진법의 문자열로 반환하여 반환하는 함수를 만들어 보세요
		 ※ 만약, 진법이 잘못된 경우 null을 반환합니다.
		 ※ 변환할 수 있는 최대 진법은 36진법이고, 최소 진법은 2입니다.
		 */

		
		range(10, 5);
		range2(4, 2);
		String[] fruits = {"apple", "banana", "orange"};
		join(fruits);
		
		System.out.println();
		System.out.println(Arrays.toString(range1_1(5, 20)));
		// # 함수의 오버로딩
		// - 같은 함수이름으로 다양한 형태의 함수를 정의할 수있다
		// - 다른 형태의 함수로 인정받기 위해서는
		//	 매개변수의 개수 혹은 타입이 달라야 한다
		System.out.println(Arrays.toString(range1_1(5)));
		
		// println은 다양한 매개변수 타입을 받을 수 있도록 오버로딩 되어있다
		System.out.println(123);
		System.out.println("123");
		System.out.println('a');
		System.out.println(123.123);
		
		System.out.println(join1_1(fruits));
		
		System.out.println(convert_base("1010", 2, 8));
		
	}
}




