package quiz;

public class C01_functionQuiz {

	
	// 1.
	public static boolean alphabet(char ch) {
		if (ch >= 'a' && ch <= 'z' ||
				ch >= 'A' && ch <= 'Z') {
			return true;
		} else {
			return false;
		}
	}
	// 1.
	public static boolean checkEng(char ch) {
		return (ch >= 'a' && ch <= 'z' ||
				ch >= 'A' && ch <= 'Z');
	}
	
	
	// 2.
	public static boolean threeMulti(int num) {
		if (num % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
	// 2.
	public static boolean checkMul3(int num) {
		return num % 3 == 0;
	}

	
	// 3.
	public static void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	// 3.
	public static String checkEvenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}
	
	
	// 4.
	public static boolean decimal(int num) {
		boolean temp = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp = false;
				break;
			}
		}
		return temp;
	}
	// 4.
	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		double sqrt = Math.sqrt(num);
		for (int i = 2; i < sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	
	// 5.
	public static int factorial(int num) {
		int result = 1;
		while (1 <= num) {
			result = result * num;
			num--;
		}
		return result;
	}
	// 5.
	public static int chckfactorial(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			result *= i;
		}
		return result;
	}
	// 5.
	// 재귀 함수 : 자기 자신을 부르는 함수 (성능 안좋고 읽기 힘들고 머리도 아프고)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * recursive_factorial(num - 1);
	}
	
	
	// 6.
	public static int squared(int a, int b) { 
		int result = 1;
		if (a == 0) {
			return 0;
		}
		else if (b == 0) {
			return 1;
		} else {
			for (int i = 1; i <= b; i++) {
				result = result * a;
			}
			return result;
		}
	}
	// 6.
	public static int recursive_pow(int a, int b) {
		if (a == 0) {
			return 0;
		}
		else if (b == 0) {
			return 1;
		} else {
			return a * recursive_pow(a, b-1);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		/*
		 # 다음 함수를 정의해보세요
		 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
		 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
		 3. 숫자를 한 개 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
		 4. 전달한 숫자가 소수인지 아닌지 판별해주는 함수 (boolean)
		 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
		 	factorial : (n)*(n-1)*(n-2) ... 3*2*1
		 6. 숫자 두개(a, b)를 전달하면 a의 b제곱을 반환하는 함수
		 	(0제곱은 1을 반환해야함, Math.pow 금지)
		 */
		
		System.out.println(alphabet('s'));
		System.out.println(threeMulti(9));
		evenOdd(5);
		System.out.println(decimal(15));
		System.out.println(factorial(5));
		System.out.println(squared(4, 2));
		System.out.println(recursive_pow(6, 2));
	}
}


















