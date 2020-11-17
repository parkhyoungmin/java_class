package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {

	public static void main(String[] args) {
		
		//사용자가 입력한 문자열에 영어가 포함되어 있으면 true를 출력
		// 없으면 false를출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자입력 -> ");
		String user = sc.nextLine();
		
//		for (int i = 0; i <= user.length()-1; i++) {
//			if ((65 <= () user.charAt(i) &&  (int) user.charAt(i) <= 90) ||
//					(97 <= (int) user.charAt(i) &&  (int) user.charAt(i) <= 122)) {
//			} 
//		}
		
		
		
		
//		boolean alp = false;
//		
//		for (int i = 0; i <= user.length()-1; i++) {
//			
//			if ((user.charAt(i) >= 'A' && user.charAt(i) <= 'Z') ||
//					(user.charAt(i) >= 'a' && user.charAt(i) <= 'z')) {
//				alp = true;
//				break;
//			} 
//		}	
//		System.out.println(alp);
		
		
		boolean alp2 = true;
		
		for (int i = user.length() - 1; 0 <= user.length()-1; i--) {
			
			if (!(user.charAt(i) >= 'A' && user.charAt(i) <= 'Z') ||
					!(user.charAt(i) >= 'a' && user.charAt(i) <= 'z')) {
				alp2 = false;
				break;
			}
		}
		System.out.println(alp2);
		
		
		
		String str = new Scanner(System.in).nextLine();
		
		boolean result = false;
		//str.length()를 한번만 호출하는 방식
		for (int i = 0, len = str.length(); i < len ; i++) {
			char ch = str.charAt(i);
			
			if ((user.charAt(i) >= 'A' && user.charAt(i) <= 'Z') ||
					(user.charAt(i) >= 'a' && user.charAt(i) <= 'z')) {
				result = true;
				break;
			}	
		}
		System.out.println(result);
		
		
		
		
		

	}

}
















