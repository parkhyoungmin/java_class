package quiz;

import java.util.Scanner;

public class B09_printReverse {

	public static void main(String[] args) {
		
		// ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� > ");
		String user = sc.nextLine();
// 		String user = new Scanner(System.in).nextLine();
		System.out.println("�Է��� ���� : " + user);
	
//		String str = "hello";
//		str += ", world";
		
		// # StringBuilder�� +=��� append() �Լ��� ���� ���ڿ��� �����
		StringBuilder str = new StringBuilder("Hello");
		str.append(", World!");
		
		// �� ����� �� �ڿ� String���� ��ȯ�ؼ� ����ϸ� �ȴ�
		String build_result = str.toString();;
		System.out.println(build_result);
		
		// �Ųٷ� ���� ���ڿ��� ������ ����
		StringBuilder reverse = new StringBuilder();
		System.out.print("�Ųٷ� �� ���� -> ");
		for (int i = (user.length()-1); 0 <= i; i--) {
			reverse.append(user.charAt(i));
		}
			System.out.print(reverse);
		
		
			

	}

}














