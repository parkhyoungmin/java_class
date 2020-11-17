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
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
	// 3.
	public static String checkEvenOdd(int num) {
		return num % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
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
	// ��� �Լ� : �ڱ� �ڽ��� �θ��� �Լ� (���� ������ �б� ����� �Ӹ��� ������)
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
		 # ���� �Լ��� �����غ�����
		 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		 3. ���ڸ� �� �� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
		 4. ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)
		 5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
		 	factorial : (n)*(n-1)*(n-2) ... 3*2*1
		 6. ���� �ΰ�(a, b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
		 	(0������ 1�� ��ȯ�ؾ���, Math.pow ����)
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


















