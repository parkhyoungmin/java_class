package quiz;

import java.util.Scanner;

public class B09_printReverse {

	public static void main(String[] args) {
		
		// 사용자가 문장을 입력하면 그 문장을 거꾸로 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 > ");
		String user = sc.nextLine();
// 		String user = new Scanner(System.in).nextLine();
		System.out.println("입력한 문장 : " + user);
	
//		String str = "hello";
//		str += ", world";
		
		// # StringBuilder는 +=대신 append() 함수를 통해 문자열을 만든다
		StringBuilder str = new StringBuilder("Hello");
		str.append(", World!");
		
		// 다 만들고 난 뒤에 String으로 변환해서 사용하면 된다
		String build_result = str.toString();;
		System.out.println(build_result);
		
		// 거꾸로 만든 문자열을 저장할 변수
		StringBuilder reverse = new StringBuilder();
		System.out.print("거꾸로 한 문장 -> ");
		for (int i = (user.length()-1); 0 <= i; i--) {
			reverse.append(user.charAt(i));
		}
			System.out.print(reverse);
		
		
			

	}

}














