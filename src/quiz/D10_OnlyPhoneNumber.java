package quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	/*
	 ����ڷκ��� ��ȭ��ȣ�� �Է¹޾ƺ�����.
	 ��ȭ��ȣ ���°� �ƴ� ��� ���� �޼����� ��� �� �ٽ� �Է��ؾ��մϴ�.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pattern matchPhoneNumber = Pattern.compile("[\\d{3}]-[\\d{4}]-[\\d{4}]");
		
		System.out.print("��ȭ��ȣ �Է� >");
		String phoneNumber = sc.nextLine();
		if (matchPhoneNumber.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}", phoneNumber)) {
			System.out.println(phoneNumber);
		} else {
			System.err.println("�߸��� �Է��Դϴ�");
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
//				System.out.println("�ùٸ� ��ȭ��ȣ");
//				break;
//			} else {
//				System.out.println("�߸��� ��ȭ��ȣ");
//			}
//		}
//		System.out.println("Tel : " + phoneNumber);
		
		
		
		
	}
	
	
	
}


















