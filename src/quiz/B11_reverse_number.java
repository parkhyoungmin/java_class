package quiz;

import java.util.Scanner;

public class B11_reverse_number {

	public static void main(String[] args) {
		
		/*
		 ����ڷκ��� ������ �ϳ� �Է¹ް� �� ������ ���� �ڸ����� ������� ����غ�����
		 */
		
		

		Scanner sc = new Scanner(System.in);
			
		System.out.print("���� �Է�> ");
		int num = sc.nextInt();            
		
		int reversed = 0;
		
		while (true) { 			
//			System.out.print(num % 10); // �����ڸ� ����
			
			reversed += num % 10;
			
			num /= 10;
			
			if (num <= 0) {
				break;
			}
			reversed *= 10;
		}
		System.out.println(reversed);
		
		
		
		
		
		
		

	}
}














