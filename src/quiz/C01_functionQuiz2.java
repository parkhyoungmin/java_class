package quiz;

import java.util.Arrays;

public class C01_functionQuiz2 {

	// 1.�ּҰ��� �ּҰ��� �Ű������� �ް�, �� ������ ��� ���� �����ϴ�
	//	 int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ��������
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
	
	
	// 2. �ִ밪�� �Ű������� ���޹�����, 0���� �ִ밪 �̸��� ��� ���� �����ϴ�
	//	 range2 �Լ��� ��������
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
	public static int[] range1_1(int max) { // range1_1�� �����̸� ��밡�� - (�Լ������ε�)
		int[] arr = new int[max];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	
	// 3. ���ڿ� �迭�� ���޹�����, �ش� �迭�� ��� "/"�� �ٿ� �̾���̴�
	//	 join �Լ��� ��������
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
				result.append(arr[i]); // ù��° ���Ϻ��� �̾Ƶΰ�
			} else {
				result.append("/"+ arr[i]);
			}
		}
		return result.toString();
	}
	
	
	// 4. ���ڿ� Ÿ���� ����(num), ���� ����(base_from), �ٲٷ��� ����(base_to)
	//	 �� ���޹����� base_from�� �����̾��� num��
	//	 base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ����� ������
	//	 �� ����, ������ �߸��� ��� null�� ��ȯ�մϴ�.
	//	 �� ��ȯ�� �� �ִ� �ִ� ������ 36�����̰�, �ּ� ������ 2�Դϴ�.
	
	public static char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public static char getSymbol(int value) { // digits �����ڸ��� return
		return digits[value];
	}
	
	public static int getValue(char digit) {
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == digit) { // 0 ~ Z ���� ã�Ƽ� ����
				return i;
			}
		}
		return -1;
	}
	
	public static String convert_base(String num, int base_from, int base_to) {
		num = num.toUpperCase();
		
		if (base_from < 2 || base_from > 36 || base_to < 2 || base_to > 36) { // �������� Ȯ��
			System.err.println("RadixError : ��밡���� ������ 2���� 36�Դϴ�.");
			return null;
		}
		
		int pow = num.length() - 1;
		long real_value = 0;
		
		for (int i = pow; i > -1; i--) { // �� ���ڸ����� 1���ڸ����� for��
			
			char digit = num.charAt(pow - i); // num�� 0��°���� ~
			int value = getValue(digit); // num�� 0��°�� �ִ� �ܾ Ž���ؼ� for�� 'i'��° i�� ���ڷ� ����
			
			// ���� ��� 8�����ε� 8�̻��� ���ڰ� ������ �����ϱ�
			if (value >= base_from) {
				System.err.println("base_from �̻��� ���� ���� ���ڰ� �ֽ��ϴ�");
				return null;
			}
			
			System.out.println(digit); // 3
			System.out.println("������: " + value); // ������� 1010 �̸� 2��1�� ���ϱ� 1 �ؼ� ���ϰ� �Ϸ���
			System.out.println(Math.pow(base_from, i) + "�� �ڸ�"); 
			
			real_value += value * Math.pow(base_from, i); // 1*8���ڸ� + 1*2���ڸ�
		}
		
		System.out.println(base_from + "���� ���ڿ� " + num + "�� ���� ������" + real_value + "�Դϴ�.");
		
		StringBuilder result = new StringBuilder();
		
		// 123456�� 10���� 123456���� ��ȯ�ϴ� ���
		
		while (real_value > 0) {
			result.append(getSymbol((int)(real_value % base_to))); 
			real_value /= base_to; 
		}
		return result.reverse().toString();
	}
		
			
	public static void main(String[] args) {
		
		/*
		 1. �ּҰ��� �ּҰ��� �Ű������� �ް�, �� ������ ��� ���� �����ϴ�
		 int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ��������
		 
		 2. �ִ밪�� �Ű������� ���޹�����, 0���� �ִ밪 �̸��� ��� ���� �����ϴ�
		 range2 �Լ��� ��������
		 
		 3. ���ڿ� �迭�� ���޹�����, �ش� �迭�� ��� �̾���̴�
		 join �Լ��� ��������
		 ex : {"apple", "banana", "orange"}
		 -> "apple/banana/orange"
		 
		 4. ���ڿ� Ÿ���� ����(num), ���� ����(base_from), �ٲٷ��� ����(base_to)
		 �� ���޹����� base_from�� �����̾��� num��
		 base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ����� ������
		 �� ����, ������ �߸��� ��� null�� ��ȯ�մϴ�.
		 �� ��ȯ�� �� �ִ� �ִ� ������ 36�����̰�, �ּ� ������ 2�Դϴ�.
		 */

		
		range(10, 5);
		range2(4, 2);
		String[] fruits = {"apple", "banana", "orange"};
		join(fruits);
		
		System.out.println();
		System.out.println(Arrays.toString(range1_1(5, 20)));
		// # �Լ��� �����ε�
		// - ���� �Լ��̸����� �پ��� ������ �Լ��� ������ ���ִ�
		// - �ٸ� ������ �Լ��� �����ޱ� ���ؼ���
		//	 �Ű������� ���� Ȥ�� Ÿ���� �޶�� �Ѵ�
		System.out.println(Arrays.toString(range1_1(5)));
		
		// println�� �پ��� �Ű����� Ÿ���� ���� �� �ֵ��� �����ε� �Ǿ��ִ�
		System.out.println(123);
		System.out.println("123");
		System.out.println('a');
		System.out.println(123.123);
		
		System.out.println(join1_1(fruits));
		
		System.out.println(convert_base("1010", 2, 8));
		
	}
}




