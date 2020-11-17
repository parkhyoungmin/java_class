package quiz;

import java.util.Scanner;

public class B11_reverse_number {

	public static void main(String[] args) {
		
		/*
		 사용자로부터 정수를 하나 입력받고 그 정수를 일의 자리부터 순서대로 출력해보세요
		 */
		
		

		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수 입력> ");
		int num = sc.nextInt();            
		
		int reversed = 0;
		
		while (true) { 			
//			System.out.print(num % 10); // 일의자리 숫자
			
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














