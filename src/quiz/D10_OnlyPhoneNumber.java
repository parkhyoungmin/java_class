package quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	/*
	 사용자로부터 전화번호만 입력받아보세요.
	 전화번호 형태가 아닐 경우 에러 메세지를 출력 후 다시 입력해야합니다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pattern matchPhoneNumber = Pattern.compile("[\\d{3}]-[\\d{4}]-[\\d{4}]");
		
		System.out.print("전화번호 입력 >");
		String phoneNumber = sc.nextLine();
		if (matchPhoneNumber.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}", phoneNumber)) {
			System.out.println(phoneNumber);
		} else {
			System.err.println("잘못된 입력입니다");
		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		String phoneNumber = null;
//		String regex = "01[01679]-[\\d]{3,4}-[\\d]{4}";
//		
//		while(true) {
//			System.out.print("Tel > ");
//			phoneNumber = sc.nextLine();
//			
//			if (Pattern.matches(regex, phoneNumber)) {
//				System.out.println("올바른 전화번호");
//				break;
//			} else {
//				System.out.println("잘못된 전화번호");
//			}
//		}
//		System.out.println("Tel : " + phoneNumber);
		
		
		
		
	}
	
	
	
}


















