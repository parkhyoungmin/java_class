package quiz;

import java.util.Scanner;

public class B09_strupcase {

	public static void main(String[] args) {
		
		/*
		 �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ��������
		 �� ������ �Ѽյ��� �ʰ�, ���ο� ���ڿ��� �����Ǿ�� ��
		 */
		
//		System.out.println("abc".toUpperCase()); -> ���� �ʰ�
//		System.out.println("ABC".toLowerCase());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� -> ");
		String num = sc.nextLine();
		
		StringBuilder str = new StringBuilder();
		
		System.out.print("���� �� ���� -> ");
		for (int i = 0; i <= num.length()-1; i++) {
			char ch = num.charAt(i);
			
			if (ch >= 'a' && ch <= 'z' ) {
				// Math.abs Ȱ��, ǥ
//				ch -= Math.abs('a' - 'A');  
//				ch -= Math.abs('A' - 'a');
				ch = (char)(ch - 'A' + 'a');
//				ch -= 32;
			}
			str.append(ch);
		}
		System.out.print(str);
		


		
	}

}














